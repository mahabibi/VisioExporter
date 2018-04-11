package com.capbpm.util.visio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.capbpm.scout.exporter.model.process.Node;

public class VisioUtil3 implements ISHAPE_CONSTANTS {


	public static VisioShape parseNode(Node n)
	{

		VisioShape retval = new VisioShape();
		retval.setType(n.getType().toString());
		
		retval.setType(n.getType().toString());
		retval.setType(n.getType().toString());
		retval.setType(n.getType().toString());
		retval.setType(n.getType().toString());
		
		retval.setX(n.getX());
		retval.setY(n.getY());
		retval.setName(n.getName());
		retval.setId(n.getUuid());
		retval.init();
		
		return retval;
		
	}

	public static void main(String args[]) {

		float IMAGE_SCALING = 1f;
		float defActivityWidthScaled =DEFAULT_ACTIVITY_WIDTH * IMAGE_SCALING;
		float defActivityHeightScaled =DEFAULT_ACTIVITY_HEIGHT * IMAGE_SCALING;

		float defActivityHalfWidth =defActivityWidthScaled/2f;
		float defActivityHalfHeight =defActivityHeightScaled/2f;
	
		float defTimerWidthScaled =DEFAULT_TIMER_WIDTH * IMAGE_SCALING;
		float defTimerHeightScaled =DEFAULT_TIMER_HEIGHT * IMAGE_SCALING;

		float defEventWidthScaled =DEFAULT_EVENT_WIDTH * IMAGE_SCALING;
		float defEventHeightScaled =DEFAULT_EVENT_HEIGHT * IMAGE_SCALING;

		float defGatewayWidthScaled =DEFAULT_GATEWAY_WIDTH * IMAGE_SCALING;
		float defGatewayHeightScaled =DEFAULT_GATEWAY_HEIGHT * IMAGE_SCALING;

		String FOLDER_PATH = "C:\\Users\\max\\Documents\\GitHub\\VisioExporter\\src\\main\\resources\\";

		String template = FOLDER_PATH + "template6.vdx";
		// fragments
		// String pool_fragment="C:\\_citi\\sandbox\\fragments\\pool.vdx";
		// String end_fragment="C:\\_citi\\sandbox\\fragments\\end.vdx";
		String act_fragment = FOLDER_PATH + "fragments\\activity_fragment.vdx";
		String gateway_fragment = FOLDER_PATH + "fragments\\gateway_fragment.vdx";
		String swimlane_fragment = FOLDER_PATH + "fragments\\swimlane_fragment.vdx";
		String line_fragment = FOLDER_PATH + "fragments\\line_fragment.vdx";
		String event_fragment = FOLDER_PATH + "fragments\\event_fragment.vdx";
		String timer_fragment = FOLDER_PATH + "fragments\\timer_fragment.vdx";

		String target = FOLDER_PATH + "new.vdx";
		new File(target).delete();

		String src = getFileContent(template);

		// heading
		src = createHeading("Vacation Request", "Max Young", "4/8/2018", src);
		// src = makePool(src);

		// start
		src = makeStart(src);

		// make swimlanes
		String sClean = getFileContent(swimlane_fragment);
		String s1 = makeSwimlane(sClean, "Request Vacation", "5.4531", "4.5", "26", 10.0938f, 6.0f);
		
		VisioShape vStart1 = new VisioShape( "Start", "S", 2.5938f, 5.0219f, "707");

		// make activities
		VisioShape vs1 = new VisioShape( "XRequest Vacation", "A", 2.5938f, 5.0219f, "77");
		VisioShape vs2 = new VisioShape( "XReview Vacation", "A", 5.75f, 6.0938f, "87");
		VisioShape vs3 = new VisioShape( "XApprove Vacation", "A", 5.875f, 3.375f, "97");

		// make gateways
		VisioShape vg1 = new VisioShape( "check1", "G", 4.2344f, 5.0118f, "34");
		VisioShape vg3 = new VisioShape( "check3", "G", 7.5938f, 5.0118f, "197");



		// make lines
		String lClean = getFileContent(line_fragment);
		//String l1 = makeConnection(lClean, "check or cash", vs1.getPosition(2)[0], vs1.getPosition(2)[1], vs2.getPosition(8)[0], vs2.getPosition(8)[1], "3");
		String l1 = makeConnection(lClean, "first", vs1, 5,vg1,11, "3");
		String l2 = makeConnection(lClean, "second", vg1, 2,vs2,11, "4");
		String l3 = makeConnection(lClean, "3rd", vg1, 5,vs3,11, "5");
		String l4 = makeConnection(lClean, "fourth", vs2, 5,vg3,2, "6");
		String l5 = makeConnection(lClean, "fifth", vs3, 5,vg3,8, "7");
		//String l2 = makeConnection(lClean, "Credit Card", 3.4844f, 4.7844f, 5.375f, 3.375f, "4");	
		
		src = src.replaceAll("@@SHAPES@@", 
				/*vStart1.getXml() + */
				vs1.getXml() + vs2.getXml() + vs3.getXml() +
				vg1.getXml() + vg3.getXml() +
				l1 + l2  + l3 + l4 + l5 
				);
		
		src = src.replaceAll("@SWIM_AND_POOL", s1);
		src = src.replaceAll("@@POOL_NAME@@", "Da Pool");

		// make end
		src = makeEnd(src);

		// pool
		// String poolFrag = getFileContent(src);
		// poolFrag =makePool(src);

		// end
		// String endFrag = getFileContent(src);
		// endFrag =makeEnd(src);

		// src =doIt(src, target,"@TEMPLATE_POOL",poolFrag);
		src = setFileContent(target, src);

	}

