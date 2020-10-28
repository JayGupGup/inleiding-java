package Twelve;

import org.w3c.dom.css.Counter;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class six extends Applet {
    double getallen[] = new double[21];
    TextField tekstvak;
    int invoer, index;
    boolean q;
    int counter;

    public void init() {
        getallen[0] = 2;
        getallen[1] = 1;
        getallen[2] = 0;
        getallen[3] = 4;
        getallen[4] = 3;
        getallen[5] = 5;
        getallen[6] = 3;
        getallen[7] = 2;
        getallen[8] = 1;
        getallen[9] = 5;
        getallen[10] = 4;
        getallen[11] = 10;
        getallen[12] = 9;
        getallen[13] = 6;
        getallen[14] = 8;
        getallen[15] = 7;
        getallen[16] = 10;
        getallen[17] = 8;
        getallen[18] = 9;
        getallen[19] = 7;
        getallen[20] = 6;
        tekstvak = new TextField("", 10);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);
    }

    public void paint(Graphics g) {
        if (q) {

            g.drawString("" + counter,50,70);
        } else {
            g.drawString("Niet gevonden", 50, 70);
        }
    }

    class tekstvakListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            invoer = Integer.parseInt(s);
counter = 0;
            q = false;
            for (int i = 0; i < 21; i++) {
                if (getallen[i] == invoer) {
                    index = i;
                    q = true;
                    counter ++;

                }
            }
            repaint();
        }
    }
}