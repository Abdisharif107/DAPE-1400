package Array1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgaver {
 /*
 Definer følgende helttalls-array: 1,2,3,4,5,6,7,8,9.
 Skriv ut element nummer 3 og 6 med System.out
  */
    public static void main( String [] args){
        int [] Liste = {1,2,3,4,5,6,7,8,9};

        int [] Liste1 = new int [9];

        Liste1 [0] = 1;
        Liste1 [1] = 2;
        Liste1 [2] = 3;
        Liste1 [3] = 4;
        Liste1 [4] = 5;
        Liste1 [5] = 6;
        Liste1 [6] = 7;
        Liste1 [7] = 8;
        Liste1 [8] = 9;

        System.out.println("Posisjonen 3 og 6 er "+Liste[3]+" og "+Liste[6]);

    }
}
class Oppgave2{
    /*
    Bruk arrayet i oppgave 1. Summer alle tallene med en for-løkke.
    Finn så gjennomsnittet av alle tallene.
    Summer så alle tallene som er større enn 5. Finn så gjennomsnittet av disse.
    Summer så tallene med en forenklet for-løkke.
     */
    public static void main(String [] args){
        int [] Liste = {1,2,3,4,5,6,7,8,9};
        int Sum = 0;
        for (int i = 0; i < Liste.length; i++){
            Sum += Liste[i];
        }
        System.out.println("Summen av listen er "+Sum);
        double Gjennomsnitt = (double) Sum / Liste.length;
        System.out.println("Gjennomsnittet av de samme talllene er "+Gjennomsnitt);

        Sum = 0;
        int Teller = 0;
        for (int i : Liste){
            if (i > 5){
                Sum += i;
                Teller++;
            }
        }
        System.out.println("Summen av listen er "+Sum);
        Gjennomsnitt = (double) Sum / Teller;
        System.out.println("Gjennomsnittet av de samme talllene er "+Gjennomsnitt);

    }
}
class Oppgave3{
    /*
    Gitt følgende string-array : Per, Hansen, Line, Olsen, Ola, Pedersen, Kari, Finnsen.
    Skriv så ut for og etternavn på flere linjer med en løkke som vist under:
    Per Hansen
    Line Olsen
    ....
     */
    public static void main(String [] args){
        String [] Navn = {"Per", "Hansen", "Line", "Olsen", "Ola", "Pedersen", "Kari", "Finnsen"};

        for (int i = 0; i < Navn.length; i+= 2){
            System.out.println(Navn[i]+" "+Navn[i+1]);
        }
    }

}
class Oppagve4{
    /*
    Definer følgende heltallsarray : 45, 34, 5, 8, 10, 2, 13, 25.
    Lag et program som skriver ut tallene baklengs. (Dvs. 25, 13, 2 osv.) med en for-løkke.
    Tips: Start fra array.length - 1 så lenge telleren i for-løkka er større eller lik 0.
    Mink telleren med en hver gang.
     */
    public static void main(String [] args){
        int [] Liste = {45, 34, 5, 8, 10, 2, 13, 25};
        for (int i = Liste.length - 1; i >= 0; i--) {
            System.out.print(Liste[i] + ", ");
        }
    }
}
class Oppgave5{
    /*
    Bruk arrayet i oppgave 4 og skriv kode for å finne det største og minste tallet i arrayet via en løkke.
    Tips: Sett største og minste tallet til første elementet i arrayet før løkken.
     */
    public static void main(String [] args){
        int [] Liste = {45, 34, 5, 8, 10, 2, 13, 25};
        int Største = Liste [0];
        int Minste = Liste [0];
        for (int i : Liste){
            if (i > Største){
                Største = i;
            }
            if(i < Minste){
                Minste = i;
            }
        }
        System.out.println("Det største tallet er "+Største);
        System.out.println("Det minste tallet er "+Minste);

    }
}
class Oppgave6 {
    /*
    Lag et program som sjekker om to heltalls-arrays er like. Bruk løkker, ikke innebygd java klasse/metode.
     */
    public static void main(String[] args) {
        int[] Liste1 = {45, 34, 5, 8, 10, 2, 13, 25};
        int[] Liste2 = {45, 34, 5, 8, 10, 2, 13, 25};
        if (Liste1.length != Liste2.length) {
            System.out.println("Arrayene er ikke like lange");
        } else {
            boolean Like = true;
            for (int i = 0; i < Liste1.length; i++) {
                if (Liste1[i] != Liste2[i]) {
                    Like = false;
                }

                if (Like) {
                    System.out.print("Arrayene er like");
                } else {
                    System.out.println("Arrayene er IKKE like");
                }
            }
        }
    }
}
class Oppgave7{
    /*
    Lag et program som teller opp antall partall og antall oddetall i et helttalls-array.
     */
    public static void main(String [] args){
        int [] Liste = {45, 34, 5, 8, 10, 2, 13, 25};
        int Partall = 0;
        int Oddetall = 0;
        for (int i : Liste){
            if (i % 2 == 0){
                Partall ++;
            }
            else {
                Oddetall ++;
            }
        }
        System.out.println("Listen inneholder "+Partall+" partall");
        System.out.println("Listen inneholder "+Oddetall+" oddetall");

    }
}
class Oppgave8 {
    /*
    Det skal lages et program som beregner gjennomsnittlig poengsummer for et antall elever - poengene er mellom 0 og 100.
    Lag et program som først leser inn hvor mange poengsummer som skal leses inn. Så skal det opprettes
    et heltalls-array med riktig lengde
    (fra input). Deretter skal det leses inn poengsummer via en løkke samtidig som arrayet fylles.
    Tilslutt skal det via en løkke beregnes gjennomsnittlig poengsum også vise dette på skjermen.
    (Det er mulig å løse denne oppgaven enklere uten å bruke array, men oppgaven trener på bruk av arrays).

    Bruk gjerne try/catch ved parsing av input og spør igjen om tall dersom det ikke er oppgitt riktig.

     */
    public static void main(String [] args){
        int Antall, Poeng;
        String InnAntalll, InnPoeng;
        InnAntalll = showInputDialog("Hvor mange poengsummer skal leses inn");
        try {
            Antall = Integer.parseInt(InnAntalll);
        }
        catch (Exception e){
            showMessageDialog(null, "Feil, det ble ikke satt noe antall, avslutter!");
            Antall = 0;
        }
        int [] Poengsum = new int[Antall];
        while (Antall > 0){
            InnPoeng = showInputDialog("Skriv inn poengsum");
            try {
                Poeng = Integer.parseInt(InnPoeng);
                Poengsum [Antall-1] = Poeng;
                Antall --;
            }
            catch (Exception e){
                showMessageDialog(null, "Feil i input av poengsummen, trykk Enter");
            }
        }
        int Sum = 0;
        for (int i : Poengsum){
            Sum += i; 
        }
        if (Poengsum.length > 0){
            double Gjennomsnitt = (double) Sum / Poengsum.length;
            showMessageDialog(null, "Gjennomsnittet er "+
                        String.format("%.2f", Gjennomsnitt));
        }
    }
}



