package Four;

import java.applet.Applet;
import java.awt.*;

public class two extends Applet {

    public void init(){
    }
    public void paint(Graphics g){
        g.drawRect(150,150,200,200);
        g.drawPolygon(new int[] {250,150, 350}, new int[] {0, 150, 150}, 3);
        g.drawRect(175, 280, 40,70);
        g.drawRect(240, 240, 80, 80);
        g.setColor(Color.YELLOW);
        g.fillOval(20,20,40,40);
        g.drawOval(20,20,40,40);

    }
}
