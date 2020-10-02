package Four;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {
    public void init(){
    }
    public void paint(Graphics g) {
        g.drawLine(15, 20, 275, 20);
        g.drawString("Lijn", 130, 30);
        g.drawPolygon(new int[]{275,275, 15, 15}, new int[]{40, 245, 245, 40}, 4);
        g.drawString("Rechthoek", 110, 265);
        g.setColor(Color.MAGENTA);
        g.fillPolygon(new int[]{540, 540, 280, 280}, new int[]{40, 245,245, 40}, 4);
        g.setColor(Color.BLACK);
        g.drawRoundRect(280,40,260,205,260,230);
        g.drawString("gevulde rechtoek met ovaal",325,265);
        g.drawRoundRect(15,300,260,205,30,30);
        g.drawString("afgeronde rechthoek",85,530);
        g.setColor(Color.MAGENTA);
        g.fillRoundRect(280,300,260,205,260,230);
        g.setColor(Color.BLACK);
        g.drawString("gevulde ovaal",360,530);
        g.drawRoundRect(550,40,260,205,260,230);
        g.setColor(Color.MAGENTA);
        g.fillArc(550,40,260,205,0,45);
        g.setColor(Color.BLACK);
        g.drawString("Taartpunt met ovaal omheen",600,265);
        g.drawOval(575,300,200,200);
        g.drawString("Cirkel",650,530);


    }
}
