package Twelve;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class four extends Applet {
    double getallen[] = new double[5];
    TextField tekstvak;
    int invoer, index;
    boolean q;

    public void init() {
        getallen[0] = 2;
        getallen[1] = 7;
        getallen[2] = 4;
        getallen[3] = 9;
        getallen[4] = 1;
        tekstvak = new TextField("", 10);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

    }

    public void paint(Graphics g) {
        if (q) {
            g.drawString("" + index, 50, 50);
        } else {
            g.drawString("Niet gevonden", 50, 70);
        }
    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            invoer = Integer.parseInt(s);
            q = false;
            for (int i = 0; i < 5; i++) {
                if (getallen[i] == invoer) {
                    index = i;
                    q = true;

                }
            }

            repaint();
        }
    }
}