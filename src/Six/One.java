package Six;

import java.applet.Applet;
import java.awt.*;

public class One extends Applet {
int geldverdeling;
int geld;
    public void init(){
geld = 113;
geldverdeling = 4;
    }
    public void paint(Graphics g){
    g.drawString("iedereen krijgt " + geld / geldverdeling, 20,20);
        g.drawString("Jan krijgt " + geld / geldverdeling, 20,30);
        g.drawString("Ali krijgt " + geld / geldverdeling, 20,40);
        g.drawString("Jeannette krijgt " + geld / geldverdeling, 20,50);
        g.drawString("Jay krijgt " + geld / geldverdeling, 20,60);

    }
}
