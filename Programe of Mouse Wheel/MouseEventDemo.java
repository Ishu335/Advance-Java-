/*You can find the demo's code in MouseEventDemo.java (in a .java source file) and BlankArea.java (in a .java source file). Here is the demo's mouse event handling code:
	Mouse events tell you when the user uses the mouse (or similar input device) to interact with a component. Mouse events occur when the cursor enters or exits a component's onscreen area and when the user presses or releases one of the the mouse buttons.
Tracking the cursor's motion involves significantly more system overhead than tracking other mouse events, so mouse-motion events are separated into a separate listener type (see How to Write a Mouse Motion Listener).

To track mouse wheel events, you can register a mouse-wheel listener. See How to Write a Mouse Wheel Listener for more information.

If your program needs to detect both mouse events and mouse-motion events, you can use Swing's convenient MouseInputAdapter class, which implements both MouseListener and MouseMotionListener. It does not implement the MouseWheelListener interface. [Footnote: MouseInputAdapter doesn't directly implement MouseListener and MouseMotionListener. Instead, it implements MouseInputListener, a convenience interface that implements MouseListener and MouseMotionListener.]

The following example shows a mouse listener. At the top of the window is a blank area (implemented, strangely enough, by a class named BlankArea). The mouse listener listens for events both on the BlankArea and on its container, an instance of MouseEventDemo. Each time a mouse event occurs, a descriptive message is displayed under the blank area. By moving the cursor on top of the blank area and occasionally pressing mouse buttons, you can fire mouse events.
*/
			/*
 * MouseEventDemo.java is a 1.4 example that
 * requires the following file:
 *   BlankArea.java
 */

import javax.swing.*;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class MouseEventDemo extends JPanel 
                            implements MouseListener {
    BlankArea blankArea;
    JTextArea textArea;
    final static String newline = "\n";

    public MouseEventDemo() {
        super(new GridBagLayout());
        GridBagLayout gridbag = (GridBagLayout)getLayout();
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.weightx = 1.0;
        c.weighty = 1.0;

        c.insets = new Insets(1, 1, 1, 1);
        blankArea = new BlankArea(new Color(0.98f, 0.97f, 0.85f));
        gridbag.setConstraints(blankArea, c);
        add(blankArea);

        c.insets = new Insets(0, 0, 0, 0);
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(200, 75));
        gridbag.setConstraints(scrollPane, c);
        add(scrollPane);

        //Register for mouse events on blankArea and the panel.
        blankArea.addMouseListener(this);
        addMouseListener(this);

        setPreferredSize(new Dimension(450, 450));
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }

    public void mousePressed(MouseEvent e) {
       saySomething("Mouse pressed (# of clicks: "
                    + e.getClickCount() + ")", e);
    }

    public void mouseReleased(MouseEvent e) {
       saySomething("Mouse released (# of clicks: "
                    + e.getClickCount() + ")", e);
    }

    public void mouseEntered(MouseEvent e) {
       saySomething("Mouse entered", e);
    }

    public void mouseExited(MouseEvent e) {
       saySomething("Mouse exited", e);
    }

    public void mouseClicked(MouseEvent e) {
       saySomething("Mouse clicked (# of clicks: "
                    + e.getClickCount() + ")", e);
    }

    void saySomething(String eventDescription, MouseEvent e) {
        textArea.append(eventDescription + " detected on "
                        + e.getComponent().getClass().getName()
                        + "." + newline);
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        JFrame frame = new JFrame("MouseEventDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new MouseEventDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}