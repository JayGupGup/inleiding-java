package Thirteen;

import com.sun.deploy.util.BlackList;

import java.applet.Applet;
import java.awt.*;

public class Two extends Applet {


    public void init() {
        setSize(550, 500);

    }

    void tekenbaksteen(Graphics g, int x1, int y1, int width, int heigt) {
        g.setColor(Color.RED);
        g.fillRect(x1, y1, width, heigt);
        g.setColor(Color.BLACK);
        g.drawRect(x1, y1, width, heigt);


    }

    void tekenmuur(Graphics g, int width, int heigt, int rij, int kolom) {
        for (int j = 0; j < kolom; j++) {
            for (int i = 0; i < rij; i++) {

                if (j % 2 == 0) {
                    tekenbaksteen(g, 40 + (i * width), 50 + (j * heigt), width, heigt);
                } else {
                    tekenbaksteen(g, 40 + (width / 2) + (i * width), 50 + (j * heigt), width, heigt);
                }
            }
        }
    }

    public void paint(Graphics g) {
        tekenmuur(g, 50, 20, 10, 10);
    }
}
