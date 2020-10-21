package Ten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class four extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Label maandlabel;
    Label jaarlabel;
    String tekst, s;
    int jaartal;
    String q, tekst2;
    int maand;
    double getal1, getal2, antwoord;

    public void init() {
        tekstvak2 = new TextField("", 20);
        jaarlabel = new Label("Type een jaartal en druk op enter");
        tekstvak2.addActionListener(new four.tekstvak2Listener());
        tekstvak = new TextField("", 20);
        maandlabel = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        tekst2 = "";
        add(maandlabel);
        add(tekstvak);
        add(tekstvak2);
        add(jaarlabel);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 150, 100);
        g.drawString(tekst2, 150, 130);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    tekst = "januari = 31 dagen";
                    break;
                case 2:
                    tekst = "februari = 28 dagen";
                    break;
                case 3:
                    tekst = "maart = 31 dagen";
                    break;
                case 4:
                    tekst = "april = 30 dagen";
                    break;
                case 5:
                    tekst = "mei = 31 dagen";
                    break;
                case 6:
                    tekst = "juni = 30 dagen";
                    break;
                case 7:
                    tekst = "juli = 31 dagen";
                    break;
                case 8:
                    tekst = "augustus = 31 dagen";
                    break;
                case 9:
                    tekst = "september = 30 dagen";
                    break;
                case 10:
                    tekst = "oktober = 31 dagen";
                    break;
                case 11:
                    tekst = "november = 30 dagen";
                    break;
                case 12:
                    tekst = "december = 31 dagen";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }

            repaint();
        }
    }

    class tekstvak2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            q = tekstvak2.getText();
            jaartal = Integer.parseInt(q);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                tekst2 = "" + jaartal + " is een schrikkeljaar";
                tekst = "februari = 29 dagen";
            } else {
                tekst2 = "" + jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }

    class plusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            repaint();
        }
    }
}

