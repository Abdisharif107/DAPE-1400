package KlasserogObjekter2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Person{
    /*Lag en klasse «Person» med følgende private attributter:

fornavn
etternavn
adresse
telefonnr
Lag en konstruktør som setter disse ved instansiering av klassen. Lag så «get», «set» metoder for disse.

Lag så en metode som skriver ut dataene via Swing sin ShowMessageDialog med linjeskift mellom de ulike feltene.

Skriv så kode i «main» for å lese inn dataene via Swing sin input, opprette et objekt og kalle metoden over for å vise disse.
*/
    private String Fornavn;
    private String Etternavn;
    private String Adresse;
    private String Telefonnr;

    public Person(String Fornavn, String Etternavn, String Adresse, String Telefonnr){
        this.Fornavn = Fornavn;
        this.Etternavn = Etternavn;
        this.Adresse = Adresse;
        this.Telefonnr = Telefonnr;
    }
    public String getFornavn(){
        return Fornavn;
    }
    public void setFornavn(String Fornavn){
        this.Fornavn = Fornavn;
    }
    public String getEtternavn(){
        return Etternavn;
    }
    public void setEtternavn(){
        this.Etternavn = Etternavn;
    }
    public String getAdresse(){
        return Adresse;
    }
    public void setAdresse(){
        this.Adresse = Adresse;
    }
    public String getTelefonnr(){
        return Telefonnr;
    }
    public void setTelefonnr(){
        this.Telefonnr = Telefonnr;
    }
    public void Skrivut(){
        String Ut = "Navn : "+Fornavn+ " "+Etternavn+"\n"+
                "Adresse : "+Adresse+"\n"+"Telefonnummer : "+Telefonnr;
        showMessageDialog(null,Ut);
    }

}

public class Oppgaver {
    public static void main( String [] args){
      String Fornavn = showInputDialog("Skriv inn Fornavnet");
      String Etternavn = showInputDialog("Skriv inn Etternavnet");
      String Adresse = showInputDialog("Skriv inn Adressen");
      String Telefonnr = showInputDialog("Skriv in Telefonnummert");
      Person EnPerson = new Person(Fornavn,Etternavn,Adresse,Telefonnr);
      EnPerson.Skrivut();
    }
    static class Bensinkjøp{
        private String Sted;
        private String Type;
        private double AntallLiter;
        private double PrisPerLiter;
        private String Tidspunkt;

        public Bensinkjøp(String Sted, String Type, double AntallLiter, double PrisPerLter, String Tidspunkt){
            this.Sted = Sted;
            this.Type = Type;
            this.AntallLiter = AntallLiter;
            this.PrisPerLiter = PrisPerLter;
            this.Tidspunkt = Tidspunkt;
        }
        public String getSted(){
            return Sted;
        }
        public void setSted(){
            this.Sted = Sted;
        }
        public String getType(){
            return Type;
        }
        public void setType(){
            this.Type = Type;
        }
        public double getAntallLiter(){
            return AntallLiter;
        }
        public void setAntallLiter(){
            this.AntallLiter = AntallLiter;
        }
        public double getPrisPerLiter(){
            return PrisPerLiter;
        }
        public void setPrisPerLiter(){
            this.PrisPerLiter = PrisPerLiter;
        }
        public String getTidspunkt(){
            return Tidspunkt;
        }
        public void setTidspunkt(){
            this.Tidspunkt = Tidspunkt;
        }
        public double FinnTotalPrisen(){
            return AntallLiter *PrisPerLiter;
        }
    }
}
 class Oppgave3{
    /*
    Lag en klasse kalt BensinKjøp for å representere informasjon om kjøp av bensin.
    Klassen skal ha 5 private attributter:
    Bensinstasjonens sted (en streng)
    Type bensin (en streng)
    Antall liter fylt (et desimaltall)
    Prisen pr. liter (et desimaltall)
    Tidspunkt fylt (en streng)
    Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse.
    Lag så en metode finnTotalPrisen. Denne skal ikke ha noen parametere inn, men skal returnere prisen som et
    desimaltall.
    Metoden skal da multiplisere antall liter fylt med prisen pr. liter.

    Lag så kode i main for å teste ut denne klassen. Bruk String.format("%.2f", prisen); for å få to desimaler.
    */
     public static void main ( String [] args ){
         Oppgaver.Bensinkjøp Etkjøp = new Oppgaver.Bensinkjøp("Oslo","90",23, 16.50, "12:00");
         double Pris = Etkjøp.FinnTotalPrisen();
         String prisToDesimaler = String.format("%.2f",Pris);
         String Ut = "Det kostet totalt "+prisToDesimaler+"" +
                 " kr i "+Etkjøp.getSted()+" kl "+Etkjøp.getTidspunkt();
         System.out.print(Ut);
     }

 }
 /*
Lag en klasse kalt Klokke. Klassen skal ha tre private heltalls- attributter, time, minutter, sekunder.

Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse. Set metodene skal sjekke om inndataene er korrekte (0-24 timer, 0-59 på de to andre).

Lag så en metode "visTiden" som skriver ut tiden enten på System.out eller som meldingsboks på følgende format tt : mm : ss.

Skriv så kode i main for å teste ut denne klassen.
  */
