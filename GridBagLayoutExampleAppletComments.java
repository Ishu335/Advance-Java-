import java.awt.*;  
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;  
import javax.swing.*;  
import java.applet.*;
public class GridBagLayoutExampleAppletComments extends Applet{  
    public void init()
	{  
            GridBagLayoutExampleAppletComments a = new GridBagLayoutExampleAppletComments();  
	}  
    public GridBagLayoutExampleAppletComments() 
	{  
		GridBagLayout grid = new GridBagLayout();  
            GridBagConstraints gbc = new GridBagConstraints();  
            setLayout(grid);  
            
            GridBagLayout layout = new GridBagLayout();  
    this.setLayout(layout);  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridx = 0;  
    gbc.gridy = 0;  
    this.add(new Label("Name:- "), gbc);  
    gbc.gridx = 1;  
    gbc.gridy = 0;  
    this.add(new TextField(" ",50), gbc);  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.ipady = 20;  
    gbc.gridx = 0;  
    gbc.gridy = 1;  
    this.add(new Label("Comments "), gbc);  
    gbc.gridx = 1;  
    gbc.gridy = 1;  
    this.add(new TextArea("",50,60,0), gbc);  
    gbc.gridx = 0;  
    gbc.gridy = 2;  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridwidth = 2;  
    this.add(new Button("Submit"), gbc);  
            
            
            
            
      
        }  
      
}  
/*<applet code= GridBagLayoutExampleAppletComments height=450 width=850></applet>*/