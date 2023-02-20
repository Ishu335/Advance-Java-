import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DemoJTree extends Frame
{
	public static void main(String args[])
	{
		Frame f=new Frame("DemoJTree");
		f.setVisible(true);
		f.setSize(500,500);
			WindowListener sam=new WindowAdapter()
			{
				public void windowClosing(WndowEvent e)
				{
					System.exit(0);
				}	
			};
				f.addWindowListener(sam);
			DefaultMutableTreeNode A=new DefaultMutableTreeNode("A");
			
			DefaultMutableTreeNode B=new DefaultMutableTreeNode("B");
			DefaultMutableTreeNode C=new DefaultMutableTreeNode("C");
			A.add(B);
			A.add(C);
			
			DefaultMutableTreeNode D=new DefaultMutableTreeNode("D");
			B.add(D);
			
			DefaultMutableTreeNode E=new DefaultMutableTreeNode("E");
			DefaultMutableTreeNode F=new DefaultMutableTreeNode("F");
			C.add(E);
			C.add(F);
			
			JTree tree=new JTree(A);
			f.add(tree);
	}
} 
