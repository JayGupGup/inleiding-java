package Eight;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Button keer;
    Button plus;
    Button min;
    Button delen;
    String s;
    String q;
    double getal1, antwoord, getal2;

    public void init() {
        tekstvak1 = new TextField("", 20);
        tekstvak2 = new TextField("", 20);
        keer = new Button("*");
        plus = new Button("+");
        min = new Button("-");
        delen = new Button("/");
        keer.addActionListener(new keerListener());
        plus.addActionListener(new plusListener());
        min.addActionListener(new minListener());
        delen.addActionListener(new delenListener());
        add(tekstvak1);
        add(tekstvak2);
        add(keer);
        add(plus);
        add(min);
        add(delen);
        s = "";
        q = "";


    }

    public void paint(Graphics g) {
        g.drawString("Het antwoord is " + antwoord, 65, 60);
    }

    class keerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            q = tekstvak2.getText();
            getal1 = Double.parseDouble(s);
            getal2 = Double.parseDouble(q);
            antwoord = getal1 * getal2;
            repaint();
        }
    }

    class plusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            q = tekstvak2.getText();
            getal1 = Double.parseDouble(s);
            getal2 = Double.parseDouble(q);
            antwoord = getal1 + getal2;
            repaint();
        }
    }

    class minListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            q = tekstvak2.getText();
            getal1 = Double.parseDouble(s);
            getal2 = Double.parseDouble(q);
            antwoord = getal1 - getal2;
            repaint();
        }
    }

    class delenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            q = tekstvak2.getText();
            getal1 = Double.parseDouble(s);
            getal2 = Double.parseDouble(q);
            antwoord = getal1 / getal2;
            repaint();

        }
    }
}