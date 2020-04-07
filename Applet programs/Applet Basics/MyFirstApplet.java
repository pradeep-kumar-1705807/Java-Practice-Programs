//<applet code="MyFirstApplet" width=400 height=400 >Hello World</applet>
import java.applet.Applet;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class MyFirstApplet extends Applet
{
	 public void init()
	 {

	 }
	public void paint(Graphics g)
	{
		g.drawArc(50,50,100,200,0,360); 
	}


}