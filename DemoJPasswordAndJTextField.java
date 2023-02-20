//*Write a program using JPasswordField and JTextField to demonstrate the use of user//
//authentication
import java.applet.*;
import javax.swing.*;
public class DemoJPasswordAndJTextField extends Applet
{
	JPasswordField jpf;
	JTextField jtf;
	JLabel l,l2;
	public void init()
	{
		l=new JLabel("Name:- ");
		add(l);
		jtf = new JTextField(50);
		add(jtf);
		l2=new JLabel("Password:- ");
		add(l2);
		jpf=new JPasswordField(30);
		add(jpf); 
	}
} 
/*<applet code="DemoJPasswordAndJTextField.java" height=850 width=900></applet>*/