package Strenger;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Variabel{
    public static void main(String []args) {
        String Navn = "Abdi";
        String Etternavn = "Sharif";
        String ut = Navn + " " + Etternavn;
        String Ord = "Alderen til";
        String Age = " er 20 år";
        String Adresse = "Osloveien 54";
        String Posadresse = "Oslo";
        String nummer2 = "1234";
        String Postnummer = "postnummer 1234";
        String Setning = "bor i";
        String setning = "som har";
        String i = "i";
        String Abdis = ". Abdi`s alder er 20 år.";
        String alder = "20 år";
        String inn = "\n Navn: " + Navn + " " + Etternavn +  "\n Adresse: " + Adresse + "\n Postnummer: " + nummer2 + "\n Poststed: " + Posadresse + "\n Aldre: " + alder;
        String in = "\n Navn: " + Navn + " " + Etternavn +  "\n Adresse: " + Adresse + "\n Postnummer: " + nummer2 + "\n Poststed: " + Posadresse + "\n Aldre: " + alder;




        System.out.println(Ord + " " + Navn + " " + Etternavn + "" + Age);
        System.out.println(Navn + " " + Etternavn + " " + Setning + " " + Adresse + " " + setning + " " + Postnummer + " " + i + " " + Posadresse + "" + Abdis);
        System.out.println(inn);
        showMessageDialog(inn);


    }

    private static void showMessageDialog(String in) {
    }


}
