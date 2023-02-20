import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DemoJPasswordField extends Frame implements ActionListener
{	
	JLabel l1;
	JPasswordField jpf;
	JButton b1;
	char[] pass,word=null,nu=null;
	int a=6;
	String str;
	public DemoJPasswordField(String title)
	{
		super(title);
		
		l1=new JLabel("Password:- ");
			add(l1);
			
			jpf=new JPasswordField(30);
			add(jpf); 
			
			b1=new JButton("Submit");
				b1.addActionListener(this);
				add(b1);
			pass= new char[]{'i','s','h','w','a','r'};
		
	}
	public void actionPerformed(ActionEvent e)
	{
				word=jpf.getPassword();
				if( a==word.length )
				{
				if(java.util.Arrays.equals(pass,word))
					{
						JOptionPane.showMessageDialog(null,"Hello, Welcome");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Hello, Wrong Password."); 
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Password is less than 6 character","Alert",JOptionPane.WARNING_MESSAGE);   
					
				}		
	}
	public static void main (String args[]) 
	{	
		Frame f=new DemoJPasswordField("Demo JPasswordField");
		f.setSize(850,450);
		f.setVisible(true);
		f.setLayout(new FlowLayout(1,20,20));
		WindowListener sam=new WindowAdapter()
		{
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
		};
		f.addWindowListener(sam);
	}
}

