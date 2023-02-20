import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DemoJComboBox extends Frame
{	
	 Label l1;
	JComboBox jc;
	DemoJComboBox(String title)
	{
		super(title);
		WindowListener sam=new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		};
		addWindowListener(sam);
		
		l1 = new Label(" Select the different states of India using:- ");
		jc = new JComboBox();
		jc.addItem("Maharashtra");
		jc.addItem("Delhi");
		jc.addItem("Uttar Pradesh");
		jc.addItem("Kerala");
		l1.setBounds(920,300,200,30);
		add(l1);
		jc.setLocation(450,520);
		jc.setSize(50,20);
		add(jc);
		
			
	}
	
	public static void main(String args[])
	{
		Frame f=new DemoJComboBox("Demo JComboBox");
		f.setSize(800,700);
		f.setVisible(true);	
		f.setLayout(null);

	}
}