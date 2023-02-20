import java.awt.*;
import java.applet.*;


class DemoGridButton2 extends Applet
{ 
	int n=1;
	public void init()
	{	setLayout(new GridLayout(3,3,20,20));
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				add(new Button(""+n));
				n++;
			}
		}
		
	}
	public void paint(Graphics g)
	{
		
		g.drawString("Welcome",150,350);
	}
	
}
/*<applet code= DemoGridButton2.java height=500 width=450></applet>*/ 
