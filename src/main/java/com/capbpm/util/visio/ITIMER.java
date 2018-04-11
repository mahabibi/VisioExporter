package com.capbpm.util.visio;

public interface ITIMER {
	public static String template="<Shape ID=\"@@TIMER_ID@@\" Master=\"8\" Name=\"com.lucidchart.BPMNEvent\" NameU=\"com.lucidchart.BPMNEvent.@@TIMER_ID@@\" Type=\"Group\">"+
"    <XForm>"+
"	<Width>@@DEFAULT_TIMER_WIDTH@@</Width>"+
"	<Height>@@DEFAULT_TIMER_HEIGHT@@</Height>"+
"	<PinX>@@TIMER_X@@</PinX>"+
"	<PinY>@@TIMER_Y@@</PinY>"+
"	<LocPinX F=\"Width*0.5\">@@DEFAULT_TIMER_HALF_WIDTH@@</LocPinX>"+
"	<LocPinY F=\"Height*0.5\">@@DEFAULT_TIMER_HALF_HEIGHT@@</LocPinY>"+
"	<Angle>-0.0</Angle>"+
"    </XForm>"+
"    <TextXForm>"+
"	<TxtWidth F=\"Width*1.0\">@@DEFAULT_TIMER_WIDTH@@</TxtWidth>"+
"	<TxtHeight F=\"Height*0.3333333333333333\">0.125</TxtHeight>"+
"	<TxtPinX F=\"Width*0.5\">@@DEFAULT_TIMER_HALF_WIDTH@@</TxtPinX>"+
"	<TxtPinY F=\"Height*-0.16666666666666666\">-0.0625</TxtPinY>"+
"	<TxtLocPinX F=\"TxtWidth*0.5\">@@DEFAULT_TIMER_HALF_WIDTH@@</TxtLocPinX>"+
"	<TxtLocPinY F=\"TxtHeight*0.5\">0.0625</TxtLocPinY>"+
"	<TxtAngle>-0.0</TxtAngle>"+
"    </TextXForm>"+
"    <Fill>"+
"	<FillForegnd>#ffffff</FillForegnd>"+
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
"	<Rounding>0.0</Rounding>"+
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
"	<Style>0</Style>"+
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
"	<HorzAlign>-1</HorzAlign>"+
"	<Bullet>0</Bullet>"+
"    </Para>"+
"    <Connection IX=\"0\">"+
"	<X F=\"Width*0.0\">0.0</X>"+
"	<Y F=\"Height*0.5\">@@DEFAULT_TIMER_HALF_HEIGHT@@</Y>"+
"    </Connection>"+
"    <Connection IX=\"1\">"+
"	<X F=\"Width*1.0\">@@DEFAULT_TIMER_WIDTH@@</X>"+
"	<Y F=\"Height*0.5\">@@DEFAULT_TIMER_HALF_HEIGHT@@</Y>"+
"    </Connection>"+
"    <Connection IX=\"2\">"+
"	<X F=\"Width*0.5\">@@DEFAULT_TIMER_HALF_WIDTH@@</X>"+
"	<Y F=\"Height*0.0\">0.0</Y>"+
"    </Connection>"+
"    <Connection IX=\"3\">"+
"	<X F=\"Width*0.5\">@@DEFAULT_TIMER_HALF_WIDTH@@</X>"+
"	<Y F=\"Height*1.0\">@@DEFAULT_TIMER_HEIGHT@@</Y>"+
"    </Connection>"+
"    <Shapes>"+
"	<Shape ID=\"@@TIMER_ID@@1\" MasterShape=\"8\" Type=\"Shape\">"+
"	    <XForm>"+
"		<Width F=\"Sheet.50!Width*1\">@@DEFAULT_TIMER_WIDTH@@</Width>"+
"		<Height F=\"Sheet.50!Height*1\">@@DEFAULT_TIMER_HEIGHT@@</Height>"+
"		<PinX F=\"Sheet.50!Width*0.5\">@@DEFAULT_TIMER_HALF_WIDTH@@</PinX>"+
"		<PinY F=\"Sheet.50!Height*0.5\">@@DEFAULT_TIMER_HALF_HEIGHT@@</PinY>"+
"		<LocPinX F=\"Width*0.5\">@@DEFAULT_TIMER_HALF_WIDTH@@</LocPinX>"+
"		<LocPinY F=\"Height*0.5\">@@DEFAULT_TIMER_HALF_HEIGHT@@</LocPinY>"+
"		<Angle>0.0</Angle>"+
"	    </XForm>"+
"	    <Fill>"+
"		<FillForegnd F=\"Sheet.50!FillForegnd\">#ffffff</FillForegnd>"+
"		<FillForegndTrans F=\"Sheet.50!FillForegndTrans\">0.0</FillForegndTrans>"+
"		<FillBkgndTrans F=\"Sheet.50!FillBkgndTrans\">0.0</FillBkgndTrans>"+
"		<FillBkgnd F=\"Sheet.50!FillBkgnd\">#000000</FillBkgnd>"+
"		<FillPattern F=\"Sheet.50!FillPattern\">1</FillPattern>"+
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
"	<Shape ID=\"@@TIMER_ID@@2\" MasterShape=\"8\" Type=\"Shape\">"+
"	    <XForm>"+
"		<Width F=\"Sheet.50!Width*1\">@@DEFAULT_TIMER_WIDTH@@</Width>"+
"		<Height F=\"Sheet.50!Height*1\">@@DEFAULT_TIMER_HEIGHT@@</Height>"+
"		<PinX F=\"Sheet.50!Width*0.5\">@@DEFAULT_TIMER_HALF_WIDTH@@</PinX>"+
"		<PinY F=\"Sheet.50!Height*0.5\">@@DEFAULT_TIMER_HALF_HEIGHT@@</PinY>"+
"		<LocPinX F=\"Width*0.5\">@@DEFAULT_TIMER_HALF_WIDTH@@</LocPinX>"+
"		<LocPinY F=\"Height*0.5\">@@DEFAULT_TIMER_HALF_HEIGHT@@</LocPinY>"+
"		<Angle>0.0</Angle>"+
"	    </XForm>"+
"	    <Fill>"+
"		<FillForegnd F=\"Sheet.50!FillForegnd\">#ffffff</FillForegnd>"+
"		<FillForegndTrans F=\"Sheet.50!FillForegndTrans\">0.0</FillForegndTrans>"+
"		<FillBkgndTrans F=\"Sheet.50!FillBkgndTrans\">0.0</FillBkgndTrans>"+
"		<FillBkgnd F=\"Sheet.50!FillBkgnd\">#000000</FillBkgnd>"+
"		<FillPattern F=\"Sheet.50!FillPattern\">1</FillPattern>"+
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
"	<Shape ID=\"@@TIMER_ID@@3\" MasterShape=\"8\" Type=\"Shape\">"+
"	    <XForm>"+
"		<Width F=\"Sheet.50!Width*1\">@@DEFAULT_TIMER_WIDTH@@</Width>"+
"		<Height F=\"Sheet.50!Height*1\">@@DEFAULT_TIMER_HEIGHT@@</Height>"+
"		<PinX F=\"Sheet.50!Width*0.5\">@@DEFAULT_TIMER_HALF_WIDTH@@</PinX>"+
"		<PinY F=\"Sheet.50!Height*0.5\">@@DEFAULT_TIMER_HALF_HEIGHT@@</PinY>"+
"		<LocPinX F=\"Width*0.5\">@@DEFAULT_TIMER_HALF_WIDTH@@</LocPinX>"+
"		<LocPinY F=\"Height*0.5\">@@DEFAULT_TIMER_HALF_HEIGHT@@</LocPinY>"+
"		<Angle>0.0</Angle>"+
"	    </XForm>"+
"	    <Fill>"+
"		<FillForegnd F=\"Sheet.50!FillForegnd\">#ffffff</FillForegnd>"+
"		<FillForegndTrans F=\"Sheet.50!FillForegndTrans\">0.0</FillForegndTrans>"+
"		<FillBkgndTrans F=\"Sheet.50!FillBkgndTrans\">0.0</FillBkgndTrans>"+
"		<FillBkgnd F=\"Sheet.50!FillBkgnd\">#000000</FillBkgnd>"+
"		<FillPattern F=\"Sheet.50!FillPattern\">1</FillPattern>"+
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
"    </Shapes>"+
"    <TextBlock>"+
"	<VerticalAlign>-1</VerticalAlign>"+
"	<LeftMargin>0.0</LeftMargin>"+
"	<RightMargin>0.0</RightMargin>"+
"	<TopMargin>0.0</TopMargin>"+
"	<BottomMargin>0.0</BottomMargin>"+
"    </TextBlock>"+
"    <Text>"+
"	<pp IX=\"0\" />"+
"	<cp IX=\"0\" />@@TIMER_NAME@@</Text>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"Hyphenate\">false</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"ImageFillProps\">false</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"RuleList\">[]</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"bpmnEventType\">2</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"BG\">0</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"TextLinks\">{}</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"GutterPadding\">5</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"IgnoreTheme\">{}</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"NoteHint\">\"\"</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"Lock\">0</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"bpmnDashed\">0</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"bpmnInvertedIcon\">0</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"InsetMargin\">0</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"TRotation\">0</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"Hidden\">0</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"bpmnEventGroup\">1</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"StrokeStyle\">\"solid\"</lc:Property>"+
"    <lc:Property xmlns:lc=\"http://www.lucidchart.com\" Name=\"Restrictions\">{}</lc:Property>"+
"</Shape>";
}
