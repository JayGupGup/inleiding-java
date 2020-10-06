package Five;

import java.applet.Applet;
import java.awt.*;

public class One extends Applet {
    int breedte;
    int hoogte;
    Color opvulkleur;
    Color lijnkleur;
    public void init(){
        breedte = 260;
        hoogte = 205;
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
    }
    public void paint(Graphics g) {
        g.drawLine(15, 20, 275, 20);
        g.drawString("Lijn", 130, 30);
        g.drawPolygon(new int[]{275,275, 15, 15}, new int[]{40, 245, 245, 40}, 4);
        g.drawString("Rechthoek", 110, 265);
        g.setColor(opvulkleur);
        g.fillPolygon(new int[]{540, 540, 280, 280}, new int[]{40, 245,245, 40}, 4);
        g.setColor(lijnkleur);
        g.drawRoundRect(280,40,breedte,hoogte,breedte,230);
        g.drawString("gevulde rechtoek met ovaal",325,breedte + 5);
        g.drawRoundRect(15,300,breedte,hoogte,30,30);
        g.drawString("afgeronde rechthoek",85,530);
        g.setColor(opvulkleur);
        g.fillRoundRect(280,300,breedte,hoogte,breedte,230);
        g.setColor(lijnkleur);
        g.drawString("gevulde ovaal",360,530);
        g.drawRoundRect(550,40,breedte,hoogte,breedte,230);
        g.setColor(opvulkleur);
        g.fillArc(550,40,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal omheen",600,breedte + 5);
        g.drawOval(575,300,200,hoogte);
        g.drawString("Cirkel",650,530);

    }
}