	public static String doIt(String source, String target, String placeHolder, String replacement) {
		String content = "";
		try {
			// Path path = Paths.get(source);
			Path tpath = Paths.get(target);
			Charset charset = StandardCharsets.UTF_8;

			// String content = new String(Files.readAllBytes(path), charset);
			content = source.replaceAll(placeHolder, replacement);
			Files.write(tpath, content.getBytes(charset));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return content;
	}

	private static String makeSwimlane(String content, String n, String x, String y, String id, float pH, float pW) {
		////
		String poolHeight = "" + pH;
		String poolPercentHeight = "" + (pH / 2f);

		String poolWidth = "" + pW;
		String poolPercentWidth = "" + (pW / 2f);

		content = content.replaceAll("@@SWIMLANE_NAME@@", n);
		content = content.replaceAll("@@SWIMLANE_X@@", x);
		content = content.replaceAll("@@SWIMLANE_Y@@", y);
		content = content.replaceAll("@@SWIMLANE_ID@@", id);
		content = content.replaceAll("@@POOL_HEIGHT@@", poolHeight);// 10.0938
		content = content.replaceAll("@@POOL_PERCENT_HEIGHT@@", poolPercentHeight);// 5.0469

		content = content.replaceAll("@@POOL_WIDTH@@", poolWidth);// 4.00
		content = content.replaceAll("@@POOL_PERCENT_WIDTH@@", poolPercentWidth);// 2.00

		return content;
	}

	private static String makeConnection(String content, String n, VisioShape source, int sourceBindPosition, VisioShape target,  int TargetBindPosition, String id) {
		////
		source.getPosition(sourceBindPosition);
		target.getPosition(TargetBindPosition);
		
		content = content.replaceAll("@@LINE_LABEL@@", n);
		content = content.replaceAll("@@LINE_START_X@@", "" + source.getBindx());
		content = content.replaceAll("@@LINE_START_Y@@", "" + source.getBindy());

		content = content.replaceAll("@@LINE_END_X@@", "" + target.getBindx());
		content = content.replaceAll("@@LINE_END_Y@@", "" + target.getBindy());

		float floatMidX = (source.getBindx() + target.getBindx()) / 2f;
		float floatMidY = (source.getBindy() +  target.getBindy()) / 2f;

		float sx1 = floatMidX - Math.min(source.getBindx(),  target.getBindx());
		float sy1 = floatMidY - Math.max(source.getBindy(), target.getBindy());

		float vx = target.getBindx() - source.getBindx();
		float vy = source.getBindy() - target.getBindy();

		content = content.replaceAll("@@LINE_VERTIX_X@@", "" + vx);
		content = content.replaceAll("@@LINE_VERTIX_Y@@", "" + vy);
		content = content.replaceAll("@@LINE_PINX@@", "" + floatMidX);
		content = content.replaceAll("@@LINE_PINY@@", "" + floatMidY);
		content = content.replaceAll("@@LINE_LOC_PINX@@", "" + sx1);
		content = content.replaceAll("@@LINE_LOC_PINY@@", "" + sy1);

		content = content.replaceAll("@@LINE_ID@@", id);
		return content;
	}
	private static String makeConnection(String content, String n, float x, float y, float ex, float ey, String id) {
		////

		content = content.replaceAll("@@LINE_LABEL@@", n);
		content = content.replaceAll("@@LINE_START_X@@", "" + x);
		content = content.replaceAll("@@LINE_START_Y@@", "" + y);

		content = content.replaceAll("@@LINE_END_X@@", "" + ex);
		content = content.replaceAll("@@LINE_END_Y@@", "" + ey);

		float floatMidX = (x + ex) / 2f;
		float floatMidY = (y + ey) / 2f;

		float sx1 = floatMidX - Math.min(x, ex);
		float sy1 = floatMidY - Math.max(y, ey);

		float vx = ex - x;
		float vy = y - ey;

		content = content.replaceAll("@@LINE_VERTIX_X@@", "" + vx);
		content = content.replaceAll("@@LINE_VERTIX_Y@@", "" + vy);
		content = content.replaceAll("@@LINE_PINX@@", "" + floatMidX);
		content = content.replaceAll("@@LINE_PINY@@", "" + floatMidY);
		content = content.replaceAll("@@LINE_LOC_PINX@@", "" + sx1);
		content = content.replaceAll("@@LINE_LOC_PINY@@", "" + sy1);

		content = content.replaceAll("@@LINE_ID@@", id);
		return content;
	}

	private static String makeTimer(String content, String n, String x, String y, String id) {
		////

		content = content.replaceAll("@@TIMER_NAME@@", n);
		content = content.replaceAll("@@TIMER_X@@", x);
		content = content.replaceAll("@@TIMER_Y@@", y);
		content = content.replaceAll("@@TIMER_ID@@", id);
		return content;
	}

	private static String makeEvent(String content, String n, String x, String y, String id) {
		////

		content = content.replaceAll("@@EVENT_NAME@@", n);
		content = content.replaceAll("@@EVENT_X@@", x);
		content = content.replaceAll("@@EVENT_Y@@", y);
		content = content.replaceAll("@@EVENT_ID@@", id);
		return content;
	}

	private static String makeGateway(String content, String n, String x, String y, String id) {
		////
		content = content.replaceAll("@@GATEWAY_NAME@@", n);
		content = content.replaceAll("@@GATEWAY_X@@", x);
		content = content.replaceAll("@@GATEWAY_Y@@", y);
		content = content.replaceAll("@@GATEWAY_ID@@", id);
		return content;
	}

	private static String makeActivity(String content, String n, String x, String y, String id) {
		////
		content = content.replaceAll("@@ACTIVITY_NAME@@", n);
		content = content.replaceAll("@@ACTIVITY_X@@", x);
		content = content.replaceAll("@@ACTIVITY_Y@@", y);
		content = content.replaceAll("@@ACTIVITY_ID@@", id);

		return content;
	}

	private static String makeEnd(String endFrag) {
		////
		endFrag = endFrag.replaceAll("@@END_EVENT_NAME@@", "End");
		endFrag = endFrag.replaceAll("@@END_EVENT_MASTER_ID@@", "2");

		endFrag = endFrag.replaceAll("@@END_EVENT_ID@@", "5555");
		endFrag = endFrag.replaceAll("@@END_EVENT_SHEET_NAME@@", "endSheet");

		endFrag = endFrag.replaceAll("@@END_X@@", "9.6875");
		endFrag = endFrag.replaceAll("@@END_Y@@", "4.0219");

		return endFrag;
	}

	private static String makeStart(String content) {
		////
		content = content.replaceAll("@@START_EVENT_NAME@@", "Start");
		content = content.replaceAll("@@START_EVENT_MASTER_ID@@", "7");

		content = content.replaceAll("@@START_X@@", "1.1875");
		content = content.replaceAll("@@START_Y@@", "5.0219");

		return content;
	}

	private static String createHeading(String title, String author, String date, String content) {
		content = content.replaceAll("@@TITLE@@", title);
		content = content.replaceAll("@@AUTHOR@@", author);
		content = content.replaceAll("@@DATE@@", date);
		return content;
	}

	public static String getFileContent(String source) {
		String retval = "";
		try {
			Path path = Paths.get(source);
			Charset charset = StandardCharsets.UTF_8;

			retval = new String(Files.readAllBytes(path), charset);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return retval;
	}

	public static String setFileContent(String target, String content) {

		try {
			// Path path = Paths.get(source);
			Path tpath = Paths.get(target);
			Charset charset = StandardCharsets.UTF_8;

			Files.write(tpath, content.getBytes(charset));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return content;
	}

}