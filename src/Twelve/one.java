package Twelve;

import java.applet.Applet;
import java.awt.*;

public class one extends Applet {
    double[] cijfers;
    double gemiddelde;
    double som;
    double gemx10;
    int gemalsint;

    public void init() {
        cijfers = new double[10];
        cijfers[0] = 7.4;
        cijfers[1] = 5.7;
        cijfers[2] = 6.5;
        cijfers[3] = 8.1;
        cijfers[4] = 5.3;
        cijfers[5] = 9.2;
        cijfers[6] = 3.5;
        cijfers[7] = 7.0;
        cijfers[8] = 6.3;
        cijfers[9] = 6.9;

        for (int teller = 0; teller < cijfers.length; teller++) {
            System.out.println(cijfers[teller]);
            som =  (som + cijfers[teller]);
            System.out.println(som);
        }
        gemiddelde = som / cijfers.length;
        gemx10 = gemiddelde *10;
        gemalsint = (int)gemx10;
        gemx10 = (double) gemalsint;
        gemiddelde = gemx10 /10;
    }

    public void paint(Graphics g){

        g.drawString("Het gemiddelde = "+ gemiddelde ,48,220);
        g.drawString("", 50, 50);
        {
            for (int teller = 0; teller < cijfers.length; teller++) {
                g.drawString("" + cijfers[teller], 50, 20 * teller + 20);
            }
        }
    }

}








 
