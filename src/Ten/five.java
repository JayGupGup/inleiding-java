package Ten;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class five extends Applet {
    TextField tekstvak;
    String invoer;
    String uitkomstgemiddelde;
    double aantal, totaal;
    double gemiddelde;


    public void init() {
        tekstvak = new TextField("", 2);
        tekstvak.addActionListener(new five.TekstvakListener());
        invoer = "";

        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde =" + gemiddelde, 50, 50);
        g.drawString("totaal aantal = " + totaal, 50, 110);
        g.drawString("aantal ingevoerde cijfers = " + aantal, 50, 90);
        g.drawString("Het gemiddelde =" + uitkomstgemiddelde ,50,70);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invoer = tekstvak.getText();
            totaal += Integer.parseInt(invoer);
            aantal++;
            gemiddelde = totaal / aantal;
            if (gemiddelde > 6) {
                 invoer = uitkomstgemiddelde ;
                 uitkomstgemiddelde = "voldoende";
            } else {
                uitkomstgemiddelde = "onvoldoende";
            }
            repaint();
        }
    }
}