package com.capbpm.util.visio;

public class VisioShape  implements ISHAPE_CONSTANTS{

	private float ACT_WIDTH=1f;
	private float ACT_HEIGH=0.75f;

	private float GATE_WIDTH=0.4688f;
	private float GATE_HEIGH=0.4688f;
	
	private float EVENT_WIDTH=0.375f;
	private float EVENT_HEIGH=0.375f;

	private float END_WIDTH=0.375f;
	private float END_HEIGH=0.375f;
	
	private float START_WIDTH=0.375f;
	private float START_HEIGH=0.375f;
	
	private String type;
	private float x;
	private float y;
	private String id;
	private String name;
	private String xml;
	private float imgScaling=1f;
	
	private float bindx;
	private float bindy;
	public float getBindx() {
		return bindx;
	}

	public void setBindx(float bindx) {
		this.bindx = bindx;
	}

	public float getBindy() {
		return bindy;
	}

	public void setBindy(float bindy) {
		this.bindy = bindy;
	}

	public VisioShape()
	{
		
	}
	
	public float getImgScaling() {
		return imgScaling;
	}

	public void setImgScaling(float imgScaling) {
		this.imgScaling = imgScaling;
	}

	public VisioShape(String name, String type, float x, float y, String id) {
		super();
		this.type = type;
		this.x = x;
		this.y = y;
		this.id = id;
		this.bindx=x;
		this.bindy = y;
		this.name = name;
		if (this.type.equalsIgnoreCase("A")) initActivity();
		if (this.type.equalsIgnoreCase("G")) initGateway();
		if (this.type.equalsIgnoreCase("E")) initEvent();
		if (this.type.equalsIgnoreCase("T")) initTimer();
		if (this.type.equalsIgnoreCase("END")) initEnd();
		if (this.type.equalsIgnoreCase("S")) initStart();
	}




	public float getACT_WIDTH() {
		return ACT_WIDTH;
	}




	public void setACT_WIDTH(float aCT_WIDTH) {
		ACT_WIDTH = aCT_WIDTH;
	}




	public float getACT_HEIGH() {
		return ACT_HEIGH;
	}




	public void setACT_HEIGH(float aCT_HEIGH) {
		ACT_HEIGH = aCT_HEIGH;
	}




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public float getX() {
		return x;
	}




	public void setX(float x) {
		this.x = x;
	}




	public float getY() {
		return y;
	}




