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

public class VisioUtil {

	  public static void main(String args[]) {
		  
		  	String FOLDER_PATH="C:\\Users\\max\\Documents\\GitHub\\VisioExporter\\src\\main\\resources\\";
	    	
		  	String template =FOLDER_PATH+ "template5_w_event_and_timer.vdx";
	    	//fragments
	    //	String pool_fragment="C:\\_citi\\sandbox\\fragments\\pool.vdx";
	    //	String end_fragment="C:\\_citi\\sandbox\\fragments\\end.vdx";
	    	String act_fragment=FOLDER_PATH+ "fragments\\activity_fragment.vdx";
	    	String gateway_fragment=FOLDER_PATH+ "fragments\\gateway_fragment.vdx";
	    	String swimlane_fragment =FOLDER_PATH+ "fragments\\swimlane_fragment.vdx";
	    	String line_fragment =FOLDER_PATH+ "fragments\\line_fragment.vdx";
	    	String event_fragment =FOLDER_PATH+ "fragments\\event_fragment.vdx";
	    	String timer_fragment = FOLDER_PATH +"fragments\\timer_fragment.vdx";
	    	
	    	
	    	String target = FOLDER_PATH+ "new.vdx";
	    	new File(target).delete();
	    	
	    	
	    	String src = getFileContent(template);
	    	
	    	
	    	//heading
	    	src = createHeading("Vacation Request","Max Young", "4/8/2018",src);	
	    	//src = makePool(src);
	    	
	    	//start
	    	src=makeStart(src);
	    	
	  
	    	//make swimlanes
	    	String sClean = getFileContent(swimlane_fragment);
	    	String s1=makeSwimlane(sClean,"Request Vacation","5.4531","4.5","26", 10.0938f, 6.0f);
	    	//String s2=makeSwimlane(sClean,"Review Vacation","4.5938","5.0219","87");
	    	//String s3=makeSwimlane(sClean,"Approve Vacation","6.5938","5.0219","97");

	    	//make activities
	    	String aClean = getFileContent(act_fragment);
	    	String a1=makeActivity(aClean,"Request Vacation","2.5938","5.0219","77");
	    	String a2=makeActivity(aClean,"Review Vacation","5.75","6.0938","87");
	    	String a3=makeActivity(aClean,"Approve Vacation","5.875","3.375","97");

	    	
	    	
	
	    	//make events
	    	String eClean = getFileContent(event_fragment);
	    	String e1=makeEvent(eClean,"event listener","5.8","5.3938","200");
	    	//String e2=makeGateway(eClean,"check2","5.5938","3.0219","210");
	    	//String e3=makeGateway(eClean,"check3","7.5938","5.0219","220");  
	
	    	//make timers
	    	String tClean = getFileContent(timer_fragment);
	    	String t1=makeTimer(tClean,"7 minutes","3.8","5.3938","300");
	    	//String t2=makeTimer(tClean,"3 minutes","1.5938","3.0219","210");
	    	//String e3=makeTimer(tClean,"9 minutes","9.5938","5.0219","220");  
	
	    	//make gateways
	    	String gClean = getFileContent(gateway_fragment);
	    	String g1=makeGateway(gClean,"check1","4.2344","5.0118","34");
	    	String g2=makeGateway(gClean,"check2","5.5938","3.0219","36");
	    	String g3=makeGateway(gClean,"check3","7.5938","5.0219","197");  
	    	
	  
	    	//make lines
	    	String lClean = getFileContent(line_fragment);
	    	String l1=makeConnection(lClean,"check or cash",3.4844f,5.2531f,5.25f,6.0938f,"3");
	    	String l2=makeConnection(lClean,"Credit Card",3.4844f,4.7844f,5.375f,3.375f,"4");

	    	
	    	src =src.replaceAll("@ACT_TEMPLATE", a1+a2+a3);
	    	src =src.replaceAll("@GATEWAY_TEMPLATE", g1+g2+g3);
	    	src =src.replaceAll("@EVENT_TEMPLATE", e1 /* +e2+e3*/);
	    	src =src.replaceAll("@TIMER_TEMPLATE", t1 /* +t2+t3*/);
	    	src =src.replaceAll("@SWIM_AND_POOL", s1);
	    	src =src.replaceAll("@LINE", l1+l2);
	        	
	    	src =src.replaceAll("@@POOL_NAME@@", "Da Pool");
	     	 
	    	//make end
	    	src = makeEnd(src);
	    	
	    	
	    	
	    	//pool
	    	//String poolFrag = getFileContent(src);
	    	//poolFrag =makePool(src);
	    	
	    	//end
	    	//String endFrag = getFileContent(src);
	    	//endFrag =makeEnd(src);

	      	
	    	//src =doIt(src, target,"@TEMPLATE_POOL",poolFrag);
	    	src =setFileContent(target,src);
	      	
	    }
	  
