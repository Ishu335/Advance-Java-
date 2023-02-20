/* Write a program to change the background color of Applet when user performs events using Mouse*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class DemoBackground extends Applet 
{
	Button b;
	public void init()
	{
		setLayout(null);
		b = new Button("Hello");
	}
	public void mouseClicked(MouseEvent e)
	{
     setBackground(Color.red);
	}	
	public void paint(Graphics g)
	{
			g.drawString("Ishu",450,850);
	}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}

}
/*<applet code= "DemoBackgroound.java" height=450  width=500></applet>*/