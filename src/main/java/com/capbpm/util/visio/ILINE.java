package com.capbpm.util.visio;

public interface ILINE {
	public static String template="\"<Shape ID=\\\"@@LINE_ID@@\\\" Name=\\\"com.CapBPM.Line\\\" NameU=\\\"com.CapBPM.Line.@@LINE_ID@@\\\" Type=\\\"Shape\\\">\"+\r\n" + 
			"\"    <XForm1D>\"+\r\n" + 
			"\"	<BeginX>@@LINE_START_X@@</BeginX>\"+\r\n" + 
			"\"	<BeginY>@@LINE_START_Y@@</BeginY>\"+\r\n" + 
			"\"	<EndX>@@LINE_END_X@@</EndX>\"+\r\n" + 
			"\"	<EndY>@@LINE_END_Y@@</EndY>\"+\r\n" + 
			"\"    </XForm1D>\"+\r\n" + 
			"\"    <XForm>\"+\r\n" + 
			"\"	<Width>@@LINE_VERTIX_X@@</Width>\"+\r\n" + 
			"\"	<Height>@@LINE_VERTIX_Y@@</Height>\"+\r\n" + 
			"\"	<PinX>@@LINE_PINX@@</PinX>\"+\r\n" + 
			"\"	<PinY>@@LINE_PINY@@</PinY>\"+\r\n" + 
			"\"	<LocPinX F=\\\"Width*0.5\\\">@@LINE_LOC_PINX@@</LocPinX>\"+\r\n" + 
			"\"	<LocPinY F=\\\"Height*0.5\\\">@@LINE_LOC_PINY@@</LocPinY>\"+\r\n" + 
			"\"	<Angle>-0.0</Angle>\"+\r\n" + 
			"\"    </XForm>\"+\r\n" + 
			"\"    <TextXForm>\"+\r\n" + 
			"\"	<TxtWidth F=\\\"TEXTWIDTH(TheText)\\\" />\"+\r\n" + 
			"\"	<TxtHeight F=\\\"TEXTHEIGHT(TheText,TxtWidth)\\\">0.135</TxtHeight>\"+\r\n" + 
			"\"	<TxtPinX F=\\\"SETATREF(Controls.TextPosition)\\\">0.75</TxtPinX>\"+\r\n" + 
			"\"	<TxtPinY F=\\\"SETATREF(Controls.TextPosition.Y)\\\">-0.3456</TxtPinY>\"+\r\n" + 
			"\"	<TxtLocPinX F=\\\"TxtWidth*0.5\\\">0.393</TxtLocPinX>\"+\r\n" + 
			"\"	<TxtLocPinY F=\\\"TxtHeight*0.5\\\">0.393</TxtLocPinY>\"+\r\n" + 
			"\"	<TxtAngle>-0.0</TxtAngle>\"+\r\n" + 
			"\"    </TextXForm>\"+\r\n" + 
			"\"    <Line>\"+\r\n" + 
			"\"	<LineWeight>0.0125</LineWeight>\"+\r\n" + 
			"\"	<LineColor>#999999</LineColor>\"+\r\n" + 
			"\"	<LineColorTrans>0.0</LineColorTrans>\"+\r\n" + 
			"\"	<LinePattern>1</LinePattern>\"+\r\n" + 
			"\"	<EndArrowSize>2</EndArrowSize>\"+\r\n" + 
			"\"	<BeginArrowSize>2</BeginArrowSize>\"+\r\n" + 
			"\"	<BeginArrow>0</BeginArrow>\"+\r\n" + 
			"\"	<EndArrow>4</EndArrow>\"+\r\n" + 
			"\"	<Rounding>0.003125</Rounding>\"+\r\n" + 
			"\"    </Line>\"+\r\n" + 
			"\"    <Misc>\"+\r\n" + 
			"\"	<ObjType>2</ObjType>\"+\r\n" + 
			"\"	<DynFeedback>2</DynFeedback>\"+\r\n" + 
			"\"	<NoLiveDynamics>1</NoLiveDynamics>\"+\r\n" + 
			"\"	<NoAlignBox>1</NoAlignBox>\"+\r\n" + 
			"\"    </Misc>\"+\r\n" + 
			"\"    <Layout>\"+\r\n" + 
			"\"	<ConFixedCode>1</ConFixedCode>\"+\r\n" + 
			"\"	<ShapeRouteStyle>0</ShapeRouteStyle>\"+\r\n" + 
			"\"	<ConLineRouteExt>0</ConLineRouteExt>\"+\r\n" + 
			"\"	<ConLineJumpCode>0</ConLineJumpCode>\"+\r\n" + 
			"\"    </Layout>\"+\r\n" + 
			"\"    <Group />\"+\r\n" + 
			"\"    <Event />\"+\r\n" + 
			"\"    <Control ID=\\\"0\\\" NameU=\\\"TextPosition\\\">\"+\r\n" + 
			"\"	<X>0.75</X>\"+\r\n" + 
			"\"	<Y>-0.3456</Y>\"+\r\n" + 
			"\"	<ConX>0.0</ConX>\"+\r\n" + 
			"\"	<ConY>0.0</ConY>\"+\r\n" + 
			"\"	<DynX F=\\\"TextPosition\\\">0.75</DynX>\"+\r\n" + 
			"\"	<DynY F=\\\"TextPosition.Y\\\">-0.3456</DynY>\"+\r\n" + 
			"\"	<Prompt>Reposition Text</Prompt>\"+\r\n" + 
			"\"    </Control>\"+\r\n" + 
			"\"    <Char IX=\\\"0\\\">\"+\r\n" + 
			"\"	<Font>4</Font>\"+\r\n" + 
			"\"	<ComplexScriptFont>4</ComplexScriptFont>\"+\r\n" + 
			"\"	<Color>#333333</Color>\"+\r\n" + 
			"\"	<Size>0.1111111111111111</Size>\"+\r\n" + 
			"\"	<Style>17</Style>\"+\r\n" + 
			"\"	<Case>0</Case>\"+\r\n" + 
			"\"	<Pos>0</Pos>\"+\r\n" + 
			"\"	<Strikethru>0</Strikethru>\"+\r\n" + 
			"\"	<ColorTrans>0.0</ColorTrans>\"+\r\n" + 
			"\"    </Char>\"+\r\n" + 
			"\"    <Para IX=\\\"0\\\">\"+\r\n" + 
			"\"	<IndFirst>0.0</IndFirst>\"+\r\n" + 
			"\"	<IndLeft>0.0</IndLeft>\"+\r\n" + 
			"\"	<IndRight>0.0</IndRight>\"+\r\n" + 
			"\"	<SpLine Unit=\\\"DT\\\">-1.0</SpLine>\"+\r\n" + 
			"\"	<SpBefore>0.0</SpBefore>\"+\r\n" + 
			"\"	<SpAfter>0.0</SpAfter>\"+\r\n" + 
			"\"	<HorzAlign>1</HorzAlign>\"+\r\n" + 
			"\"	<Bullet>0</Bullet>\"+\r\n" + 
			"\"    </Para>\"+\r\n" + 
			"\"    <Geom IX=\\\"0\\\">\"+\r\n" + 
			"\"	<NoFill>1</NoFill>\"+\r\n" + 
			"\"	<NoLine>0</NoLine>\"+\r\n" + 
			"\"	<NoShow>0</NoShow>\"+\r\n" + 
			"\"	<MoveTo IX=\\\"1\\\">\"+\r\n" + 
			"\"	    <X F=\\\"Width*0.42478477571363843\\\">0.75</X>\"+\r\n" + 
			"\"	    <Y F=\\\"Height*1.0\\\">@@LINE_VERTIX_Y@@</Y>\"+\r\n" + 
			"\"	</MoveTo>\"+\r\n" + 
			"\"	<LineTo IX=\\\"2\\\">\"+\r\n" + 
			"\"	    <X F=\\\"Width*0.42478477571363843\\\">0.75</X>\"+\r\n" + 
			"\"	    <Y F=\\\"Height*-0.0\\\">0.0</Y>\"+\r\n" + 
			"\"	</LineTo>\"+\r\n" + 
			"\"	<LineTo IX=\\\"3\\\">\"+\r\n" + 
			"\"	    <X F=\\\"Width*1.0\\\">@@LINE_VERTIX_X@@</X>\"+\r\n" + 
			"\"	    <Y F=\\\"Height*-0.0\\\">0.0</Y>\"+\r\n" + 
			"\"	</LineTo>\"+\r\n" + 
			"\"    </Geom>\"+\r\n" + 
			"\"    <TextBlock>\"+\r\n" + 
			"\"	<VerticalAlign>1</VerticalAlign>\"+\r\n" + 
			"\"	<TextBkgnd>#ffffff</TextBkgnd>\"+\r\n" + 
			"\"	<LeftMargin>0.0</LeftMargin>\"+\r\n" + 
			"\"	<RightMargin>0.0</RightMargin>\"+\r\n" + 
			"\"	<TopMargin>0.0</TopMargin>\"+\r\n" + 
			"\"	<BottomMargin>0.0</BottomMargin>\"+\r\n" + 
			"\"    </TextBlock>\"+\r\n" + 
			"\"    <Text>\"+\r\n" + 
			"\"	<pp IX=\\\"0\\\" />\"+\r\n" + 
			"\"	<cp IX=\\\"0\\\" />@@LINE_LABEL@@</Text>\"+\r\n" + 
			"\"</Shape>\"";
	
	public static String connectionTemplate = "<Connect FromSheet=\"@@FROM_SHEET@@\"  FromPart=\"@@FROM_PART@@\" ToSheet=\"@@TO_SHEET@@\"  ToPart=\"@@TO_PART@@\" /> \r\n" + 
			"";
}
