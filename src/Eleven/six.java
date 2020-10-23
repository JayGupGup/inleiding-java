package Eleven;

import java.applet.Applet;
import java.awt.*;

public class six extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 0;
        int width = 10;
        int height = 10;
        int x = 250;
        int y = 250;

        while (teller < 50) {
            g.drawOval(x, y, width, height);
            x -= 5;
            y -= 5;
            width += 10;
            height += 10;
            teller++;
        }
    }
}
