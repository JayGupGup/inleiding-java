package h01;

import java.applet.Applet;
import java.awt.*;

public class Two extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.BLUE);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.drawString("Welcome to Java!!", 50, 60 );
    }
}

/*


 */
/*
//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
        import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Show2 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.BLUE);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.drawString("Welcome to Java!!", 50, 60 );
    }

}
 */