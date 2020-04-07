//<applet code="ButtonTest" width=400 height=400 >Hello World</applet>
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ButtonTest extends Applet implements ActionListener
{
	Button b1;
	Button b2;
	Button b3;
	Button b4;

	public void init()
	{
		b1=new Button("Blue");
		b2=new Button("Red");
		b3=new Button("White");

		this.add(b1);
		this.add(b2);
		this.add(b3);
		
		this.setLayout(null);
		b1.setBounds(150,100,60,60);
		b2.setBounds(250,100,60,60);
		b3.setBounds(350,100,60,60);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		if(str.equals("Blue"))
		{
			this.setBackground(Color.blue);
			
		}
		else if(str.equals("Red"))
		{
			this.setBackground(Color.red);
		}
		else if(str.equals("White"))
		{
			this.setBackground(Color.white);
		}
		this.repaint();
	}

	public void paint(Graphics g)
	{

	}
}