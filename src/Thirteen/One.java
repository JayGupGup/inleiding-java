package Thirteen;

import java.applet.Applet;
import java.awt.*;

public class One extends Applet {
    public void init(){

    }
     void tekendriehoek(Graphics g, int x1, int x2, int x3, int y1, int y2, int y3){
g.drawLine(x1,y1,x2,y2);
g.drawLine(x2,y2,x3,y3);
g.drawLine(x3,y3,x1,y1);
     }
     public void paint(Graphics g){
        tekendriehoek(g,20,120,70,100,100,20);
     }
}
