package Klasserog;

import java.lang.annotation.Retention;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Bøker{
    String Tittel;
    double Pris;
    String Forfatter;
    String IBSNnummer;

    void SkrivUt(){
        System.out.println("Tittelen : "+Tittel);
        System.out.println("Prisen er : " +Pris);
        System.out.println("Forfatteren er : "+Forfatter);
        System.out.println("IBSN-Nummer :"+IBSNnummer);
    }
}
public class Oppgave1 {
    public static void main(String [] args){
        Bøker Bok1 = new Bøker();
        Bok1.Forfatter ="Sharif";
        Bok1.Tittel = "Mord";
        Bok1.Pris = 500.00;
        Bok1.IBSNnummer = " 467383639";
        Bok1.SkrivUt();

    }
}
class Bøker2{
    String Tittel;
    double Pris;
    String Forfatter;
    String IBSNnummer;

    void SkrivUt(){
        String Ut = "Tittelen : "+Tittel+"Prisen er : " +Pris+"Forfatteren er : "
                +Forfatter+"IBSN-Nummer :"+IBSNnummer;
        showInputDialog(null,Ut);
    }
}
class Oppgave2 {
    public static void main(String[] args) {
        Bøker2 Bok2 = new Bøker2();
        String Forfatter = showInputDialog("Forfatternavnet : ");
        String Tittel = showInputDialog("Tittelen er : ");
        String InnPris = showInputDialog("Prisen er : ");
        String Nummer = showInputDialog("IBSN-Nummeret er : ");
        double Pris = Double.parseDouble(InnPris);
        Bok2.Forfatter = Forfatter;
        Bok2.Tittel = Tittel;
        Bok2.Pris = Pris;
        Bok2.IBSNnummer = Nummer;
        Bok2.SkrivUt();


    }
}
class Oppgave3{
    /*
 Lag en klasse kalt Person. Denne skal inneholde følgende attributter:
navn
adresse
telefonnr
fødselsår
Lag en metode for å regne ut alderen til en person. Metoden skal ikke ta inn noen parametere,
 den skal regne ut alderen ut i fra fødselsår. Metoden skal returnere alderen.
Lag så en metode som, tar inn alderen, og som skriver ut alle vitale data for personen på følgende måte:
Per Hansen med adresse Osloveien 82 med telefonnummer 22124512 er 21 år.
Opprett et eller flere person objekter i main-metoden for å teste ut.
     */
    static class Person{
        public String Navn;
        public String Adress;
        public String Telefonnr;
        public int Fødselår;

        public int Alder(){
            return 2023 - Fødselår;
        }
        public void SkrivUt(int Alder){
            String Ut = Navn+" med adressen "+ Adress+" med telefonnummer "+Telefonnr
                    +" er "+Alder+ " år.";
            System.out.print(Ut);
        }
    }
    public static void main (String [] args){
        Person EnPerson = new Person();
        EnPerson.Navn = "Neymar Jr";
        EnPerson.Adress = "Brazila";
        EnPerson.Telefonnr = "12345678";
        EnPerson.Fødselår = 2003;
        int Alder = EnPerson.Alder();
        EnPerson.SkrivUt(Alder);
    }
}
class Oppgave4 {
    /*
     Utvid oppgave 3 med å lese inn dataene fra input-bokser og vise resultatet i en meldingsboks på følgende format:
     Navn: Per Hansen
     Adresse : Osloveien 82
     Telefonnr : 22124512
     Alder : 21 år.
     Tips: bruk \n for å få ny linje
    */
    static class Person2 {
        public String Navn;
        public String Adress;
        public String Telefonnr;
        public int Fødselår;

        public int Alder() {
            return 2023 - Fødselår;
        }

        public void SkrivUt(int Alder) {
            String Ut = "Navn : " + Navn + "·\nAdressen : " + Adress + "\n Telefonnummer : " + Telefonnr
                    + "\n Alder : " + Alder;
            showInputDialog(null, Ut);

        }
    }

    public static void main(String[] args) {
        Person2 EnPerson = new Person2();

        String Navn = showInputDialog("Navn : ");
        String Adresse = showInputDialog("Adressen : ");
        String Telefonnummnr = showInputDialog("Telefonnnummer");
        String InnFødselsår = showInputDialog("Fødselsår");
        int Fødselsår = Integer.parseInt(InnFødselsår);

        EnPerson.Navn = Navn;
        EnPerson.Adress = Adresse;
        EnPerson.Telefonnr = Telefonnummnr;
        EnPerson.Fødselår = Fødselsår;

        int Alder = EnPerson.Alder();
        EnPerson.SkrivUt(Alder);
    }
}
class Kalkulator {

    public static double Addere(double Tall1, double Tall2) {
        double Sum = Tall1 + Tall2;
        return Sum;
    }
    public static double Subtrahere(double Tall1, double Tall2){
        double Sum = Tall1 - Tall2;
        return Sum;
    }
    public static double Multiplisere(double Tall1, double Tall2){
        double Sum = Tall1 * Tall2;
        return Sum;
    }
    public static double Dvidere ( double Tall1, double Tall2){
        double Sum = Tall1 / Tall2;
        return Sum;
        
    }


    class Oppgave5 {
        /*
      Lag en klasse kalt Kalkulator. Denne klassen skal ha 4 statiske metoder som tar inn 2 parametere hver.
      Disse statiske metodene skal henholdsvis addere, subtrahere, multiplisere og dividere to desimaltall.

      Skriv også kode i main-metoden for å kalle disse metodene for å sjekke at de fungerer.
       */
        public static void main(String[] args) {
            System.out.println(" 2+2 er"+Kalkulator.Addere(2,2));
            System.out.println(" 2-2 er"+Kalkulator.Subtrahere(2,2));
            System.out.println(" 2*2 er"+Kalkulator.Multiplisere(2,2));
            System.out.println(" 2/2 er"+Kalkulator.Dvidere(2,2));
        }

    }


}


