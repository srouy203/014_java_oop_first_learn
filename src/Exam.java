import java.awt.*;
import java.awt.event.*;

class MyCardLayout extends Frame implements ActionListener {
    Panel flow = new Panel();
    Panel card = new Panel();

    MyCardLayout(){
        super("setLayout Example");
        flow.setLayout(new FlowLayout());
        card.setLayout(new CardLayout());


        addComp("Button", new Button("Button"));
        addComp("TextArea", new TextArea("TextArea"));
        addComp("List", new List());

        add(flow, BorderLayout.NORTH);
        add(card, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        setBounds(100, 100, 200, 200);
        setVisible(true);
    }
    void addComp(String label, Component c) {
        Button b = new Button(label);
        card.add(c, label);
        flow.add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent evt) {
        String str = evt.getActionCommand();
        CardLayout l = (CardLayout)card.getLayout();
        l.show(card, str);
    }
    public static void main(String[] args) {
        System.out.print("First Value: ");
        System.out.print("Second Value: ");
        new MyCardLayout();
    }
}