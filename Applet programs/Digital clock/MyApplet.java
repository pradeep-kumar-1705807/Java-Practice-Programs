import java.applet.Applet;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
//<applet code="MyApplet" width="400" height="500"></applet>
public class MyApplet extends Applet implements Runnable
{
	Thread t,t1;
	public void start()
	{
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		t1=Thread.currentThread();
		while(t1==t)
		{
			repaint();
			try
			{
				t1.sleep(1000);
			}
			catch(InterruptedException i)
			{
			}
		}
	} 
	public void paint(Graphics g)
	{
		g.drawString("Hello Word",20,20);
	}
}
		