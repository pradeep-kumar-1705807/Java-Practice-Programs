//<applet code="SimpleApplet.java" width="500" height="600"></applet>
import java.applet.*;
import java.awt.*;
public class SimpleApplet extends Applet
{
	int i=100;
	public void paint(Graphics g)
	{
		g.drawString(" Hello Applet ",20,20);
     }
}