class Klokke{
    private int Timer;
    private int Minutter;
    private int Sekunder;

    public Klokke(int Timer, int Minutter, int Skunder){
        //setTimer(Timer);
        // setMinutter(Minutter);
        // setSekunder(Sekunder);


        this.Timer = Timer;
        this.Minutter = Minutter;
        this.Sekunder = Skunder;
    }
    public int getTimer(){
        return Timer;
    }
    public void setTimer(){
        if (Timer >= 0 && Timer <= 24){
            this.Timer = Timer;
        }

    }
    public int getMinutter (){
        return Minutter;
    }
    public void setMinutter(){
        if (Minutter >= 0 && Minutter <= 59) {
            this.Minutter = Minutter;
        }
    }
    public int getSekunder(){
        return Sekunder = Sekunder;
    }
    public void setSekunder(){
        if (Sekunder >= 0 && Sekunder <= 59){
            this.Sekunder = Sekunder;
        }
    }
    public void VisTid(){
        System.out.println(Timer+ " : "+Minutter+" : "+Sekunder);
    }

 }
 class Oppgave4{
    public static void main ( String [] args ){
        Klokke Tid1 = new Klokke(12,45,01);
        Tid1.VisTid();
        Klokke Tid2 = new Klokke(14,15,59);
        Tid2.VisTid();
    }

 }
 class Konto{
    private String Navn;
    private String Kontonummer;
    private double Saldo;

    public Konto(String Navn, String Kontonummer, double Saldo){
        this.Navn = Navn;
        this.Kontonummer = Kontonummer;
        this.Saldo = Saldo;
    }
    public void UtSkrift(){
        String Ut = "Kontoinnhaver : "+Navn+"\n"+
                "Kontonummer : "+Kontonummer+"\n"+
                "Saldo"+String.format("%.2f",Saldo)+" kr";
        showMessageDialog(null, Ut);
    }
    public String SettInn(double Beløp){
        Saldo += Beløp;
        return "Den nye saldoen er "+String.format("%.2f",Saldo);
    }
    public String Taut(double Beløp){
        String Ut = "";
        if (Beløp <= Saldo){
            Saldo = Saldo - Beløp;
            Ut ="Den nye saldoen er : "+String.format("%.2f",Saldo);
        }
        else{
            Ut = "Ikke dekning på konto!";
        }
        return Ut;
    }
 }

 class Oppgave5{
    public static void main (String [] args){
        String KontoNavn = showInputDialog("Anngi kontonavn");
        String Kontonr = showInputDialog("Anngi kontonummer");
        double Saldo = Double.parseDouble(showInputDialog("Anngi saldo"));
        Konto SpareKonto = new Konto(KontoNavn,Kontonr,Saldo);
        System.out.println(SpareKonto.SettInn(1000));
        System.out.println(SpareKonto.Taut(10000));
        System.out.println(SpareKonto.SettInn(1000));
        SpareKonto.UtSkrift();

    }
 }
