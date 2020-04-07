import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.applet.Applet;
//<applet code="Digital.class" width="600" height="800"></applet>
public class Digital extends Applet implements Runnable 
{
	Thread t1,t2;
	public void start()
	{ 
	t1=new Thread(this);
	t1.start();
	
		
	}
	public void run(){} 
	public void paint(Graphics g)
	{
		
	}
}