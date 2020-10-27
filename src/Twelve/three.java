package Twelve;

import Ten.four;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class three extends Applet {
    TextField tekstvak[] = new TextField[5];
    Button ok;
    String s;

    public void init() {
        Arrays.sort(tekstvak);
        int teller = 0;

        while (teller < 5) {
            tekstvak[4] = new TextField("");
            add(tekstvak[4]);
            teller++;
        }
        ok = new Button("OK");
        ok.addActionListener(new okListener());
        add(ok);
        s = "";
        tekstvak.addActionListener(new three.tekstvakListener());
    }
    public void paint(Graphics g){
        g.drawString("",50,50);
    }

    class okListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            repaint();
        }
    }
    class tekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            s = tekstvak.getText();
        }
    }
}
