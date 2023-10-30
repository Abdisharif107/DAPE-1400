package Variabler2;

import static javax.swing.JOptionPane.showInputDialog;
public class Heltall {
    public static void main(String[] args) {
        String InnStreng1 = showInputDialog("Skriv inn et heltall: ");
        String InnStreng2 = showInputDialog("Skriv inn et heltall til:");
        int Tall1 = Integer.parseInt(InnStreng1);
        int Tall2 = Integer.parseInt(InnStreng2);
        int Sum = Tall1 + Tall2;
        String Ut = "Summen av tallene "+ Tall1 + " og "+ Tall2 +" er "+Sum;
        showInputDialog(null,Ut);


    }

}
