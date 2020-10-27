package Twelve;


import java.applet.Applet;
import java.awt.*;


public class two extends Applet {
    Button[] knoppen = new Button[25];


    public void init() {
        int teller = 0;
        setSize(550, 500);
        while (teller < 25) {
            knoppen[24] = new Button("knop");
            add(knoppen[24]);
            teller++;
        }
    }
}
