package Eight;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Two extends Applet {
    Button mannen;
    Button vrouwen;
    Button potentiëleMannen;
    Button potentiëleVrouwen;
    int totaal;
    int mannenTotaal;
    int vrouwenTotaal;
    int potentiëleMannenTotaal;
    int potentiëlevrouwenTotaal;

    public void init() {
        mannen = new Button("Mannen");
        MannenListener ml = new MannenListener();
        mannen.addActionListener(ml);
        add(mannen);
        vrouwen = new Button("Vrouwen");
        VrouwenListener vl = new VrouwenListener();
        vrouwen.addActionListener(vl);
        add(vrouwen);
        potentiëleMannen = new Button("Potentiële Mannen");
        PotentiëleMannenListener pml = new PotentiëleMannenListener();
        potentiëleMannen.addActionListener(pml);
        add(potentiëleMannen);
        potentiëleVrouwen = new Button("Potentiële Vrouwen");
        PotentiëleVrouwenListener pvl = new PotentiëleVrouwenListener();
        potentiëleVrouwen.addActionListener(pvl);
        add(potentiëleVrouwen);
    }

    public void paint(Graphics g) {
        g.drawString("Totaal = " + totaal, 140, 210);
        g.drawString("Mannen totaal =" + mannenTotaal, 140, 90);
        g.drawString("Vrouwen Totaal = " + vrouwenTotaal, 140, 120);
        g.drawString("Potentiële Mannen = " + potentiëleMannenTotaal, 140, 150);
        g.drawString("Potentiële Vrouwen" + potentiëlevrouwenTotaal, 140, 180);
    }

    class MannenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal++;
            mannenTotaal++;
            repaint();
        }
    }

    class VrouwenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal++;
            vrouwenTotaal++;
            repaint();
        }

    }

    class PotentiëleMannenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal++;
            potentiëleMannenTotaal++;
            repaint();
        }
    }

    class PotentiëleVrouwenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal++;
            potentiëlevrouwenTotaal++;
            repaint();
        }
    }
}
