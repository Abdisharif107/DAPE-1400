package KontrollStrukturer2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class VanskeligeOppgaver {
    /*
    Lag et program som regner ut hvor mye en bil bruker i bensin på ulike turer.
    Programmet skal lese inn to og to verdier, lengden på turen i km og hvor mye bensin som ble brukt.
    Les inn ved hjelp av inputbokser (JOptionPane). Når lengden på turen er 0 eller negativ
    avsluttes innlesningen og det skrives ut hvor mye gjennomsnittlig bensin bilen har brukt pr mil.
     */
    public static void main(String [] args){
        String InnKm= showInputDialog("Skriv inn antall km på denne turen, avsluttes med 0");
        double AntallKM = Double.parseDouble(InnKm);
        String InnLiter = showInputDialog("Skriv inn antall liter som ble brukt på turen");
        double AntallLiter = Double.parseDouble(InnLiter);
        double TotallAntallKM = 0, TotallAntallLiter = 0;
        while (AntallKM > 0){
            TotallAntallKM += AntallKM;
            TotallAntallLiter += AntallLiter;
            InnKm = showInputDialog("Skriv inn antall km på denne turen, avsluttes meed 0");
            AntallKM = Double.parseDouble(InnKm);
            InnLiter = showInputDialog("Skriv inn antall liter som ble brukt på turen");
            AntallLiter = Double.parseDouble(InnLiter);
        }
        double Gjennomsnitt = TotallAntallLiter / TotallAntallKM * 10;
        showMessageDialog(null, "Gjennomsnittelig forbruk pr mil er på "+Gjennomsnitt+" liter.");

        /*  Alternativ
        public static void main(String[] args) {
            String innKM, innLiter;
            double antallKM, antallLiter;
            double totaltAntallLiter=0, totaltKM=0;
            do{
                innKM = showInputDialog("Skriv inn antall km på denne turen, avslutt med 0");
                antallKM = Double.parseDouble(innKM);
                innLiter = showInputDialog("Skriv inn antall liter som er brukt på turen!");
                antallLiter = Double.parseDouble(innLiter);
                totaltAntallLiter += antallLiter;
                totaltKM += antallKM;
            }while (antallKM > 0);
            double snitt = totaltAntallLiter / totaltKM * 10;
            showMessageDialog(null, "Gjennomsnittlig forbruk pr mil er "+snitt+" liter");
        }
        */

    }
}
class Salg{
    /*
    En salgsperson får kommisjon av salget sitt. Det betyr at vedkommende får 9 % av
    salget i tillegg til vanlig månedslønn. Skriv et program som leser prisen på et antall varer
    selgeren har solgt og regn ut hvor mye tillegg vedkommende er berettiget til.
    Bruk inputbokser og avslutt innlesningen når prisen er 0.
     */
    public static void main(String [] args){
        String innVarePris = showInputDialog("Skriv inn prisen på varen og avlsutt med 0");
        double VarePris = Double.parseDouble(innVarePris);
        double TotallPris = 0;
        while (VarePris > 0){
            TotallPris += VarePris;
            innVarePris = showInputDialog("Skriv inn prisen på varen og avslutt med 0");
            VarePris = Double.parseDouble(innVarePris);
        }
        double Kommisjon = TotallPris * 0.09;
        showMessageDialog(null, "Komisjonen for totalt "+TotallPris+" kr bli "+Kommisjon+ " kr.");
    }

}
class Skatt{
    /*
    Lag et program som beregner skatten til tre personer.
    Skatten er 30 % frem til 500.000 kr og 50 % over. Les inn navn og inntekt
    på de 3 personene og vis den samme informasjonen med hvor mye skatt de kan forvente seg.
     */
    public static void main( String [] args){
        String InnInntekt;
        double Inntekt;
        double Skatt;
        String Ut =  "";
        for (int i = 1; i < 4; i++){
            InnInntekt = showInputDialog("Skriv inn inntekten din");
            Inntekt = Double.parseDouble(InnInntekt);
            if (Inntekt > 500_000){
                Skatt = (Inntekt-500_000)*0.5;
                Skatt += 500_000 * 0.3;
            }
            else {
                Skatt = Inntekt * 0.3;
            }
            Ut += "Intekt på "+Inntekt+" kr gir skatt på "+Skatt+" kr\n";
        }
        showMessageDialog(null, Ut);
    }
}
class Heltall{
   /*
    Et program skal finne det største tallet av 10 heltall.
    Tallene skal leses inn via Inputbokser og vises som en meldingsboks.
    Programmet skal bruke tre heltallsvariabler:

   Telller; som teller 0 til 10
   Nummer; som er tallet som er lest inn
   Størst; det til en hver tid største tallet
*/
    public static void main( String [] args){
        int Nummer = 0;
        int Størst = 0;
        for (int Teller = 1; Teller <= 10; Teller++){
            String InnTall = showInputDialog("Skriv inn heltall nummer "+Teller);
            Nummer = Integer.parseInt(InnTall);
        }
        if (Nummer > Størst){
            Størst = Nummer;
        }
        showMessageDialog(null, "Det største tallet er "+Størst);
    }
}
class HelTall2{
    /*
    Ref. forrige oppgave. Lag et program som finner de to største tallene av 10 heltall.
    En ekstra variabel må brukes.
     */
    public static void main( String [] args){
        int Nummer = 0;
        int Størst = 0;
        int NestStørst = 0;
        for (int Teller = 1; Teller <= 10; Teller++) {
            Nummer = Integer.parseInt(showInputDialog("Skriv inn heltall nummer " + Teller));
            if (Nummer > Størst) {
                NestStørst = Størst;
                Størst = Nummer;
            }
            else if (Nummer > NestStørst) {
                NestStørst = Nummer;

            }

        }
        showMessageDialog(null, "Det største tallet er "+Størst+"\n"
        +"Det nest største tallet er "+NestStørst);
    }
}
class Tabell{
    /*
    Lag et program som viser følgene ut (med tab):

  N           N^2         N^3          N^4
  1            1           1            1
  2            4           8            16
  3            9           27           81
  ..... frem til N=10.
  Bruk gjerne metoden i Java : MATH.pow(grunntall, eksponent).
     */
    public static void main(String [] args){
        String Ut = "N\tN^2\tN^3\tN^4\n";
        for (int i = 1; i <= 10; i++){
            Ut += i+"\t"+Math.pow(i, 2)+"\t"+Math.pow(i, 3)+"\t"+Math.pow(i, 4)+"\t\n";
        }
        System.out.println(Ut);
    }
}
class Trekant{
    public static void main(String [] args){
        int Tall = Integer.parseInt(showInputDialog("Skriv inn et heltall mellom 1 og 10"));
        String Ut= "";
        for (int i = 0; i <= Tall; i++){
            for (int j = 0; j < i; j++){
                Ut += "*";
            }
            Ut += "\n";
        }
        showMessageDialog(null,Ut);
    }
}
class Palindrom{
    public static void main(String [] args){
        int Nummer, Tall1, Tall2;
        do {
            Nummer = Integer.parseInt(showInputDialog("Skriv inn femsifret heltall"));
        }
        while (Nummer < 10_000 || Nummer > 100_000);

        //Her er nummer mellom 10_000 og 99_999
        //Sjekk første og siste tallet
        boolean Palindrom1 = false;
        boolean Palindrom2 = false;
        Tall1 = Nummer / 10_000;
        Tall2 = Nummer % 10;
        if (Tall1 == Tall2){
            Palindrom1 = true;
        }
        Nummer = (Nummer - Tall1 * 10_000)/10;
        // Sjekk første og siste tall
        Tall1 = Nummer / 100;
        Tall2 = Nummer % 10;
        if (Tall1 == Tall2){
        Palindrom2 = true;
        }
        if (Palindrom1 && Palindrom2) {
            showMessageDialog(null, "Palindrom");
        }
        else {
            showMessageDialog(null, "Ikke palindrom");
        }
    }

}
class Fakultet{
    public static void main( String [] args){
        int Number = Integer.parseInt(showInputDialog("Skriv inn et heltall for faktultet"));
        int OutNumber = Number;
        int Result = Number;
        for (int i = Number - 1; i > 0; i-- ){
            Result *= i;
        }
        showMessageDialog(null, OutNumber+"! er "+Result);
    }
}