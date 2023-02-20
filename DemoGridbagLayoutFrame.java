import java.awt.*;
import java.awt.event.*;


class DemoGridbagLayoutFrame extends Frame
{
	GridBagLayout gridbag;
	GridBagConstraints c;
	public DemoGridbagLayoutFrame(String title)
	{
		super(title);
		WindowListener sam= new WindowAdapter()
		{
			public void closingWindow(WindowEvent e)
			{
				System.exit(0);
			}
		};
		addWindowListener(sam);
		
		 gridbag = new GridBagLayout();
			 setLayout(gridbag);
			  c= new GridBagConstraints();
			 
	}
	public  void makebutton (String name,GridBagLayout gridbag , GridBagConstraints c) 
	{
		Button button =new Button(name);
		gridbag.setConstraints(button,c);
		add(button);
	}
	public static void main(String args[])	
	{		
		Frame f=new DemoGridbagLayoutFrame("Graidbag layout");
		f.setVisible(true);
		f.setSize(800,800);
		f.setBackground(Color.red);
		
			 c.fill=GridBagConstraints.BOTH;
			 c.weightx=1.0;
				 makebutton("Button one",gridbag,c);
				 makebutton("Button two",gridbag,c);
				 makebutton("Button three",gridbag,c);
				 
				 c.gridwidth=GridBagConstraints.REMAINDER;
				 makebutton("Button four",gridbag,c);
					c.weightx=0.0;
				makebutton("Button five",gridbag,c);	
				
				c.gridwidth=GridBagConstraints.RELATIVE;
				 makebutton("Button six",gridbag,c);
				
				c.gridwidth=GridBagConstraints.RELATIVE;
				 makebutton("Button seven",gridbag,c);
				 c.gridwidth =1;
				 c.gridheight =2;
					c.weighty =1.0;
				 makebutton("Button eight ",gridbag,c);
					c.weighty =0.0;
				 c.gridwidth=GridBagConstraints.REMAINDER;
				 c.gridheight=1;
				 makebutton("Button nine",gridbag,c);
				 makebutton("Button ten",gridbag,c);
	}
	
}