package Aritmetikkoglogiskuttrykk;

import javax.swing.*;

public class Sammenlikninger {
    public static void main (String[]args){
     String innString1 = JOptionPane.showInputDialog("Skriv inn Tall 1");
     String innString2 =JOptionPane.showInputDialog("Skriv inn Tall 2");
     int tall1 = Integer.parseInt(innString1);
     int tall2 = Integer.parseInt(innString2);
     if (tall1==tall2){
         JOptionPane.showMessageDialog(null, "Tall 1 er lik Tall 2");
     }
     if (tall1 != tall2){
         JOptionPane.showMessageDialog(null, "Tall 1 er ikke lik Tall 2");
     }
     if   (tall1 < tall2){
        JOptionPane.showMessageDialog(null, "Tall 1 er mindre lik Tall 2");
     }
     if (tall1 > tall2 ){
         JOptionPane.showMessageDialog(null,"Tall 1 er større enn Tall 2");
     }
     if (tall1 <= tall2){
         JOptionPane.showMessageDialog(null,"Tall 1 er mindre eller lik Tall 2");
     }
        if (tall1 >= tall2){
            JOptionPane.showMessageDialog(null,"Tall 1 er større eller lik Tall 2");
        }

    }
}
