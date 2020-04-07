import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="TusharAdapterDemo" height=200 width=200>Helo
</applet>
*/
public class TusharAdapterDemo extends Applet
{
	int x=0;
	int y=0;
	public void init()
	{
		addMouseListener(new MouseDemo(this));
		addMouseMotionListener(new MouseMotionDemo(this));
	}
	public void paint(Graphics g)
	{
		g.drawString("Hi Tushar",x,y);
	}
	class MouseDemo extends MouseAdapter{
	TusharAdapterDemo d;
	MouseDemo(TusharAdapterDemo d)
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
	TusharAdapterDemo d;
	MouseMotionDemo(TusharAdapterDemo d)
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

}

