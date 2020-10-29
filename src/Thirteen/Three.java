package Thirteen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Three extends Applet {
    Button bakstenen;
    Button betonblokken;
    boolean betonknop;
    boolean bakknop;

    public void init() {
        setSize(600, 500);
        bakstenen = new Button("rode bakstenen");
        bakstenen.addActionListener(new knoplistener());
        add(bakstenen);
        betonblokken = new Button("betonblokken");
        betonblokken.addActionListener(new knop2listener());
        add(betonblokken);

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
        if (bakknop && !betonknop) {
            tekenmuur(g, 50, 20, 10, 18);
        }
        if (betonknop && !bakknop) {
            tekenbetonmuur(g, 50, 35, 10, 10);
        }
    }

    void tekenbetonblok(Graphics g, int x1, int y1, int width, int heigt) {
        g.setColor(Color.gray);
        g.fillRect(x1, y1, width, heigt);
        g.setColor(Color.BLACK);
        g.drawRect(x1, y1, width, heigt);
    }

    void tekenbetonmuur(Graphics g, int width, int heigt, int rij, int kolom) {
        for (int j = 0; j < kolom; j++) {
            for (int i = 0; i < rij; i++) {

                if (j % 2 == 0) {
                    tekenbetonblok(g, 40 + (i * width), 50 + (j * heigt), width, heigt);
                } else {
                    tekenbetonblok(g, 40 + (width / 2) + (i * width), 50 + (j * heigt), width, heigt);
                }
            }
        }
    }


    class knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            betonknop = false;
            bakknop = true;
            repaint();
        }
    }

    class knop2listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            betonknop = true;
            bakknop = false;
            repaint();
        }
    }
}
