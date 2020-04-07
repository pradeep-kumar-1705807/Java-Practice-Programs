//<applet code="CheckboxTest" width=700 height=500></applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class CheckboxTest extends Applet implements ActionListener
{
	Checkbox name1,name2,name3;
	Button b1;
	Button sub;
	public void init()
	{
		name1=new Checkbox("Pradeep");
		name2=new Checkbox("Tushar");
		name3=new Checkbox("Sanket");
		sub=new Button("Submit");
		add(name1);
		add(name2);
		add(name3);
		add(sub);
		sub.addActionListener(this);

	}
	public void paint(Graphics g)
	{
		if(name1.getState())
		{
			g.drawString("Pradeep",50,100);
		}
		 if(name2.getState())
		{
			g.drawString("Tushar",50,150);
		}
		 if(name3.getState())
		{
			g.drawString("Sanket",50,200);
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		repaint();

	}
} 