	public void setY(float y) {
		this.y = y;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getXml() {
		return xml;
	}




	public void setXml(String xml) {
		this.xml = xml;
	}




	public void init()
	{
		if (type.equalsIgnoreCase("A"))
		{
			initActivity();
		}
		if (type.equalsIgnoreCase("T"))
		{
			initTimer();
		}
		if (type.equalsIgnoreCase("G"))
		{
			initGateway();
		}
		if (type.equalsIgnoreCase("E"))
		{
			initEvent();
		}
		if (type.equalsIgnoreCase("END"))
		{
			initEnd();
		}
	}
	
	

	
	private void initActivity() {
		// make activities
		float defActivityWidthScaled =DEFAULT_ACTIVITY_WIDTH * imgScaling;
		float defActivityHeightScaled =DEFAULT_ACTIVITY_HEIGHT * imgScaling;

		float defActivityHalfWidth =defActivityWidthScaled/2f;
		float defActivityHalfHeight =defActivityHeightScaled/2f;
	
		String aClean = IACTIVITY.template;
		aClean = aClean.replaceAll("@@DEFAULT_ACTIVITY_WIDTH@@", ""+defActivityWidthScaled);
		aClean = aClean.replaceAll("@@DEFAULT_ACTIVITY_HEIGHT@@", ""+defActivityHeightScaled);
		aClean = aClean.replaceAll("@@DEFAULT_ACTIVITY_HALF_WIDTH@@", ""+defActivityHalfWidth);
		aClean = aClean.replaceAll("@@DEFAULT_ACTIVITY_HALF_HEIGHT@@", ""+defActivityHalfHeight);
		
		xml = makeActivity(aClean, name, ""+x, ""+y, id);
	}
	
	private void initEvent() {
		// make activities
		float defWidthScaled =DEFAULT_EVENT_WIDTH * imgScaling;
		float defHeightScaled =DEFAULT_EVENT_HEIGHT * imgScaling;

		float defWeightHalfScaled =defWidthScaled/2f;
		float defHeightHalfScaled =defHeightScaled/2f;

		String clean = IEVENT.template;
		clean = clean.replaceAll("@@DEFAULT_EVENT_WIDTH@@", ""+defWidthScaled);
		clean = clean.replaceAll("@@DEFAULT_EVENT_HEIGHT@@", ""+defHeightScaled);
		clean = clean.replaceAll("@@DEFAULT_EVENT_HALF_WEIGHT@@", ""+defWeightHalfScaled);
		clean = clean.replaceAll("@@DEFAULT_EVENT_HALF_HEIGHT@@", ""+defHeightHalfScaled);
		
		xml = makeEvent(clean, name, ""+x, ""+y, id);
	}
	private void initTimer() {
		// make activities
		float defWidthScaled =DEFAULT_TIMER_WIDTH * imgScaling;
		float defHeightScaled =DEFAULT_TIMER_HEIGHT * imgScaling;

		float defWeightHalfScaled =defWidthScaled/2f;
		float defHeightHalfScaled =defHeightScaled/2f;

		String clean = ITIMER.template;
		clean = clean.replaceAll("@@DEFAULT_TIMER_WIDTH@@", ""+defWidthScaled);
		clean = clean.replaceAll("@@DEFAULT_TIMER_HEIGHT@@", ""+defHeightScaled);
		clean = clean.replaceAll("@@DEFAULT_TIMER_HALF_WEIGHT@@", ""+defWeightHalfScaled);
		clean = clean.replaceAll("@@DEFAULT_TIMER_HALF_HEIGHT@@", ""+defHeightHalfScaled);
		
		xml = makeTimer(clean, name, ""+x, ""+y, id);
	}
	private void initEnd() {
		// make activities
		float defWidthScaled =DEFAULT_END_WIDTH * imgScaling;
		float defHeightScaled =DEFAULT_END_HEIGHT * imgScaling;

		float defWeightHalfScaled =defWidthScaled/2f;
		float defHeightHalfScaled =defHeightScaled/2f;

		String clean = IEND.template;
		clean = clean.replaceAll("@@DEFAULT_END_WIDTH@@", ""+defWidthScaled);
		clean = clean.replaceAll("@@DEFAULT_END_HEIGHT@@", ""+defHeightScaled);
		clean = clean.replaceAll("@@DEFAULT_END_HALF_WEIGHT@@", ""+defWeightHalfScaled);
		clean = clean.replaceAll("@@DEFAULT_END_HALF_HEIGHT@@", ""+defHeightHalfScaled);
		
		xml = makeEnd(clean, name, ""+x, ""+y, id);
	}

	private void initStart() {
		// make activities
		float defWidthScaled =DEFAULT_START_WIDTH * imgScaling;
		float defHeightScaled =DEFAULT_START_HEIGHT * imgScaling;

		float defWeightHalfScaled =defWidthScaled/2f;
		float defHeightHalfScaled =defHeightScaled/2f;

		String clean = ISTART.template;
		clean = clean.replaceAll("@@DEFAULT_START_WIDTH@@", ""+defWidthScaled);
		clean = clean.replaceAll("@@DEFAULT_START_HEIGHT@@", ""+defHeightScaled);
		clean = clean.replaceAll("@@DEFAULT_START_HALF_WIDTH@@", ""+defWeightHalfScaled);
		clean = clean.replaceAll("@@DEFAULT_START_HALF_HEIGHT@@", ""+defHeightHalfScaled);
	
		
		xml = makeStart(clean, name, ""+x, ""+y, id);
	}
	
	private void initGateway() {
		// make activities
		float defGatewayWidthScaled =DEFAULT_GATEWAY_WIDTH * imgScaling;
		float defGatewayHeightScaled =DEFAULT_GATEWAY_HEIGHT * imgScaling;

		float defGatewayWeightHalfScaled =defGatewayWidthScaled/2f;
		float defGatewayHeightHalfScaled =defGatewayHeightScaled/2f;

		String gClean = IGATEWAY.template;
		gClean = gClean.replaceAll("@@DEFAULT_GATEWAY_WIDTH@@", ""+defGatewayWidthScaled);
		gClean = gClean.replaceAll("@@DEFAULT_GATEWAY_HEIGHT@@", ""+defGatewayHeightScaled);
		gClean = gClean.replaceAll("@@DEFAULT_GATEWAY_HALF_WEIGHT@@", ""+defGatewayWeightHalfScaled);
		gClean = gClean.replaceAll("@@DEFAULT_GATEWAY_HALF_HEIGHT@@", ""+defGatewayHeightHalfScaled);
		
		xml = makeGateway(gClean, name, ""+x, ""+y, id);
	}
	private static String makeGateway(String content, String n, String x, String y, String id) {
		////
		content = content.replaceAll("@@GATEWAY_NAME@@", n);
		content = content.replaceAll("@@GATEWAY_X@@", x);
		content = content.replaceAll("@@GATEWAY_Y@@", y);
		content = content.replaceAll("@@GATEWAY_ID@@", id);
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
	private static String makeEnd(String content, String n, String x, String y, String id) {
		////
		content = content.replaceAll("@@END_NAME@@", n);
		content = content.replaceAll("@@END_X@@", x);
		content = content.replaceAll("@@END_Y@@", y);
		content = content.replaceAll("@@END_ID@@", id);
		return content;
	}
	
	private static String makeStart(String content, String n, String x, String y, String id) {
		////
		content = content.replaceAll("@@START_NAME@@", n);
		content = content.replaceAll("@@START_X@@", x);
		content = content.replaceAll("@@START_Y@@", y);
		content = content.replaceAll("@@START_ID@@", id);
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
	private static String makeActivity(String content, String n, String x, String y, String id) {
		////
		content = content.replaceAll("@@ACTIVITY_NAME@@", n);
		content = content.replaceAll("@@ACTIVITY_X@@", x);
		content = content.replaceAll("@@ACTIVITY_Y@@", y);
		content = content.replaceAll("@@ACTIVITY_ID@@", id);

		return content;
	}

	public float[] getPosition(int pos)
	{
		float[] retval = {x,y};
		getPositionsForActivities(pos, retval);
		getPositionsForGateways( pos, retval);
		getPositionsForEventsAndTimers( pos, retval);
		
		return retval;
	}

	private void getPositionsForEventsAndTimers(int pos, float[] retval) {
		if (type.equalsIgnoreCase("E") || type.equalsIgnoreCase("T") )
		{
			if (pos==1 || pos==7 || pos==8)
			{
				retval[0]= x - EVENT_WIDTH/2;
			}

			if (pos==3 || pos==4 || pos==5)
			{
				retval[0]= x + EVENT_WIDTH/2;
			}

			if (pos==1 || pos==2 || pos==3)
			{
				retval[1]= y + EVENT_HEIGH/2;
			}	

			if (pos==5 || pos==6 || pos==7)
			{
				retval[1]= y - EVENT_HEIGH/2;
			}	
			bindx = retval[0];
			bindy = retval[1];
		}
	}
	private void getPositionsForGateways(int pos, float[] retval) {
		if (type.equalsIgnoreCase("G"))
		{
			if (pos==1 || pos==7 || pos==8)
			{
				retval[0]= x - GATE_WIDTH/2;
			}

			if (pos==3 || pos==4 || pos==5)
			{
				retval[0]= x + GATE_WIDTH/2;
			}

			if (pos==1 || pos==2 || pos==3)
			{
				retval[1]= y + GATE_HEIGH/2;
			}	

			if (pos==5 || pos==6 || pos==7)
			{
				retval[1]= y - GATE_HEIGH/2;
			}	
			bindx = retval[0];
			bindy = retval[1];
		}
	}
	private void getPositionsForActivities(int pos, float[] retval) {
		if (type.equalsIgnoreCase("A"))
		{
			if (pos==1 || pos==7 || pos==8)
			{
				retval[0]= x - ACT_WIDTH/2;
			}

			if (pos==3 || pos==4 || pos==5)
			{
				retval[0]= x + ACT_WIDTH/2;
			}

			if (pos==1 || pos==2 || pos==3)
			{
				retval[1]= y + ACT_HEIGH/2;
			}	

			if (pos==5 || pos==6 || pos==7)
			{
				retval[1]= y - ACT_HEIGH/2;
			}
			
			bindx = retval[0];
			bindy = retval[1];
		}
	}
	
}
