//<applet code="MyAppletImage" width=900 height=900 >Hello World</applet>
import java.applet.Applet;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class MyAppletImage extends Applet
{
	Image picture;
	 public void init()
	 {
	 	picture=getImage(getDocumentBase(),"egg.png");


	 }
	public void paint(Graphics g)
	{
		
				g.drawImage(picture,500+i,400,this);
		
    
	}


}