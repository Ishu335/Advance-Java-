//*Write a program to demonstrate the use of mouseDragged and mouseMoved method of MouseMotionListener
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoMotionEvent extends Applet implements MouseMotionListener
{
	TextField f;
	int a=1,b=0;
	public void init()
	{
		addMouseMotionListener(this);
		
	}
	public void paint(Graphics g)
	{
		if(a == b)
		{
		g.drawString("Mouse is Dragging",850,100);
			b--;
		}
		else
		{
			g.drawString("Mouse is Moveing",850,100);
		}
		
	}
	public void mouseDragged(MouseEvent e)
	{	b++;
		repaint();
	
	}
	public void mouseMoved(MouseEvent e)
	{
			repaint();
	}
}
/*<applet code="DemoMotionEvent.java" height=850 width=750 ></applet>*/