    public static String  doIt(String source, String target, String placeHolder, String replacement) {
    	String content="";
    	try {
        	//Path path = Paths.get(source);
        	Path tpath = Paths.get(target);
        	Charset charset = StandardCharsets.UTF_8;

        	//String content = new String(Files.readAllBytes(path), charset);
        	 content = source.replaceAll(placeHolder, replacement);
        	Files.write(tpath, content.getBytes(charset));
        	
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    	
    	return content;
    }

  
    
    
    
    private static String makeSwimlane(String content, String n, String x, String y, String id, float pH, float pW) {
		////
    	String poolHeight=""+pH;
    	String poolPercentHeight = "" + (pH/2f);

    	String poolWidth=""+pW;
    	String poolPercentWidth = "" + (pW/2f);
    	
    	content =content.replaceAll("@@SWIMLANE_NAME@@", n);
    	content =content.replaceAll("@@SWIMLANE_X@@", x);
    	content =content.replaceAll("@@SWIMLANE_Y@@", y);
    	content =content.replaceAll("@@SWIMLANE_ID@@", id);
    	content =content.replaceAll("@@POOL_HEIGHT@@", poolHeight);//10.0938
    	content =content.replaceAll("@@POOL_PERCENT_HEIGHT@@", poolPercentHeight);//5.0469
    	
    	content =content.replaceAll("@@POOL_WIDTH@@", poolWidth);//4.00
    	content =content.replaceAll("@@POOL_PERCENT_WIDTH@@", poolPercentWidth);//2.00
    	
    	return content;
	}    
 
    private static String makeConnection(String content, String n, float x, float y,float ex, float ey, String id) {
		////
    	
		content =content.replaceAll("@@LINE_LABEL@@", n);
    	content =content.replaceAll("@@LINE_START_X@@",""+ x);
    	content =content.replaceAll("@@LINE_START_Y@@",""+ y);
 
    	content =content.replaceAll("@@LINE_END_X@@",""+ ex);
    	content =content.replaceAll("@@LINE_END_Y@@",""+ ey);
    	
    	float floatMidX = (x+ex)/2f;
    	float floatMidY = (y+ey)/2f;
    	
    	float sx1 = floatMidX - Math.min(x, ex);
    	float sy1 =   floatMidY - Math.max(y, ey)  ;
   
    	float vx = ex-x;
    	float vy = y-ey;
    	
    	content =content.replaceAll("@@LINE_VERTIX_X@@",""+ vx);
    	content =content.replaceAll("@@LINE_VERTIX_Y@@",""+ vy);  	
    	content =content.replaceAll("@@LINE_PINX@@",""+ floatMidX);
    	content =content.replaceAll("@@LINE_PINY@@",""+ floatMidY);
    	content =content.replaceAll("@@LINE_LOC_PINX@@",""+ sx1);
    	content =content.replaceAll("@@LINE_LOC_PINY@@",""+ sy1);

 
           
    	content =content.replaceAll("@@LINE_ID@@", id);
    	return content;
	}
    
    private static String makeTimer(String content, String n, String x, String y, String id) {
  		////
    	
  		content =content.replaceAll("@@TIMER_NAME@@", n);
      	content =content.replaceAll("@@TIMER_X@@", x);
      	content =content.replaceAll("@@TIMER_Y@@", y);
      	content =content.replaceAll("@@TIMER_ID@@", id);
      	return content;
  	}
    private static String makeEvent(String content, String n, String x, String y, String id) {
  		////
    	
  		content =content.replaceAll("@@EVENT_NAME@@", n);
      	content =content.replaceAll("@@EVENT_X@@", x);
      	content =content.replaceAll("@@EVENT_Y@@", y);
      	content =content.replaceAll("@@EVENT_ID@@", id);
      	return content;
  	}
    
    private static String makeGateway(String content, String n, String x, String y, String id) {
		////
		content =content.replaceAll("@@GATEWAY_NAME@@", n);
    	content =content.replaceAll("@@GATEWAY_X@@", x);
    	content =content.replaceAll("@@GATEWAY_Y@@", y);
    	content =content.replaceAll("@@GATEWAY_ID@@", id);
    	return content;
	}
    private static String makeActivity(String content, String n, String x, String y, String id) {
		////
		content =content.replaceAll("@@ACTIVITY_NAME@@", n);
    	content =content.replaceAll("@@ACTIVITY_X@@", x);
    	content =content.replaceAll("@@ACTIVITY_Y@@", y);
    	content =content.replaceAll("@@ACTIVITY_ID@@", id);

       	
 
    	return content;
	}
	private static String makeEnd(String endFrag) {
		////
		endFrag =endFrag.replaceAll("@@END_EVENT_NAME@@", "End");
    	endFrag =endFrag.replaceAll("@@END_EVENT_MASTER_ID@@", "2");
  
    	endFrag =endFrag.replaceAll("@@END_EVENT_ID@@", "5555");
    	endFrag =endFrag.replaceAll("@@END_EVENT_SHEET_NAME@@", "endSheet");
    	
    	endFrag =endFrag.replaceAll("@@END_X@@", "9.6875");
		endFrag =endFrag.replaceAll("@@END_Y@@", "4.0219");

     
    	return endFrag;
	}
	
	private static String makeStart(String content) {
		////
		content =content.replaceAll("@@START_EVENT_NAME@@", "Start");
		content =content.replaceAll("@@START_EVENT_MASTER_ID@@", "7");
      	
		content =content.replaceAll("@@START_X@@", "1.1875");
		content =content.replaceAll("@@START_Y@@", "5.0219");


    	return content;
	}	

                            

	private static String createHeading(String title, String author, String date, String content) {
		content =content.replaceAll("@@TITLE@@", title);
		content =content.replaceAll("@@AUTHOR@@", author);
		content =content.replaceAll("@@DATE@@", date);
		return content;
	}

    
    public static String getFileContent(String source) {
    	String retval ="";
        try {
        	Path path = Paths.get(source);
        	Charset charset = StandardCharsets.UTF_8;

        	retval = new String(Files.readAllBytes(path), charset);
        	
        	
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return retval;
    }
    
    public static String  setFileContent(String target, String content) {

    	try {
        	//Path path = Paths.get(source);
        	Path tpath = Paths.get(target);
        	Charset charset = StandardCharsets.UTF_8;

        	Files.write(tpath, content.getBytes(charset));
        	
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    	
    	return content;
    }
    
    
}