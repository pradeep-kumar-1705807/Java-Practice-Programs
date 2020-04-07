//<applet code="Applet2" width=400 height=400 >Hello World</applet>
import java.applet.Applet;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class AdapterDemo extends Applet
{
	int x=0,y=0;
	 public void init()
	 {
	 	addMouseListener(new MouseDemo(this));
	 	addMouseMotionListener(new MouseMotionDemo(this));

	 }
	public void paint(Graphics g)
	{
		g.drawString("HEllo",x,y);
	}
	
}
class MouseDemo extends MouseAdapter
{
	AdapterDemo d;
	MouseDemo(AdapterDemo d)
	{
		this.d=d;
	}
	public void mouseClicked(MouseEvent m)
	{
		d.showStatus("Mouse Clicked");
	}
}
class MouseMotion extends MouseMotionAdapter
{
	AdapterDemo d;
	public void mouseMoved(MouseEvent m)
	{
		d.x=getX();
		d.y=getY();
		d.repaint();
	}
}