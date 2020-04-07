//<applet code="EventApplet1" height="500" width="600"> hi</applet>
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class EventApplet1 extends Applet implements ActionListener
{
	Button b1;
	Button b2;
	Label l1;
	TextField t1;
	public void actionPerformed(ActionEvent e)
	{
		t1.setText(" "+e.getActionCommand()+" "+e.getWhen()+" "+e.getModifiers()+" "+e.ACTION_PERFORMED);
	}
	public void init()
	{
		b1=new Button("Click Here");
		b2=new Button("Click Here2");
		t1=new TextField();
		l1=new Label();    
		this.setLayout(null);
		b1.setBounds(100,200,100,100);
		b2.setBounds(300,200,100,100);
		t1.setBounds(300,400,500,100);
		l1.setBounds(200,50,500,100);

		this.add(b1);
		this.add(t1);
		this.add(b2);
		this.add(l1);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b1.addMouseListener(new MouseListener(){
			public void mouseEntered(MouseEvent ev)
			{
				t1.setText("Mouse Has Entered the Click Button 2");
			}
			public void mouseExited(MouseEvent ev)
			{

			}
			public void mouseReleased(MouseEvent ev)
			{
				l1.setText(" Mouse is relesed");

			}
			public void mousePressed(MouseEvent ev)
			{
				l1.setText(" Mouse is Pressed");

			}
			public void mouseClicked(MouseEvent ev)
			{
				
				l1.setText(" Mouse is Clicked");

			}
		});
		b2.addMouseListener(new MouseListener(){
			public void mouseEntered(MouseEvent ev)
			{
				t1.setText("Mouse Has Entered the Click Button 2");
			}
			public void mouseExited(MouseEvent ev)
			{

			}
			public void mouseReleased(MouseEvent ev)
			{
				l1.setText(" Mouse is relesed");

			}
			public void mousePressed(MouseEvent ev)
			{
				l1.setText(" Mouse is Pressed "+" X ="+ev.getX()+" Y ="+ev.getY());
			

			}
			public void mouseClicked(MouseEvent ev)
			{
				
				l1.setText(" Mouse is Clicked");

			}
		});


	}
}