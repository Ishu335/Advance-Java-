import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AnAppletWithMouseEventsBackgroundColor extends Applet implements MouseListener 
{
	public void init()
	{
		addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e)
	{
	  setBackground(Color.red);
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
}
/*<applet code= "AnAppletWithMouseEventsBackgroundColor.java" height=450  width=500></applet>*/