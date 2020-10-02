package h01;


/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
        import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Show extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
      setBackground(Color.white);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Jay", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Guptar", 50, 70 );
    }

}



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