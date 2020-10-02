package Four;

import java.applet.Applet;
import java.awt.*;

public class six extends Applet {
    public void init(){
    }
    public void paint(Graphics g){
        g.setColor(Color.GRAY);
        g.fillRoundRect(100,50,65,115,55,105);
        g.setColor(Color.BLACK);
        g.fillRoundRect(105,55,55,105,50,100);
        g.setColor(Color.RED);
        g.fillOval(123,70,20,20);
        g.setColor(Color.orange);
        g.fillOval(123,100,20,20);
        g.setColor(Color.GREEN);
        g.fillOval(123,130,20,20);
        g.setColor(Color.BLACK);
        g.fillRect(122,163,20,90);
        g.setColor(Color.GRAY);
        g.fillRect(122,173,20,10);
        g.fillRect(122,193,20,10);
        g.fillRect(122,213,20,10);
        g.fillRect(122,233,20,10);

    }
}
