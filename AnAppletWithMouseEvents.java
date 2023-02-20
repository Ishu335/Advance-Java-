import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AnAppletWithMouseEvents extends Applet implements MouseListener {
public void init()
{
    addMouseListener(this);
}
public void paint(Graphics g)
{

    g.setColor(Color.green);
    g.drawRect(10, 30, 150, 150);
}
public void mouseClicked(MouseEvent e)
{
    String clickDesc;
    if (e.getClickCount() == 2)
        clickDesc = "double";
    else
        clickDesc = "single";

    System.out.println("Mouse was " + clickDesc + "-clicked at location (" +
        e.getX() + ", " + e.getY() + ")");

}
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
public void mousePressed(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
}
/*<applet code= "AnAppletWithMouseEvents.java" height=450  width=500></applet>*/