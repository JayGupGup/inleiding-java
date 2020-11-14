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
    int totalNiggario;
    int columnWidth = 5;
    String onjuisteinvoer;

    public void init() {
        setSize(700, 650);
        tekstvak = new TextField("", 20);
        speel = new Button("Speel");
        speel.addActionListener(new knopListener());


        x = 20;
        y = 1.5;
        add(speel);
        add(tekstvak);
        totalNiggario = 23;
    }

    void tekenNiggario(Graphics g, int x, int y, int width, int height) {
        pad = Praktijkopdracht.class.getResource("/resources/");
        niggario = getImage(pad, "niggario.png");
        g.drawImage(niggario, x, y, width, height, this);
    }

    void tekenniggarios(Graphics g, int width, int heigt, int rij, int kolom, int total) {
        int leftOvers = total % kolom;
        boolean laatMaar; // = (leftOvers == 0) ? false : true; //ternary
        if (leftOvers == 0) {
            laatMaar = false;
        } else {
            laatMaar = true;
        }
        if (leftOvers != 0) rij++;
        System.out.println(leftOvers);
        for (int j = 0; j < rij; j++) {
            for (int i = 0; i < kolom; i++) {
                if (j == (rij - 1) && leftOvers != 0) leftOvers--;
                if (j % 1 == 0) {
                    tekenNiggario(g, 50 + (i * (width + 20)), (int) (70 + (j * heigt * y)), width, heigt);
                } else {
                    tekenNiggario(g, 50 + (width / 2) + (i * width), 70 + (j * heigt), width, heigt);
                }
                if (laatMaar && leftOvers == 0) break;
            }
        }
    }

    public void paint(Graphics g) {
        int rows = (int) totalNiggario / columnWidth;
        tekenniggarios(g, 100, 75, rows, columnWidth, totalNiggario);
        g.setColor(Color.RED);
        g.drawString("" + onjuisteinvoer, 330, 45);
    }


    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            uitkomst = tekstvak.getText();
            int invoer;
            invoer = Integer.parseInt(uitkomst);
            if (invoer < 4) {
                totalNiggario -= invoer;
                System.out.println(totalNiggario);
                Math.random();
            } else {


            }

            repaint();
        }

    }
}
