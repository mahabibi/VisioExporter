package com.capbpm.util.visio;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.capbpm.scout.exporter.model.process.Connection;
import com.capbpm.scout.exporter.model.process.Layer;
import com.capbpm.scout.exporter.model.process.Node;
import com.capbpm.scout.exporter.model.process.NodeType;
import com.capbpm.scout.exporter.model.process.Swimlane;

@Service
public class VisioExporter {
	final private static SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
	final private static String template = "template6.vdx";
	final private static String act_fragment = "fragments/activity_fragment.vdx";
	final private static String gateway_fragment = "fragments/gateway_fragment.vdx";
	final private static String swimlane_fragment = "fragments/swimlane_fragment.vdx";
	final private static String line_fragment = "fragments/line_fragment.vdx";
	final private static String event_fragment = "fragments/event_fragment.vdx";
	final private static String timer_fragment = "fragments/timer_fragment.vdx";

	@Autowired
	private ResourceLoader resourceLoader;
	
	public String export(Layer layer) {
		
		String src = getFileContent(template);

		// heading
		src = VisioUtil3.createHeading(layer.getName(), "Max Young", sdf.format(new Date()), src);
		// src = makePool(src);

		// start
		src = VisioUtil3.makeStart(src);

		// make swimlanes
		String swimlanes = "";
		for( Swimlane sl: layer.getSwimlaneList() ) {
			String sClean = getFileContent(swimlane_fragment);
			// need to get x, y, widht, height
			swimlanes += VisioUtil3.makeSwimlane(sClean, sl.getName(), "5.4531", "4.5", "26", 10.0938f, 6.0f);
		}
		
		Map<String, VisioShape> shapes = new HashMap<>();
		
		String nodes = "";
		for( Node node: layer.getNodeList() ) {
			final VisioShape shape = new VisioShape(node.getName(), getType(node.getType()), node.getX(), node.getY(), node.getUuid());
			shapes.put(node.getUuid(), shape);
			nodes += shape.getXml();
		}
		
//		String sClean = getFileContent(swimlane_fragment);
//		String s1 = makeSwimlane(sClean, "Request Vacation", "5.4531", "4.5", "26", 10.0938f, 6.0f);
		
//		VisioShape vStart1 = new VisioShape( "Start", "S", 2.5938f, 5.0219f, "707");

		// make activities
//		VisioShape vs1 = new VisioShape( "XRequest Vacation", "A", 2.5938f, 5.0219f, "77");
//		VisioShape vs2 = new VisioShape( "XReview Vacation", "A", 5.75f, 6.0938f, "87");
//		VisioShape vs3 = new VisioShape( "XApprove Vacation", "A", 5.875f, 3.375f, "97");
//
//		// make gateways
//		VisioShape vg1 = new VisioShape( "check1", "G", 4.2344f, 5.0118f, "34");
//		VisioShape vg3 = new VisioShape( "check3", "G", 7.5938f, 5.0118f, "197");

		// make links
		String links = "";
		for( Connection conn: layer.getConnectionList() ) {
			String lClean = getFileContent(line_fragment);
			links += VisioUtil3.makeConnection(
				lClean, 
				conn.getLabel(), 
				shapes.get(conn.getSource().getUuid()), 
				conn.getSourcePort(), 
				shapes.get(conn.getTarget().getUuid()), 
				conn.getTargetPort(), 
				conn.getLabel());
			
		}
		//String l1 = makeConnection(lClean, "check or cash", vs1.getPosition(2)[0], vs1.getPosition(2)[1], vs2.getPosition(8)[0], vs2.getPosition(8)[1], "3");
//		String l1 = makeConnection(lClean, "first", vs1, 5,vg1,11, "3");
//		String l2 = makeConnection(lClean, "second", vg1, 2,vs2,11, "4");
//		String l3 = makeConnection(lClean, "3rd", vg1, 5,vs3,11, "5");
//		String l4 = makeConnection(lClean, "fourth", vs2, 5,vg3,2, "6");
//		String l5 = makeConnection(lClean, "fifth", vs3, 5,vg3,8, "7");
		//String l2 = makeConnection(lClean, "Credit Card", 3.4844f, 4.7844f, 5.375f, 3.375f, "4");	
		
		src = src.replaceAll("@@SHAPES@@", nodes /*+ links*/ );
		src = src.replaceAll("@@CONNZ@@", "" /*+ links*/ );
		
		src = src.replaceAll("@SWIM_AND_POOL", swimlanes);
		src = src.replaceAll("@@POOL_NAME@@", "Da Pool");

		// make end
		src = VisioUtil3.makeEnd(src);

		// pool
		// String poolFrag = getFileContent(src);
		// poolFrag =makePool(src);

		// end
		// String endFrag = getFileContent(src);
		// endFrag =makeEnd(src);

		// src =doIt(src, target,"@TEMPLATE_POOL",poolFrag);
		return src;
	}

	private String getType(NodeType type) {
		switch( type ) {
			case START:
			case START_MESSAGE:
				return "S";
			case ACTIVITY:
				return "A";
			case END:
			case GATEWAY_INCLUSIVE:
			case GATEWAY_PARALLEL:
			case GATEWAY_XOR:
				return "G";
			case LINK:
			case LINKED_PROCESS:
			case MAPPER:
			case SUBPROCESS:
			case TIMER:
			default:
				return "A";
		}
	}
	
	private String getFileContent(String name) {
		final Resource fileResource = resourceLoader.getResource("classpath:"+name);
		try(
			InputStream is = fileResource.getInputStream();
			ByteArrayOutputStream result = new ByteArrayOutputStream();
			){
			byte[] buffer = new byte[16384];
			int length;
			while ((length = is.read(buffer)) != -1) {
			    result.write(buffer, 0, length);
			}
			return result.toString(StandardCharsets.UTF_8.name());			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
