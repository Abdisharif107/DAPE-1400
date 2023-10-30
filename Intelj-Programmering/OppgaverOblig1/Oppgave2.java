package OppgaverOblig1;

import static javax.swing.JOptionPane.showInputDialog;

class Vare {
    private String Navn;
    private static int Antall;
    private static double Pris;

    // Konstruktør med alle attributter
     public Vare(String Navn, int Antall, double Pris){
         this.Navn = Navn;
         this.Antall = Integer.parseInt(String.valueOf(Antall));
         this.Pris = Double.parseDouble(String.valueOf(Pris));
     }


    // get / set metoder
    // antall og pris må være større enn null
     public String getNavn(){
         return Navn;
     }
     public void setNavn(){
         this.Navn = Navn;
     }
     public int getAntall(){
          return Antall;
     }
     public void setAntall(int newAntall){
         if(newAntall > 0){
             this.Antall = newAntall;
         }
         else {
             this.Antall = 0;
         }
     }
     public double getPris(){
         return Pris;
     }
     public void setPris(double newpris){

         if (newpris > 0)       {
             this.Pris = newpris;
         }
         else {
             this.Pris = 0;
         }
     }

    // metode for å beregne totalpris (pris * antall)
     public static double TotalPris(){
         double TotallPris = Antall * Pris;
         return TotallPris;
     }
}

public class Oppgave2 {
    public static void main(String[] args) {
        // les inn navn, antall og pris for vare 1
        String Navn1;
        int Antall1;
        double Pris1;

        String InnNavn1 = showInputDialog("Skriv inn navn på den første varen");
        String InnAntall = showInputDialog("Skriv inn antall av den første varen");
        String InnPris1 = showInputDialog("Skriv inn pris for den første varen");

        // les inn navn, antall og pris for vare 2
        String Navn2;
        int Antall2;
        double Pris2;

        String InnNavn2 = showInputDialog("Skriv inn navn på den andre varen");
        String InnAntall2 = showInputDialog("Skriv inn antall for den andre varen");
        String InnPris2 = showInputDialog("Skriv inn pris for den andre varen");

        /* bruk avvikshåntering (try/catch) for å
         konvertere antall og pris for vare 1 og vare 2
         */
        try {
            Navn1 = InnNavn1;
            Antall1 = Integer.parseInt(InnAntall);
            Pris1 = Double.parseDouble(InnPris1);
        }
        catch (Exception e) {
            Navn1 = "Ikke gyldig";
            Antall1 = 0;
            Pris1 = 0;
        }
        try {
            Navn2 = InnNavn2;
            Antall2 = Integer.parseInt(InnAntall2);
            Pris2 = Double.parseDouble(InnPris2);

        }
        catch (Exception e){
            Navn2 = "Ikke gyldig";
            Antall2 = 0;
            Pris2 = 0;
        }
        // opprett to vare-objekter med de innleste verdiene
        Vare Vare1 = new Vare(Navn1, Antall1, Pris1);
        Vare Vare2 = new Vare(Navn2, Antall2, Pris2);

        // beregn og skriv ut total pris for alle varer i System.out
        double TotallPris1 = Vare1.TotalPris();
        double TotallPris2 = Vare2.TotalPris();
        double TotallPrisen =  TotallPris1 + TotallPris2;
        String Ut = "Totallprisen ble : "+TotallPrisen+" kr";
        System.out.println(Ut);
    }
}



        













