package Four;

import java.applet.Applet;
import java.awt.*;

public class One extends Applet {

    public void init(){
    }
    public void paint(Graphics g){

        g.drawPolygon(new int[] {200, 100, 200}, new int[] {100, 200, 200}, 3);
    }
}
