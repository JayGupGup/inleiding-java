package Ten;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class one extends Applet {
    TextField tekstvak;
    int hoogstegetal;
    String uitkomst;
    Button enter;


    public void init() {
        tekstvak = new TextField("", 20);
        add(tekstvak);
        uitkomst = "";
        enter = new Button("=");
        enter.addActionListener(new enterlistener());
        add(enter);

    }

    public void paint(Graphics g) {
        g.drawString("Het hoogste getal =" + hoogstegetal, 50, 50);
    }

    class enterlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            uitkomst = tekstvak.getText();
            int invoer;
            invoer = Integer.parseInt(uitkomst);
            if (invoer > hoogstegetal) {
                hoogstegetal = invoer;
            }

            repaint();
        }


    }


}