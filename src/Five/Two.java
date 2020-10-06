package Five;

import java.applet.Applet;
import java.awt.*;

public class Two extends Applet {
    int Valerie;
    int Jeroen;
    int Hans;
    public void init() {
    Valerie = 40 * 2;
    Jeroen = 100 * 2;
    Hans = 80 * 2;
    }


    public void paint(Graphics g){
        g.drawLine(40,20,40,200);
        g.drawString("X",40,215);
        g.drawLine(40,20,200,20);
        g.drawString("Y", 205, 30);
        g.drawLine(200,20,200,25 );
        g.drawLine(35,200,45,200);
        g.drawString("100",10,200);
        g.drawLine(35,160,45,160);
        g.drawString("80",10,160);
        g.drawLine(35,120,45,120);
        g.drawString("60",10,120);
        g.drawLine(35,80,45,80);
        g.drawString("40",10,80);
        g.drawLine(35,40,45,40);
        g.drawString("20",10,40);
        g.setColor(Color.BLUE);
        g.drawString("Valerie",45,260);
        g.setColor(Color.BLUE);
        g.fillPolygon(new int[] {50,50,80,80}, new int[] {Valerie,20,20,Valerie}, 4);
        g.setColor(Color.GREEN);
        g.drawString("Jeroen",95,260);
        g.setColor(Color.GREEN);
        g.fillPolygon(new int [] {100,100,130,130}, new int[] {Jeroen,20,20,Jeroen}, 4);
        g.setColor(Color.RED);
        g.drawString("Hans",145,260);
        g.setColor(Color.RED);
        g.fillPolygon(new int[] {150,150,180,180}, new int[] {Hans,20,20,Hans}, 4);

    }
}