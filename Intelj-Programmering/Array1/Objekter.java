package Array1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Objekter {
    private String Tittel;
    private double Pris;

    public String GetTittel () { return Tittel; }

    public void SetTittel (String Tittel) { this.Tittel = Tittel;}

    public double GetPris () { return Pris; }

    public void SetPris (double Pris){
        if (Pris > 0){
            this.Pris = Pris;
        }
    }

    public Objekter(String Tittel,   double Pris){
        this.Tittel = Tittel;
        this.Pris = Pris;
    }
}

class ArrayObj{
    public static void main(String [] args){
        Objekter[] Filmer = new Objekter[100];
        int Antall = 0;
        double innPris = Double.parseDouble(showInputDialog("Skriv inn prisen på filmen, avslutt med 0 : "));
        String innTittel = showInputDialog("Skriv inn tittel : ");
        while (Antall < Filmer.length && innPris > 0){
            Objekter EnFilm = new Objekter(innTittel, innPris);
            Filmer[Antall] = EnFilm;
            Antall ++;
            innPris = Double.parseDouble(showInputDialog("Skriv inn prisen på filmen, avslutt med 0 : "));
            innTittel = showInputDialog("Skriv inn tittel : ");
        }
        // Ferdig innlest
        // Skriv ut
        int i = 0;
        String Ut = "Her er alle filmene : \n";
        while (Filmer[i]!=null){
            Ut += "Tittel : "+Filmer[i].GetTittel();
            Ut += " Pris : "+Filmer[i].GetPris()+"\n";
            i++;
        }
        showMessageDialog(null, Ut);
    }
}
