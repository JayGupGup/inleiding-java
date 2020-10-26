package Eleven;

import java.applet.Applet;
import java.awt.*;

public class nine extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setSize(500,500);
        int breedte = 50;
        int hoogte = 50;
        int x = 50;
        int y = 50;
        int kolom;
        for (kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.drawRect(x, y, breedte, hoogte);
            }
            g.drawRect(x, y, breedte, hoogte);
            x += breedte;
        }
        x = 50;
        y += hoogte;
        for (kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.drawRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            }
            g.drawRect(x, y, breedte, hoogte);
            x += breedte;

        }
        x = 50;
        y += hoogte;
        for (kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.drawRect(x, y, breedte, hoogte);
            }
            g.drawRect(x, y, breedte, hoogte);
            x += breedte;

        }
        x = 50;
        y += hoogte;
        for (kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.drawRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            }
            g.drawRect(x, y, breedte, hoogte);
            x += breedte;
        }
        x = 50;
        y += hoogte;
        for (kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.drawRect(x, y, breedte, hoogte);
            }
            g.drawRect(x, y, breedte, hoogte);
            x += breedte;

        }
        x = 50;
        y += hoogte;
        for (kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.drawRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            }
            g.drawRect(x, y, breedte, hoogte);
            x += breedte;
        }
        x = 50;
        y += hoogte;
        for (kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.drawRect(x, y, breedte, hoogte);
            }
            g.drawRect(x, y, breedte, hoogte);
            x += breedte;

        }
        x = 50;
        y += hoogte;
        for (kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.drawRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            }
            g.drawRect(x, y, breedte, hoogte);
            x += breedte;
        }
    }
}