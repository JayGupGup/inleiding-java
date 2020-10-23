package Eleven;

import java.applet.Applet;
import java.awt.*;

public class eight extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 0;
        int width = 10;
        int height = 10;


        while (teller < 100) {
            g.drawOval(20, 20, width, height);
            width += 10;
            height += 10;
            teller++;
        }
    }
}

