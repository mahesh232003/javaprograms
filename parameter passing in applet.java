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
	Font f1,f2,f3,f4;

	public void init()
	{
		name=getParameter("name");
		rno=getParameter("rno");
		section=getParameter("section");
		f1 = new Font("Arial",Font.BOLD,10);    
       		f2 = new Font("Forte",Font.PLAIN,14);    
       		f3 = new Font("Elephant",Font.ITALIC,18);
		f4 = new Font("BankGothic Lt BT",Font.BOLD,22);
	}
	
	public void paint(Graphics g)
	{
		setBackground(Color.BLACK); 
		setForeground(Color.WHITE);
		g.setFont(f1); 
		g.drawString("Parameter to applet",20,20);
		g.setFont(f2); 
		g.drawString("Name-"+name,20,60);
		g.setFont(f3); 
		g.drawString("Roll number-"+rno,20,100);
		g.setFont(f4); 
		g.drawString("Section-"+section,20,140);
	}
}
