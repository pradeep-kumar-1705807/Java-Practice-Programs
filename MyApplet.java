 import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/* <applet code="MyApplet" width=500 height=500></applet>*/
public class MyApplet extends Applet
{

Label l1,l2,l3;
TextField t1,t2;
Button b1;
public void init()
{
  l1=new Label("First Number");
  l2=new Label("Second Number");
  l3=new Label();
  t1=new TextField();
  t2=new TextField();
  b1=new Button("sum");
  setLayout(null);
  l1.setBounds(120,50,100,20);
  l2.setBounds(120,100,100,20);
  l3.setBounds(20,200,100,20);
  t1.setBounds(250,50,100,20);
  t2.setBounds(250,100,100,20);
  b1.setBounds(140,150,100,20);
  add(l1);
  add(l2);
  add(l3);
  add(t1);
  add(t2);
  add(b1);
  b1.addActionListener();
}
public class myHandler implements addActionListener{

}
}
