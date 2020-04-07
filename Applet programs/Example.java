import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
//<applet code="Example" width=600 height=800 ><param name="site" value="PRADEEP KUMAR"></param></applet>
public class Example extends Applet
{
	private String defaultMessage="Hello";
	public void paint(Graphics g)
	{
		String s1=this.getParameter("site");
		if(s1==null)
			s1=defaultMessage;
		g.drawString(s1,50,20);
	}
}