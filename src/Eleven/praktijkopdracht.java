package Eleven;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkopdracht extends Applet {

    public void init() {
        TextField tekstvak;
        tekstvak = new TextField("", 20);
        //tekstvak = new  praktijkopdracht.(new tekstvakListener());
        add(tekstvak);

    }

    public void paint(Graphics g) {
        int invoer;
        int teller = 0;
        int y = 0;
        while (teller < 10) {
            teller += 3;
            y += 20;
            g.drawString("" + teller, 10, y);

        }

    }

    class tekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }
}
