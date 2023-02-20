/* . Write a program to count the number of clicks performed by the user in a Frame window */
import java.awt.*;
import java.awt.event.*;

class DemoClickedCountFrame extends Frame
{
	TextField f1;
	int n;
	String n1;
	DemoClickedCountFrame(String title)
	{
		super(title);	
		MouseListener mouse=new MouseAdapter()
		{
				public void mouseClicked(MouseEvent e)
				{
					n++;
					n1=String.valueOf(n);
					f1.setText(n1);
				}
		};
		addMouseListener(mouse);
		f1=new TextField(50);
		add(f1);
		f1.setBounds(850,250,50,50);
	}
	public static void main(String args[])
	{
		Frame f=new DemoClickedCountFrame("Demo");
		f.setVisible(true);
		f.setSize(800,800);
		f.setLayout(new FlowLayout(1,20,20));
			
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
