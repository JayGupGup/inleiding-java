package Twelve;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkopdracht extends Applet {
    int[] nummers = new int[10];
    String[] namen = new String[10];
    TextField nums;
    TextField namn;
    boolean q;
    int teller = 0;
    int y;
    Button knop;

    public void init() {
        setSize(550, 500);
        namn = new TextField("", 10);
        add(namn);
        nums = new TextField("", 10);
        add(nums);
        knop = new Button("ok");
        knop.addActionListener(new knoplistener());
        add(knop);
    }
public void paint(Graphics g){

        if (q){
            for (int i = 0; i < 10; i++) {
                y += 20;
                g.drawString(""+ nummers[i],100,y);
                g.drawString(""+ namen[i],50,y);
            }
        }
}
    class knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String a, b = "";
            a = nums.getText();
            int tijdelijk = Integer.parseInt(a);
            b = namn.getText();
            if (teller < 10) {
                nummers[teller] = tijdelijk;
                namen[teller] = b;
            }
            if (teller == 10) {
                q = true;

            }
            teller++;
            repaint();
        }
    }
}
