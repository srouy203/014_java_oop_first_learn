import java.awt.*;
import java.awt.event.*;

class MyBorderLayout extends Frame implements ActionListener{
    Button status;
    BorderLayout layout;

    MyBorderLayout(){
        super("BorderLayout Gaps Example");

        // The default layout for Frame is BorderLayout
        layout = (BorderLayout)getLayout();

        Button b;
        add(b = new Button("V+"), BorderLayout.NORTH);
        b.addActionListener(this);
        add(b = new Button("H+"), BorderLayout.WEST);
        b.addActionListener(this);
        status = new Button("Vgap="+layout.getVgap() +
                ", Hgap="+layout.getHgap());
        add(status, BorderLayout.CENTER);
        add(b = new Button("H-"), BorderLayout.EAST);
        b.addActionListener(this);
        add(b = new Button("V-"), BorderLayout.SOUTH);
        b.addActionListener(this);

        setBounds(100, 200, 350, 250);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        setVisible(true);
    }
    public void actionPerformed(ActionEvent evt) {
        String what = evt.getActionCommand();

        if ("H+".equals(what)) {
            layout.setHgap(layout.getHgap()+5);
        } else if ("H-".equals(what)) {
            layout.setHgap(Math.max(0, layout.getHgap()-5));
        } else if ("V+".equals(what)) {
            layout.setVgap(layout.getVgap()+5);
        } else if ("V-".equals(what)) {
            layout.setVgap(Math.max(0, layout.getVgap()-5));
        }
        // Update status button
        status.setLabel("Vgap="+layout.getVgap() +
                ", Hgap="+layout.getHgap());
        //invalidate();
        validate();
    }
    public static void main(String[] args){
        new MyBorderLayout();
    }
}