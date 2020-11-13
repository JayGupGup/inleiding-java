package Fourteen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Praktijkopdracht extends Applet {
    TextField tekstvak;
    Button speel;
    int x;
    private Image niggario;
    private URL pad;
    double y;
    String uitkomst;


    public void init() {
        setSize(700,650);
        tekstvak = new TextField("", 20);
        speel = new Button("Speel");
        speel.addActionListener(new knopListener());


        x = 20;
        y = 1.5;
        add(speel);
        add(tekstvak);
    }

    void tekenNiggario(Graphics g, int x, int y, int width, int height) {
        pad = Praktijkopdracht.class.getResource("/resources/");
        niggario = getImage(pad, "niggario.png");
        g.drawImage(niggario, x, y, width, height, this);

    }

    void tekenniggarios(Graphics g, int width, int heigt, int rij, int kolom) {
        for (int j = 0; j < kolom; j++) {
            for (int i = 0; i < rij; i++) {

                if (j % 1 == 0) {
                    tekenNiggario(g, 50 + (i * (width + 20)), (int) (70 + (j * heigt * y)), width, heigt);
                } else {

                    tekenNiggario(g, 50 + (width / 2) + (i * width), 70 + (j * heigt), width, heigt);
                }
            }
        }
    }

    public void paint(Graphics g) {
        tekenNiggario(g, 50, 520, 100, 75);
        tekenNiggario(g, 165, 520, 100, 75);
        tekenNiggario(g, 290, 520, 100, 75);
        tekenniggarios(g, 100, 75, 5, 4);
    }


    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            uitkomst = tekstvak.getText();
            int invoer;
            invoer = Integer.parseInt(uitkomst);
            if (invoer < 4) {

            } else {
                getGraphics().setColor(Color.RED);
                getGraphics().drawString("Onjuiste invoer",330,45);
            }


        }

    }
}
