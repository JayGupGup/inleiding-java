package Eleven;



import Six.Praktijkopdracht;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkopdracht extends Applet {
    TextField tekstvak;
    int invoer;
    int teller;
    int y = 0;
    String uitkomst;
    Button enter;

    public void init() {
        tekstvak = new TextField("", 20);
        add(tekstvak);
        uitkomst = "";
        enter = new Button("=");
        enter.addActionListener(new praktijkopdracht.enterlistener());

    }

    public void paint(Graphics g) {
        while (teller < 10) {
            y =+ 20;
            g.drawString("De tafel van " + invoer + " = ", 50, 50);
            teller =+invoer;
            teller++;
        }


    }
     class enterlistener implements ActionListener {
        public void actionPerformed(ActionEvent e){
        }
    }
}
