package Thirteen;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    public void init() {
        setSize(600, 500);
    }

    void tekenboom(Graphics g, int x, int y, int width, int heigt) {
        g.setColor(new Color(134, 41, 41));
        g.fillRect(x, y, width, heigt);
        g.setColor(Color.GREEN);
        g.fillOval(x-20, y-20, width*2, heigt/2);
    }

    void tekenbos(Graphics g, int width, int heigt, int rij, int kolom) {
        for (int j = 0; j < kolom; j++) {
            for (int i = 0; i < rij; i++) {

                if (j % 1 == 0) {
                    tekenboom(g, 50 + (i * (width+20)), 150 + (j * heigt), width, heigt);
                } else {

                    tekenboom(g, 50 + (width / 2) + (i * width), 150 + (j * heigt), width, heigt);
                }
            }
        }
    }

    public void paint(Graphics g) {

        tekenboom(g, 50, 150, 30, 130);
        tekenbos(g, 30, 130,5, 2);
    }
}
