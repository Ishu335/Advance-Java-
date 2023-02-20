import java.awt.*;
import java.awt.event.*;
class DemoProductTow extends Frame implements ActionListener
{
	TextField t1,t2,t3;
	Button b1;
	DemoProductTow(String title)
	{
		super(title);
			WindowListener sam =new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{	
					System.exit(0);
				}
			};
			addWindowListener(sam);
			t1=new TextField(30);
			t1.setBounds(250,360,20,30);
			t2=new TextField(30);
			t2.setBounds(350,360,20,30);
			t3=new TextField(30);
			t3.setBounds(450,360,20,30);
			
			b1=new Button("Multiply");
			b1.setBounds(550,360,20,30);
			b1.addActionListener(this);
			add(t1);
			add(t2);
			add(t3);
			add(b1);
	}
	public void actionPerformed(ActionEvent e)
	{
		 int a=Integer.parseInt(t1.getText());
		 int b=Integer.parseInt(t2.getText());
		 
		t3.setText(String.valueOf(a*b));
	}
	public static void main(String args[])
	{
		Frame f = new DemoProductTow("Product of a two numbers ");
		f.setSize(520,450);
		f.setVisible(true);
		f.setLayout(null);
	}
}