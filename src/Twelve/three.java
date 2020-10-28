package Twelve;


import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class three extends Applet {
    TextField[] tekstvak = new TextField[5];
    int[] sorter = new int[5];
    Button ok;

    public void init() {


        for (int teller = 0; teller < 5; teller++) {
            tekstvak[teller] = new TextField("",10);
            add(tekstvak[teller]);

        }
        ok = new Button("OK");
        ok.addActionListener(new okListener());
        add(ok);


    }


    class okListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            for (int teller = 0; teller < 5; teller++) {
                sorter[teller] = Integer.parseInt(tekstvak[teller].getText());
            }
            Arrays.sort(sorter);

            for (int i = 0; i < 5; i++) {
                tekstvak[i].setText("" + (sorter[i]));

            }
        }
    }
}
