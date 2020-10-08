package Eight;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Three extends Applet {
    TextField btw;
        String s;
        Button bereken;
        double getal;

    public void init(){
        btw = new TextField(" ", 20);
        btw.addActionListener(new btwListener() );
        bereken = new Button("Bereken");
        bereken.addActionListener(new berekenListener() );
        add(btw);
        add(bereken);
        s ="";
    }
    public void paint(Graphics g){
        g.drawString("Het getal is " + getal * 1.21, 65, 60 );
        }

     class  btwListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String s = btw.getText();
            getal = Double.parseDouble( s );
            //getal = Integer.parseInt( s );
            repaint();
        }



         }

     class berekenListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            s = btw .getText();
            getal = Double.parseDouble( s );
            //getal = Integer.parseInt( s );
            repaint();
        }
    }
}



