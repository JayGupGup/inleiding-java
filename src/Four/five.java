package Four;

import javax.accessibility.AccessibleContext;
import java.applet.Applet;
import java.awt.*;

public class five extends Applet {
    public void init(){
    }
    public void paint(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillArc(20,20,100,50,0,360);
        setBackground(Color.BLUE);

    }

}
