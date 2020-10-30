package Fourteen;

import java.applet.Applet;
import java.awt.*;

public class One extends Applet {
String[] kaartnummer = new String[13];
String[] kaartsoort = new String[4];
int random2;
int random;
    public void init(){
        kaartsoort[0] = "harten" ;
        kaartsoort[1] = "ruiten";
        kaartsoort[2] = "schoppen";
        kaartsoort[3] = "klaver";
        kaartnummer[0] = "a";
        kaartnummer[1] = "2";
        kaartnummer[2] = "3";
        kaartnummer[3] = "4";
        kaartnummer[4] = "5";
        kaartnummer[5] = "6";
        kaartnummer[6] = "7";
        kaartnummer[7] = "8";
        kaartnummer[8] = "9";
        kaartnummer[9] = "10";
        kaartnummer[10] = "boer";
        kaartnummer[11] = "vrouw";
        kaartnummer[12] = "heer";
        random = (int)Math.round(Math.random() * 12);
        random2 = (int)Math.round(Math.random() * 3);

    }


    public void paint(Graphics g) {
        g.drawString("" + kaartsoort[random2] + " "+ kaartnummer[random],50,50);

    }
}
