import javax.swing.*;
import java.awt.*;

class DemoJScrollPanel extends JApplet
{
	public void start()
	{
		Container c = getContentPane();
		String str="Demonstraction of a JScrollPanel";
		
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		
		JTextArea ji=new JTextArea(str);
		JScrollPane p=new JScrollPane(ji,v,h);
		c.add(p);
	}
} 
/*<applet code="DemoJScrollPanel.java" width=850 height=750></applet>*/