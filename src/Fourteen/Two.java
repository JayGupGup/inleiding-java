package Fourteen;

import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class Two extends Applet {
    String[] deck = new String[52];
    String[] soorten = {"Klaver", "Schoppen", "Harten", "Ruiten"};
    String[] nummers = {"2", "A", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "vrouw", "heer"};
    String[] speler1 = new String[13], speler2 = new String[13], speler3 = new String[13], speler4 = new String[13];
    int random, random2;


    public void init() {
        fillDeck();
        for (int i = 13; i < ; i++) {

        }
        speler1[0] = deelKaart();

        deck[0] = "a";
        random = (int) Math.round(Math.random() * 52);
        random2 = (int) Math.round(Math.random() * 13);
    }

    public void paint(Graphics g) {
        g.drawString("", 50, 50);

    }

    private void fillDeck() {
        int teller = 0;
        for (int soortenCount = 0; soortenCount < soorten.length; soortenCount++) {
            for (int numberCount = 0; numberCount < nummers.length; numberCount++) {
                deck[teller] = soorten[soortenCount] + " " + nummers[numberCount];
                teller++;
            }
        }
        for (int deckTeller = 0; deckTeller < deck.length; deckTeller++) {
            System.out.println(deck[deckTeller]);
        }

    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck met een nieuwe lijst
        //het nieuwe deck is 1 kaart kleiner dan het oude deck
        String[] hulpLijst = new String[deck.length - 1];
        //om het nieuwe deck te vullen hebben we een index nodig
        int hulpindex = 0;
        //kopieer alle kaarten naar hulplijst behalve de kaart die net gedeeld is
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        //vervang nu deck met de nieuwe lijst
        deck = hulpLijst;
        //de methode geeft de random kaart terug
        return kaart;
    }

}