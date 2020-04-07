//<applet code="AdapterDemo" width=400 height=400 >Hello World</applet>
import java.applet.Applet;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public  class AdapterDemo extends Applet
{
	int x=0,y=0;
	 public void init()
	 {
	 	addMouseListener(new MouseDemo(this));
	 	addMouseMotionListener(new MouseMotionDemo(this));

	 }
	public void paint(Graphics g)
	{
		g.drawString("HEllo",x+50,y+50);
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
class MouseMotionDemo extends MouseMotionAdapter
{
	AdapterDemo d;

	MouseMotionDemo(AdapterDemo d)
	{
		this.d=d;
	}
	
	public void mouseMoved(MouseEvent m)
	{
		d.x=m.getX();
		d.y=m.getY();
		d.repaint();
	}
}