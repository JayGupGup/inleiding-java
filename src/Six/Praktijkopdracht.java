package Six;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {
    double Cijfereen,Cijfertwee,Cijferdrie,gemiddelde, gemkeertien;
    int gemalsint;
    public void init(){
    Cijferdrie =  6.9;
    Cijfertwee =  6.3;
    Cijfereen =  5.9;
    gemiddelde = (Cijferdrie + Cijfertwee + Cijfereen) /3;
    gemkeertien = gemiddelde * 10;
    gemalsint = (int) gemkeertien;
    gemkeertien = (double) gemalsint;
    gemiddelde = gemkeertien / 10;
    }
    public void paint(Graphics g){
        g.drawString("Gemiddelde = " + gemiddelde,20,20 );
    }
}
