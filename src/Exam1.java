// Demonstrate CardLayout. 
import java.awt.*;
import java.awt.event.*;

class MyCardLayoutDemo extends Frame implements ActionListener, MouseListener {

    Checkbox Win98, winNT, solaris, mac;
    Panel osCards;
    CardLayout cardLO;
    Button Win, Other;

    MyCardLayoutDemo() {
        super("My CardLayout Demo");
        setLayout(new FlowLayout());
        setSize(300, 100);

        Win = new Button("Windows");
        Other = new Button("Other");
        add(Win);
        add(Other);

        cardLO = new CardLayout();
        osCards = new Panel();
        osCards.setLayout(cardLO); // set panel layout
        // to card layout
        Win98 = new Checkbox("Windows 98", null, true);
        winNT = new Checkbox("Windows NT");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("MacOS");

        // add Windows check boxes to a panel
        Panel winPan = new Panel();
        winPan.add(Win98);
        winPan.add(winNT);

        // Add other OS check boxes to a panel
        Panel otherPan = new Panel();
        otherPan.add(solaris);
        otherPan.add(mac);

        // add panels to card deck panel
        osCards.add(winPan, "Windows");
        osCards.add(otherPan, "Other");

        // add cards to main frame
        add(osCards);

        // register to receive action events
        Win.addActionListener(this);
        Other.addActionListener(this);

        // register mouse events
        addMouseListener(this);

        setVisible(true);
    }
    // Cycle through panels.
    public void mousePressed(MouseEvent me) {
        cardLO.next(osCards);
    }
    // Provide empty implementations for
    // the other MouseListener methods.
    public void mouseClicked(MouseEvent me){}
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == Win)
            cardLO.show(osCards, "Windows");
        else
            cardLO.show(osCards, "Other");
    }
    public static void main(String args[]){
        new MyCardLayoutDemo();
    }
}