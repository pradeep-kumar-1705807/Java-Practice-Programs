//<applet code="EventApplet2" height="500" width="600"> hi</applet>
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class EventApplet1 extends Applet implements ActionListener
{
	Button b1;
	TextField t1;
	public void actionPerformed(ActionEvent e)
	{
		t1.setText("Welcome to the World os Programming");
	}
	public void init()
	{
		b1=new Button("Click Here");
		t1=new TextField();
		this.setLayout(null);
		b1.setBounds(100,200,100,100);
		t1.setBounds(300,400,500,100);

		this.add(b1);
		this.add(t1);



		b1.addActionListener(this);


	}
}