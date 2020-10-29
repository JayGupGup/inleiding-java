package Thirteen;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    public void init() {
        setSize(600, 500);
    }

    void tekenboom(Graphics g, int x1, int y1, int width1, int heigt1, int x2, int y2, int width2, int heigt2) {
        g.setColor(new Color( 165, 42,42));
        g.fillRect(x1, y1, width1, heigt1);
        g.setColor(Color.GREEN);
        g.fillOval(x2, y2, width2, heigt2);
    }

    void tekenbos(Graphics g, int width, int heigt, int width2, int heigt2, int rij, int kolom) {
        for (int j = 0; j < kolom; j++) {
            for (int i = 0; i < rij; i++) {

                if (j % 1 == 0) {
                    tekenboom(g, 50 + (i * width), 150 + (j * heigt), width, heigt, 35 + (i * width), 130 + (j * heigt), width2, heigt2);
                } else {

                    tekenboom(g, 50 + (width / 2) + (i * width), 150 + (j * heigt), width, heigt, 35 + (width / 2) + (i * width), 130 + (j * heigt), width2, heigt2);
                }
            }
        }
    }

    public void paint(Graphics g) {

        tekenboom(g, 50, 150, 30, 130, 35, 130, 60, 60);
        tekenbos(g, 30, 130, 60, 60, 5, 2);
    }
}
