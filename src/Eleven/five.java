package Eleven;

import java.applet.Applet;
import java.awt.*;

public class five extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 0;
        int width = 50;
        int height = 50;
        int x = 250;
        int y = 250;

        while (teller < 5) {
            g.drawRect(x, y, width, height);
            x += 50;
            y += 50;

            teller++;
        }
    }
}
