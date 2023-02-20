//*Write a program using JTextField to perform the addition of two numbers.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

public class DemoAddOfJTextField extends Applet implements ActionListener
{
	JTextField jtf1,jtf2,jtf3;
	JButton jb;
	JLabel l1,l2;
	int a,b,sum=0;
	String str;
	
		public void init()
		{	
			l1=new JLabel("Frist No:-");
			add(l1);
			jtf1=new JTextField(30);
			add(jtf1);
			l2=new JLabel("Second No:-");
			add(l2);
			jtf2=new JTextField(30);
			add(jtf2);
			jb=new JButton("Add");
			add(jb);
			jtf3=new JTextField(30);
			add(jtf3);
			
			jb.addActionListener(this);
			
		}
		public void actionPerformed (ActionEvent e)
		{
				a=Integer.parseInt(jtf1.getText());
				b=Integer.parseInt(jtf2.getText());
				sum=a+b;
				str=String.valueOf(sum);
				jtf3.setText(str);
				str=null;
		}
}
/*<applet code="DemoAddOfJTextField.java" height=850 width=800></applet>*/