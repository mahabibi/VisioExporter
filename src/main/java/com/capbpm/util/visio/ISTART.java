package com.capbpm.util.visio;

public class ISTART {
public static String template="<Shape ID=\"@@START_ID@@\" Master=\"7\" Name=\"com.CapBPM.BPMNEvent\" NameU=\"com.CapBPM.BPMNEvent.@@START_ID@@\" Type=\"Group\">"+
"    <XForm>"+
"	<Width>@@DEFAULT_START_WIDTH@@</Width>"+
"	<Height>@@DEFAULT_START_HEIGHT@@</Height>"+
"	<PinX>@@START_X@@</PinX>"+
"	<PinY>@@START_Y@@</PinY>"+
"	<LocPinX F=\"Width*0.5\">@@DEFAULT_START_HALF_WIDTH@@</LocPinX>"+
"	<LocPinY F=\"Height*0.5\">@@DEFAULT_START_HALF_HEIGHT@@</LocPinY>"+
"	<Angle>-0.0</Angle>"+
"    </XForm>"+
"    <TextXForm>"+
"	<TxtWidth F=\"Width*1.0\">@@DEFAULT_START_WIDTH@@</TxtWidth>"+
"	<TxtHeight F=\"Height*0.3333333333333333\">0.125</TxtHeight>"+
"	<TxtPinX F=\"Width*0.5\">@@DEFAULT_START_HALF_WIDTH@@</TxtPinX>"+
"	<TxtPinY F=\"Height*-0.16666666666666666\">-0.0625</TxtPinY>"+
"	<TxtLocPinX F=\"TxtWidth*0.5\">@@DEFAULT_START_HALF_WIDTH@@</TxtLocPinX>"+
"	<TxtLocPinY F=\"TxtHeight*0.5\">0.0625</TxtLocPinY>"+
"	<TxtAngle>-0.0</TxtAngle>"+
"    </TextXForm>"+
"    <Fill>"+
"	<FillForegnd>#c92d39</FillForegnd>"+
"	<FillBkgnd>#000000</FillBkgnd>"+
"	<FillForegndTrans>0.0</FillForegndTrans>"+
"	<FillBkgndTrans>0.0</FillBkgndTrans>"+
"	<FillPattern>1</FillPattern>"+
"    </Fill>"+
"    <Line>"+
"	<LineWeight>0.0125</LineWeight>"+
"	<LineColor>#666666</LineColor>"+
"	<LineColorTrans>0.0</LineColorTrans>"+
"	<LinePattern>1</LinePattern>"+
"	<EndArrowSize>2</EndArrowSize>"+
"	<BeginArrowSize>2</BeginArrowSize>"+
"	<BeginArrow>0</BeginArrow>"+
"	<EndArrow>0</EndArrow>"+
"	<Rounding>0.03125</Rounding>"+
"    </Line>"+
"    <Protection>"+
"	<LockGroup>1</LockGroup>"+
"    </Protection>"+
"    <Group>"+
"	<DontMoveChildren>0</DontMoveChildren>"+
"    </Group>"+
"    <Event>"+
"	<EventDblClick F=\"OpenTextWin()\" />"+
"    </Event>"+
"    <Char IX=\"0\">"+
"	<Font>4</Font>"+
"	<ComplexScriptFont>4</ComplexScriptFont>"+
"	<Color>#333333</Color>"+
"	<Size>0.1111111111111111</Size>"+
"	<Style>17</Style>"+
"	<Case>0</Case>"+
"	<Pos>0</Pos>"+
"	<Strikethru>0</Strikethru>"+
"	<ColorTrans>0.0</ColorTrans>"+
"    </Char>"+
"    <Para IX=\"0\">"+
"	<IndFirst>0.0</IndFirst>"+
"	<IndLeft>0.0</IndLeft>"+
"	<IndRight>0.0</IndRight>"+
"	<SpLine Unit=\"DT\">-1.0</SpLine>"+
"	<SpBefore>0.0</SpBefore>"+
"	<SpAfter>0.0</SpAfter>"+
"	<HorzAlign>1</HorzAlign>"+
"	<Bullet>0</Bullet>"+
"    </Para>"+
"    <Connection IX=\"0\">"+
"	<X F=\"Width*0.0\">0.0</X>"+
"	<Y F=\"Height*0.5\">@@DEFAULT_START_HALF_HEIGHT@@</Y>"+
"    </Connection>"+
"    <Connection IX=\"1\">"+
"	<X F=\"Width*1.0\">@@DEFAULT_START_WIDTH@@</X>"+
"	<Y F=\"Height*0.5\">@@DEFAULT_START_HALF_HEIGHT@@</Y>"+
"    </Connection>"+
"    <Connection IX=\"2\">"+
"	<X F=\"Width*0.5\">@@DEFAULT_START_HALF_WIDTH@@</X>"+
"	<Y F=\"Height*0.0\">0.0</Y>"+
"    </Connection>"+
"    <Connection IX=\"3\">"+
"	<X F=\"Width*0.5\">@@DEFAULT_START_HALF_WIDTH@@</X>"+
"	<Y F=\"Height*1.0\">@@DEFAULT_START_HEIGHT@@</Y>"+
"    </Connection>"+
"    <Shapes>"+
"	<Shape ID=\"@@START_ID@@1\" MasterShape=\"6\" Type=\"Shape\">"+
"	    <XForm>"+
"		<Width F=\"Sheet.@@START_ID@@!Width*1\">@@DEFAULT_START_WIDTH@@</Width>"+
"		<Height F=\"Sheet.@@START_ID@@!Height*1\">@@DEFAULT_START_HEIGHT@@</Height>"+
"		<PinX F=\"Sheet.@@START_ID@@!Width*0.5\">@@DEFAULT_START_HALF_WIDTH@@</PinX>"+
"		<PinY F=\"Sheet.@@START_ID@@!Height*0.5\">@@DEFAULT_START_HALF_HEIGHT@@</PinY>"+
"		<LocPinX F=\"Width*0.5\">@@DEFAULT_START_HALF_WIDTH@@</LocPinX>"+
"		<LocPinY F=\"Height*0.5\">@@DEFAULT_START_HALF_HEIGHT@@</LocPinY>"+
"		<Angle>0.0</Angle>"+
"	    </XForm>"+
"	    <Fill>"+
"		<FillForegnd F=\"Sheet.@@START_ID@@!FillForegnd\">#c92d39</FillForegnd>"+
"		<FillForegndTrans F=\"Sheet.@@START_ID@@!FillForegndTrans\">0.0</FillForegndTrans>"+
"		<FillBkgndTrans F=\"Sheet.@@START_ID@@!FillBkgndTrans\">0.0</FillBkgndTrans>"+
"		<FillBkgnd F=\"Sheet.@@START_ID@@!FillBkgnd\">#000000</FillBkgnd>"+
"		<FillPattern F=\"Sheet.@@START_ID@@!FillPattern\">1</FillPattern>"+
"	    </Fill>"+
"	    <Line>"+
"		<LineWeight>0.0375</LineWeight>"+
"		<LineColor>#666666</LineColor>"+
"		<LineColorTrans>0.0</LineColorTrans>"+
"		<LinePattern>1</LinePattern>"+
"		<EndArrowSize>2</EndArrowSize>"+
"		<BeginArrowSize>2</BeginArrowSize>"+
"		<BeginArrow>0</BeginArrow>"+
"		<EndArrow>0</EndArrow>"+
"		<Rounding>0.003125</Rounding>"+
"	    </Line>"+
"	    <Protection>"+
"		<LockHeight>1</LockHeight>"+
"		<LockWidth>1</LockWidth>"+
"		<LockMoveX>1</LockMoveX>"+
"		<LockMoveY>1</LockMoveY>"+
"		<LockRotate>1</LockRotate>"+
"		<LockTextEdit>1</LockTextEdit>"+
"	    </Protection>"+
"	    <Group />"+
"	    <Event />"+
"	</Shape>"+
"	<Shape ID=\"@@START_ID@@2\" MasterShape=\"7\" Type=\"Shape\">"+
"	    <XForm>"+
"		<Width F=\"Sheet.@@START_ID@@!Width*1\">@@DEFAULT_START_WIDTH@@</Width>"+
"		<Height F=\"Sheet.@@START_ID@@!Height*1\">@@DEFAULT_START_HEIGHT@@</Height>"+
"		<PinX F=\"Sheet.@@START_ID@@!Width*0.5\">@@DEFAULT_START_HALF_WIDTH@@</PinX>"+
"		<PinY F=\"Sheet.@@START_ID@@!Height*0.5\">@@DEFAULT_START_HALF_HEIGHT@@</PinY>"+
"		<LocPinX F=\"Width*0.5\">@@DEFAULT_START_HALF_WIDTH@@</LocPinX>"+
"		<LocPinY F=\"Height*0.5\">@@DEFAULT_START_HALF_HEIGHT@@</LocPinY>"+
"		<Angle>0.0</Angle>"+
"	    </XForm>"+
"	    <Fill>"+
"		<FillForegnd F=\"GUARD(TINT(Sheet.@@START_ID@@!FillForegnd,-111))\">#c92d39</FillForegnd>"+
"		<FillForegndTrans F=\"Sheet.@@START_ID@@!FillForegndTrans\">0.0</FillForegndTrans>"+
"		<FillBkgndTrans F=\"Sheet.@@START_ID@@!FillBkgndTrans\">0.0</FillBkgndTrans>"+
"		<FillBkgnd F=\"Sheet.@@START_ID@@!FillBkgnd\">#000000</FillBkgnd>"+
"		<FillPattern F=\"Sheet.@@START_ID@@!FillPattern\">1</FillPattern>"+
"	    </Fill>"+
"	    <Line>"+
"		<LineWeight>0.0125</LineWeight>"+
"		<LineColor>#666666</LineColor>"+
"		<LineColorTrans>0.0</LineColorTrans>"+
"		<LinePattern>1</LinePattern>"+
"		<EndArrowSize>2</EndArrowSize>"+
"		<BeginArrowSize>2</BeginArrowSize>"+
"		<BeginArrow>0</BeginArrow>"+
"		<EndArrow>0</EndArrow>"+
"		<Rounding>0.0</Rounding>"+
"	    </Line>"+
"	    <Protection>"+
"		<LockHeight>1</LockHeight>"+
"		<LockWidth>1</LockWidth>"+
"		<LockMoveX>1</LockMoveX>"+
"		<LockMoveY>1</LockMoveY>"+
"		<LockRotate>1</LockRotate>"+
"		<LockTextEdit>1</LockTextEdit>"+
"	    </Protection>"+
"	    <Group />"+
"	    <Event />"+
"	</Shape>"+
"    </Shapes>"+
"    <TextBlock>"+
"	<VerticalAlign>1</VerticalAlign>"+
"	<LeftMargin>0.0</LeftMargin>"+
"	<RightMargin>0.0</RightMargin>"+
"	<TopMargin>0.0</TopMargin>"+
"	<BottomMargin>0.0</BottomMargin>"+
"    </TextBlock>"+
"    <Text>"+
"	<pp IX=\"0\" />"+
"	<cp IX=\"0\" />@@START_NAME@@</Text>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"ImageFillProps\">false</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"Hyphenate\">false</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"bpmnEventType\">12</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"BG\">0</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"TextLinks\">[]</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"GutterPadding\">5</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"IgnoreTheme\">{}</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"NoteHint\">\"\"</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"Lock\">0</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"bpmnDashed\">0</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"bpmnInvertedIcon\">0</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"InsetMargin\">0</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"TRotation\">0</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"Hidden\">0</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"bpmnEventGroup\">2</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"Opacity\">100</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"StrokeStyle\">\"solid\"</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.CapBPM.com\" Name=\"Restrictions\">{}</lc:Property>"+
"</Shape>";
}
