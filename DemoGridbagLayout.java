import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class DemoGridbagLayout extends Applet 
{
	
	public void init() 
	{		
			 GridBagLayout gridbag = new GridBagLayout();
			 setLayout(gridbag);
			 GridBagConstraints c= new GridBagConstraints();
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
	public void paint(Graphics g)
	{
		g.drawString("DrawString",450,350);
	}
	protected void makebutton (String name,GridBagLayout gridbag , GridBagConstraints c) 
	{
		Button button =new Button(name);
		this.add(button);
		gridbag.setConstraints(button,c);
		
	}
	
}
/*<applet code= "DemoGridbagLayout.java" height=450  width=850></applet>*/