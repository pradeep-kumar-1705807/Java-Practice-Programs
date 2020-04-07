import java.awt.*;
import java.awt.event.*;
class First extends Frame {
	TextField tf;
	First(){
		tf=new TextField("I live Programming");
		Button b=new Button("click Me");

		tf.setBounds(400,400,170,40);
		b.setBounds(100,100,30,30);
		
		add(b);
		add(tf);



		setSize(500,500);
		setLayout(null);
		setVisible(true);
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e) {  
				Graphics g=getGraphics();  
				g.setColor(Color.BLUE);  
				g.fillOval(e.getX(),e.getY(),100,100);  
			}  
            public void mouseMoved(MouseEvent e) {

            }

		});
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e)
			{
				tf.setText("Mouse Clicked");
			}
			public void mouseEntered(MouseEvent e) {  
        tf.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        tf.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        tf.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        tf.setText("Mouse Released");  
    }
		});

		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				tf.setText("Hello World");
			}

		});
	}
	
	public static void main(String args[])
	{
		First f=new First();
	}
}