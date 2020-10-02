package Four;

import java.applet.Applet;
import java.awt.*;

public class three extends Applet {
    public void init(){
    }
    public void paint(Graphics g){
        g.setColor(Color.GRAY);
        g.fillRect(50,100,10,160);
        g.setColor(Color.red);
        g.fillRect(60, 100,100,30);
        g.setColor(Color.white);
        g.fillRect(60,130,100,30);
        g.setColor(Color.BLUE);
        g.fillRect(60,160,100,30);

    }




}
