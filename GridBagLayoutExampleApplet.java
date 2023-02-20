import java.awt.Button;  
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;  
import javax.swing.*;  
import java.applet.*;
public class GridBagLayoutExampleApplet extends Applet{  
    public void init()
	{  
            GridBagLayoutExampleApplet a = new GridBagLayoutExampleApplet();  
	}  
    public GridBagLayoutExampleApplet() 
	{  
		GridBagLayout grid = new GridBagLayout();  
            GridBagConstraints gbc = new GridBagConstraints();  
            setLayout(grid);  
            
            GridBagLayout layout = new GridBagLayout();  
    this.setLayout(layout);  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridx = 0;  
    gbc.gridy = 0;  
    this.add(new Button("Button One"), gbc);  
    gbc.gridx = 1;  
    gbc.gridy = 0;  
    this.add(new Button("Button two"), gbc);  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.ipady = 20;  
    gbc.gridx = 0;  
    gbc.gridy = 1;  
    this.add(new Button("Button Three"), gbc);  
    gbc.gridx = 1;  
    gbc.gridy = 1;  
    this.add(new Button("Button Four"), gbc);  
    gbc.gridx = 0;  
    gbc.gridy = 2;  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridwidth = 2;  
    this.add(new Button("Button Five"), gbc);  
	}
      
}  
/*<applet code= GridBagLayoutExampleApplet height=750 width=850></applet>*/