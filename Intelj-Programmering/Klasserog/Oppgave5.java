package Klasserog;

public class Oppgave5 {

    /*
  Lag en klasse kalt Kalkulator. Denne klassen skal ha 4 statiske metoder som tar inn 2 parametere hver.
  Disse statiske metodene skal henholdsvis addere, subtrahere, multiplisere og dividere to desimaltall.

  Skriv også kode i main-metoden for å kalle disse metodene for å sjekke at de fungerer.
   */
    public static void main(String[] args) {
        System.out.println(" 2 + 2 er " + Kalkulator.Addere(2, 2));
        System.out.println(" 2 - 2 er " + Kalkulator.Subtrahere(2, 2));
        System.out.println(" 2 * 2 er " + Kalkulator.Multiplisere(2, 2));
        System.out.println(" 2 / 2 er " + Kalkulator.Dvidere(2, 2));


    }
}
