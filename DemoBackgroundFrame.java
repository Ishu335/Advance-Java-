/* Write a program to change the background color of Applet when user performs events using Mouse*/
import java.awt.*;
import java.awt.event.*;

class DemoBackgroundFrame extends Frame
{
	Button b1,b2,b3;
	DemoBackgroundFrame(String title)
	{
		super(title);	
	}
	public static void main(String args[])
	{
		Frame f=new DemoBackgroundFrame("Demo");
		f.setVisible(true);
		f.setSize(800,800);
		
			MouseListener mouse=new MouseAdapter()
		{
				public void mouseClicked(MouseEvent e)
				{
					f.setBackground(Color.red);
				}
		};
		f.addMouseListener(mouse);
		
		WindowListener sam= new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		};
		f.addWindowListener(sam);
		
	}
	
}
