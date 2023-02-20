import java.awt.*;
import java.awt.event.*;
class DemoGridButton extends Frame
{
	int n=1;
	DemoGridButton(String title)
	 {
		super(title);

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				add(new Button(""+n));
				n++;
			}
			
		}

	}

	public static void main(String args[])
	{
		Frame f = new DemoGridButton("Grid Button Layout");
		f.setVisible(true);
		f.setSize(700,300);
		f.setLayout(new GridLayout(2,2,10,10));

		
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
			System.exit(0);
			}
		});


	}

}
