package OppgaverOblig3;

import javax.swing.*;
import java.util.Arrays;

public class UnikeTall {
    // Deklarasjon av array for lagring av tilfeldige heltall

    int [] TilfeldigTall;

   /* Konstruktør som mottar arrayets lengde som parameter og
     oppretter arrayet.  */

    public UnikeTall() {
        int ArrayLengde = Integer.parseInt(JOptionPane.showInputDialog("Hvor mange tilfeldig tall vil du ha?"));
        TilfeldigTall = new int[ArrayLengde];
    }

    /* Metode som skal undersøke om et gitt tall finnes i arrayet fra før.
      Tallet det letes etter skal mottas som parameter.
      Metoden skal returnere true hvis tallet finnes i arrayet.
      Hvis ikke skal metoden returnere false. */
    private boolean SjekkTall(int inntall) {
        for (int i = 0; i < TilfeldigTall.length; i++) {
            if (inntall == TilfeldigTall[i]) {
                return true;
            }
        }
        return false;
    }


    /* Metode som skal fylle arrayet med tilfeldige tall mellom 100 og 999,
      begge grenser inkludert. Metoden skal gjøre dette på en måte
      som sikrer at alle tallene er forskjellige. Metoden skal ikke ha
      parametre og heller ikke returnere noen verdi.
      Tips bruk (int)(Math.random()*(900)+100); for å generere tallene mellom 100 og 999
    */
    public void FyllTall() {
        for (int i = 0; i < TilfeldigTall.length; i++) {
            int Tilfeldig = (int) Math.random() * (900) + (100);
            boolean UnikeTall = SjekkTall(Tilfeldig);
            while (UnikeTall == true) {
                Tilfeldig = (int) (Math.random() * (900) + (100));

                UnikeTall = SjekkTall(Tilfeldig);

            }
            TilfeldigTall[i] = Tilfeldig;
        }
    }


    // Metode som finner og returnerer det minste tallet i arrayet.
    private int LavestTall(int [] innTall) {
        Arrays.sort(innTall);
        return innTall[0];
    }


    // Metode som finner og returnerer det største tallet i arrayet.
    private int StørstTall(int [] innTall) {
        Arrays.sort(innTall);
        return innTall[(innTall.length - 1)];
    }


   /*  Metode som beregner og returnerer den gjennomstnittlige verdien
     (double-verdi) av tallene i arrayet.  */

    private double GjennomsnittsTall(int[] innTall) {
        int i = 0;
        int Totall = 0;
        double Gjennomsnitt = 0.00;

        for (Integer Tall : TilfeldigTall) {
            i++;
            Totall += Tall;
        }

        Gjennomsnitt = (double) Totall / (double) i;
        return Gjennomsnitt;
    }


    /* Metode som viser tallene i arrayet i en meldngsboks.
      I tillegg skal det, i meldingsboks, skrives ut
      opplysninger om hvilket tall som er minst, hvilket som er størst, og
      hva som er gjennomsnittsverdien, jfr bildet over. Gjennomsnittverdien
      skal skrives ut med en desimal. Bruk gjerne String.format("%.2f,tall) til dette.
      Legg inn mellomrom mellom tallene og skriv ut et passende antall tall
      per linje. */

    public void Melding () {
        String Ut = " ";
        int i = 0;
        for (Integer Tall : TilfeldigTall) {
            Ut += (Tall + " ");
            i++;
            if (i % 10 == 0) {
                Ut += "\n";
            }
        }

        int LavestTall = LavestTall(TilfeldigTall);
        int StørstTall = StørstTall(TilfeldigTall);
        String Gjennomsnitt = String.format("%2f", GjennomsnittsTall(TilfeldigTall));

        JOptionPane.showMessageDialog(null, Ut + "\n" + "\n" + "Laveste tallet er " + LavestTall
                + "\n" + "Største tallet er " + StørstTall + "\n" + "Gjennomsnittet er " + Gjennomsnitt);
    }
}

class KjørOblig3{
    public static void main(String [] args) {
        UnikeTall Oppgave3 = new UnikeTall();
        Oppgave3.FyllTall();
        Oppgave3.Melding();
    }
}


