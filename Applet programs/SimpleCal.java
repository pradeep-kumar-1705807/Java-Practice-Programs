//<applet code="SimpleCal" width=700 height=500></applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class SimpleCal extends Applet
{
		TextField t1,t2;
		Label l1,l2,l3;
		Button b1,b2,b3,b4,b5;
	public void init()
	{
		
		t1=new TextField();
		t2=new TextField();
		l1=new Label("First Number");
		l2=new Label("Second Number ");
		l3=new Label();
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("*");
		b4=new Button("/");
		b5=new Button("%");
		
		setLayout(null);
		l1.setBounds(50,50,100,30);
		l2.setBounds(50,100,100,30);
		l3.setBounds(100,400,100,30);
		b1.setBounds(100,200,100,30);
		b2.setBounds(250,200,100,30);
		b3.setBounds(100,300,100,30);
		b4.setBounds(250,250,100,30);
		b5.setBounds(100,250,100,30);
		t1.setBounds(200,50,100,30);
		t2.setBounds(200,100,100,30);
		
		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
		{
			int a,b,sum;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			sum=a+b;
			l3.setText("sum is "+sum);
			
		}
		});
		b2.addActionListener(new addClass2());
		b3.addActionListener(new addClass3());
		b4.addActionListener(new addClass4());
		b5.addActionListener(new addClass5());
		
	}
	/*public class addClass1 implements ActionListener
	{     
		public void actionPerformed(ActionEvent e)
		{
			int a,b,sum;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			sum=a+b;
			l3.setText("sum is "+sum);
			
		}
	}*/
	public class addClass2 implements ActionListener
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
	public class addClass3 implements ActionListener
	{     
		public void actionPerformed(ActionEvent e)
		{
			int a,b,sum;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			sum=a*b;
			l3.setText("Product is "+sum);
			
		}
	}
	public class addClass4 implements ActionListener
	{     
		public void actionPerformed(ActionEvent e)
		{
			int a,b,sum;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			sum=a/b;
			l3.setText("Quotient is "+sum);
			
		}
	}
	public class addClass5 implements ActionListener
	{     
		public void actionPerformed(ActionEvent e)
		{
			int a,b,sum;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			sum=a%b;
			l3.setText("Remainder is "+sum);			
		}
	}
}