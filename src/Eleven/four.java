package Eleven;

import java.applet.Applet;
import java.awt.*;

public class four extends Applet {

    public void init() {


    }

    public void paint(Graphics g) {
        int teller = 0;
        int y = 0;
        while (teller < 30) {
            teller += 3;
            y += 20;
            g.drawString("" + teller, 10, y);

        }

    }
}
