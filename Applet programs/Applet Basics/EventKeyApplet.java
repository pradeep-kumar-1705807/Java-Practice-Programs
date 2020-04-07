//<applet code="EventKeyApplet" width=600 height=500> Hello World</applet>
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class EventKeyApplet extends Applet implements KeyListener
{
	Label l1;
	TextArea ta1;
	public void init()
	{
		System.out.println("init Function");
		l1=new Label("Hello World");
		ta1=new TextArea();
		 setLayout(null);

		l1.setBounds(100,50,200,100);
		ta1.setBounds(300,300,500,500);

		 add(l1);
		 add(ta1);
		 ta1.addKeyListener(this);
		 start();

	}
	public void start()
	{
		System.out.println("Applet Started");
	}
	
	public void stop()
	{
		System.out.println("Stop Function");
	}
	public void destroy()
	{
		
	
		System.out.println("Applet Destriyed");
	
	}

	public void keyPressed(KeyEvent e)
		 {
		 	l1.setText("Key Pressed");
		 }

	public void keyReleased(KeyEvent e)
		 {
		 	l1.setText("Key Released");
		 }
	public void keyTyped(KeyEvent e)
		 {
		 	l1.setText("Typing.............");
		 }

}
