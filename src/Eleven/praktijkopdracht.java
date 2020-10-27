package Eleven;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkopdracht extends Applet {
    TextField tekstvak;
    int invoer;
    String s;
    Button enter;
    int y = 50;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);
        enter = new Button("=");
        enter.addActionListener(new tekstvakListener());
        add(enter);
        s = "";
    }

    public void paint(Graphics g) {
        y = 50;
        for (int teller = 1; teller < 11; teller++) {
            g.drawString(invoer +" * " + invoer + " = " +  teller * invoer, 50, y);
            y += 10;
        }
    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            System.out.println(s);
            invoer = Integer.parseInt(s);
            repaint();
        }
    }


}

