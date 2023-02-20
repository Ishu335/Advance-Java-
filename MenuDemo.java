
import java.awt.*;
import java.awt.event.*;

public class MenuDemo extends Frame
{
	MenuBar mb;
	MenuItem ml,m2,m3,m4;
	Menu mn;
	MenuShortcut ms;
	
	public  MenuDemo(String title)
	{
		super(title);
		
		ms=new MenuShortcut(KeyEvent. VK_X);
		mn=new Menu("File");
		mb=new MenuBar();
		setMenuBar(mb);
		ml=new MenuItem("New...");
		m2=new MenuItem("Open...");
		m3=new MenuItem("Save As...");
		m4=new MenuItem("Exit",ms);
		
			mn.add(ml);
			mn.add(m2);
			mn.add(m3);
			mn.addSeparator();
			mn.add(m4);
			mb.add(mn);
	}
	public static void main(String[] args)
	{
		Frame md = new MenuDemo("MenuBar Demo");
		md.setVisible(true);
		md.setSize(500,500);
		 
		
		md.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
			System.exit(0);
			}
		});
		
	}

}