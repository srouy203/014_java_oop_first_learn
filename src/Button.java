// Demonstrate check boxes. 
import java.awt.*;
import java.awt.event.*;

class MyCheckboxDM extends Frame implements ItemListener {
    String msg = "";
    Checkbox Win98, winNT, solaris, mac;

    MyCheckboxDM(){
        super("My Checkbox Demo");
        setLayout(new FlowLayout());
        setSize(450, 300);

        Win98 = new Checkbox("Windows 98", null, true);
        winNT = new Checkbox("Windows NT");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("MacOS");

        add(Win98);
        add(winNT);
        add(solaris);
        add(mac);

        Win98.addItemListener(this);
        winNT.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }
    // Display current state of the check boxes.
    public void paint(Graphics g) {
        msg = "Current state: ";
        g.drawString(msg, 6, 80);
        msg = "  Windows 98: " + Win98.getState();
        g.drawString(msg, 6, 100);
        msg = "  Windows NT: " + winNT.getState();
        g.drawString(msg, 6, 120);
        msg = "  Solaris: " + solaris.getState();
        g.drawString(msg, 6, 140);
        msg = "  MacOS: " + mac.getState();
        g.drawString(msg, 6, 160);
    }
    public static void main(String args[]){
        new MyCheckboxDM();
    }
}