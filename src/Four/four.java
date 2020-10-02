package Four;

import java.applet.Applet;
import java.awt.*;

public class four extends Applet {

    public void init(){
    }

public void paint(Graphics g){
        g.drawLine(40,40,40,200);
        g.drawString("X",40,35);
        g.drawLine(40,200,200,200);
        g.drawString("Y", 205, 200);
        g.drawLine(200,195,200,205 );
        g.drawLine(35,168,45,168);
        g.drawString("20",10,168);
        g.drawLine(35,136,45,136);
        g.drawString("40",10,136);
        g.drawLine(35,104,45,104);
        g.drawString("60",10,104);
        g.drawLine(35,72,45,72);
        g.drawString("80",10,72);
        g.drawLine(35,40,45,40);
        g.drawString("100",10,40);
        g.setColor(Color.BLUE);
        g.drawString("Valerie",45,220);
        g.setColor(Color.BLUE);
        g.fillPolygon(new int[] {50,50,80,80}, new int[] {200,136,136,200}, 4);
        g.setColor(Color.GREEN);
        g.drawString("Jeroen",95,220);
        g.setColor(Color.GREEN);
        g.fillPolygon(new int [] {100,100,130,130}, new int[] {200,40,40,200}, 4);
        g.setColor(Color.RED);
        g.drawString("Hans",145,220);
        g.setColor(Color.RED);
        g.fillPolygon(new int[] {150,150,180,180}, new int[] {200,72,72,200}, 4);


}




}
