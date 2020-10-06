package Six;

import java.applet.Applet;
import java.awt.*;

public class Two extends Applet {
int seconde;
int minuut;
int uur;
int dag;
int jaar;
    public void init(){
        seconde = 1;
        minuut = 60;
        uur = 60;
        dag = 24;
        jaar = 365;
    }
 public void paint(Graphics g){
        g.drawString("1 uur =" + seconde * minuut * uur + "secondes",20,20);
     g.drawString("1 dag =" + seconde * minuut * uur * dag +" secondes",20,40);
     g.drawString("1 jaar =" + seconde * minuut * uur * dag * jaar + "secondes",20,60);
 }
}
