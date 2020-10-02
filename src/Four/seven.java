package Four;

import java.applet.Applet;
import java.awt.*;

public class seven extends Applet {
    public void init(){
    }
    public void paint(Graphics g){
        g.drawRoundRect(50,50,100,100,40,50);
        g.setColor(Color.lightGray);
        g.fillRoundRect(50,50,100,100,40,50);
        g.setColor(Color.BLACK);
        g.fillRoundRect(80,80,10,10,10,10);
        g.fillRoundRect(80,115,10,10,10,10);
        g.fillRoundRect(115,80,10,10,10,10);
        g.fillRoundRect(115,115,10,10,10,10);
    }
}
