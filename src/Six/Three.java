package Six;

import java.applet.Applet;
import java.awt.*;

public class Three extends Applet {
    int a;
    int b;
    public void init(){
        a = 999999999;
        b = 888888888;
    }
    public void paint(Graphics g){
        g.drawString("a + b ="  + a * b, 20, 20);
    }
}
