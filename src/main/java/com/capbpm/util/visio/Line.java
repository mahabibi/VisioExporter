package com.capbpm.util.visio;

public class Line implements ISHAPE_CONSTANTS {
	VisioShape start;
	String name;
	String id = "" + new java.util.Random().nextInt(100000);
	int startConnectionVertix=0;
	int endConnectionVertix=0;
	VisioShape end;
	String line;
	String connection;
	String xml;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getXml() {
		return xml;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}

	public Line(String name, VisioShape start, int startConnectionVertix, VisioShape end, int endConnectionVertix) {
		super();
		this.name =name;
		this.start = start;
		this.startConnectionVertix = startConnectionVertix;
		this.endConnectionVertix = endConnectionVertix;
		this.end = end;
		init();
	}

	private  void init() {
		////
		String content = ILINE.template;
		start.getPosition(startConnectionVertix);
		end.getPosition(endConnectionVertix);
		
		content = content.replaceAll("@@LINE_LABEL@@", name);
		content = content.replaceAll("@@LINE_START_X@@", "" + start.getBindx());
		content = content.replaceAll("@@LINE_START_Y@@", "" + start.getBindy());

		content = content.replaceAll("@@LINE_END_X@@", "" + end.getBindx());
		content = content.replaceAll("@@LINE_END_Y@@", "" + end.getBindy());

		float floatMidX = (start.getBindx() + end.getBindx()) / 2f;
		float floatMidY = (start.getBindy() +  end.getBindy()) / 2f;

		float sx1 = floatMidX - Math.min(start.getBindx(),  end.getBindx());
		float sy1 = floatMidY - Math.max(start.getBindy(), end.getBindy());

		float vx = end.getBindx() - start.getBindx();
		float vy = start.getBindy() - end.getBindy();

		content = content.replaceAll("@@LINE_VERTIX_X@@", "" + vx);
		content = content.replaceAll("@@LINE_VERTIX_Y@@", "" + vy);
		content = content.replaceAll("@@LINE_PINX@@", "" + floatMidX);
		content = content.replaceAll("@@LINE_PINY@@", "" + floatMidY);
		content = content.replaceAll("@@LINE_LOC_PINX@@", "" + sx1);
		content = content.replaceAll("@@LINE_LOC_PINY@@", "" + sy1);

		content = content.replaceAll("@@LINE_ID@@", id);
		xml = content;
		
		
		content = ILINE.connectionTemplate;


		content = content.replaceAll("@@FROM_SHEET@@", start.getId());
		content = content.replaceAll("@@FROM_PART@@", ""+startConnectionVertix);
		content = content.replaceAll("@@TO_SHEET@@", end.getId());
		content = content.replaceAll("@@TO_PART@@",""+ endConnectionVertix);
		
		this.connection  =content;

		
		
		
		
	}
	public VisioShape getStart() {
		return start;
	}
	public void setStart(VisioShape start) {
		this.start = start;
	}
	public int getStartConnectionVertix() {
		return startConnectionVertix;
	}
	public void setStartConnectionVertix(int startConnectionVertix) {
		this.startConnectionVertix = startConnectionVertix;
	}
	public int getEndConnectionVertix() {
		return endConnectionVertix;
	}
	public void setEndConnectionVertix(int endConnectionVertix) {
		this.endConnectionVertix = endConnectionVertix;
	}
	public VisioShape getEnd() {
		return end;
	}
	public void setEnd(VisioShape end) {
		this.end = end;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getConnection() {
		return connection;
	}
	public void setConnection(String connection) {
		this.connection = connection;
	}
	
	

}
