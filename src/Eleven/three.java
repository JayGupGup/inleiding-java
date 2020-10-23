package Eleven;

import java.applet.Applet;
import java.awt.*;

public class three extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 1;
        int y = 0;
        int getal1;
        int getal2;
        int getalnieuw;
        getal1 = 1;
        getal2 = 1;
        y += 20;
        g.drawString("1", 30, y);
        y += 20;
        g.drawString("1", 30, y);
        while (teller < 21) {
            y += 20;
            getalnieuw = getal1 + getal2;
            g.drawString("" + getalnieuw, 30, y);
            getal1 = getal2;
            getal2 = getalnieuw;
            teller++;
        }
    }
}
