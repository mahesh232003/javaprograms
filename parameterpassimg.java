import java.util.*;
import java.awt.*;
import java.applet.*;
import java.io.*;

/*<applet code="ParameterPassing1" height="300" width="200">
<param name="name" value="Mahesh">
<param name="rno" value="90">
<param name="section" value="B">
</applet>*/

public class ParameterPassing1 extends Applet
{
	String name;
	String rno;
	String section;

	public void init()
	{
		name=getParameter("name");
		rno=getParameter("rno");
		section=getParameter("section");
	}
	
	public void paint(Graphics g)
	{
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		g.drawString("Parameter to applet",20,20);
		g.drawString("Name-"+name,20,40);
		g.drawString("Roll number-"+rno,20,60);
		g.drawString("Section-"+section,20,80);
	}
}
