//<applet code="MyApplet" width=600 height=500> Hello World</applet>
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class MyApplet extends Applet
{
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1,b2,b3,b4;
	public void init()
	{
		l1=new Label("First Number : ");
		l2=new Label("Second Number : ");
		l3=new Label();
		t1=new TextField();
		t2=new TextField();
		b1=new Button("Add");
		b2=new Button("Subtract");
		b3=new Button("Multiply");
		b4=new Button("Divide");
		
		setLayout(null);
		l1.setBounds(50,50,100,20);
		l2.setBounds(50,100,100,20);
		t1.setBounds(200,50,100,20);
		t2.setBounds(200,100,100,20);
		b1.setBounds(100,200,100,30);
		b2.setBounds(200,200,100,30);
		b3.setBounds(300,200,100,30);
		b4.setBounds(400,200,100,30);
		l3.setBounds(100,300,100,20);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l3);
		b1.addActionListener(new MyHandler1());
		b2.addActionListener(new MyHandler2());
		b3.addActionListener(new MyHandler3());
		b4.addActionListener(new MyHandler4());
  }

public class MyHandler1 implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
	int a,b,sum;
	a=Integer.parseInt(t1.getText());
	b=Integer.parseInt(t2.getText());
	sum=a+b;
	l3.setText("Sum is "+sum);
	}

}

public class MyHandler2 implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
	int a,b,sub;
	a=Integer.parseInt(t1.getText());
	b=Integer.parseInt(t2.getText());
	sub=a-b;
	l3.setText("Difference is "+sub);
}

}

public class MyHandler3 implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
	int a,b,sub;
	a=Integer.parseInt(t1.getText());
	b=Integer.parseInt(t2.getText());
	sub=a*b;
	l3.setText("Product  is "+sub);
}

}

public class MyHandler4 implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
	int a,b,sub;
	a=Integer.parseInt(t1.getText());
	b=Integer.parseInt(t2.getText());
	if(b!=0)
	{
	sub=a/b;
	l3.setText("quotient is "+sub);
	}
	else 
		l3.setText("Divide by zero Error ");
}

}
}