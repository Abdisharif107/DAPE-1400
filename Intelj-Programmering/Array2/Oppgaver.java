package Array2;

import java.util.ArrayList;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/*
Definer følgende helttalls-ArrayList: 1,2,3,4,5,6,7,8,9.
Skriv ut element nummer 3 og 6 med System.out
 */

public class Oppgaver {
    public static void main(String [] args) {
        ArrayList<Integer> Liste = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Liste.add(i);
        }
        System.out.println("Element nr 3 : "+Liste.get(3));
        System.out.println("Element nr 6 : "+Liste.get(6));
    }
}

/*
Bruk samme array som i oppgave 1. Legg til tallene 10 og 11 i arrayet.
Slett så elementene med tallene 2 og 3. Skriv så ut hele arrayet med en for-løkke.
Bruk size() for å finne lengden i arrayet.
 */

class Oppagve2{
    public static void main(String [] args) {
        ArrayList<Integer> Liste = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Liste.add(i);
        }
        Liste.add(10);
        Liste.add(11);
        Liste.remove(1);
        Liste.remove(1);

        for (int i = 0; i < Liste.size();i++){
            System.out.println(Liste.get(i)+" ");
        }
    }
}

/*
Definer et heltalls-arrayet  : 1,2,3,4,5,6,7,8,9.
Skriv kode for å konvertere dette til et ArrayList.
Skriv så ut denne ArrayListen.
 */

class Oppagve3{
    public static void main( String [] args ) {
        int [] Liste1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        ArrayList<Integer> Liste2 = new ArrayList<>();

        for (int i : Liste1) {
            Liste2.add(i);
        }

        for (int i = 0; i < Liste2.size(); i++);{
        }
    }
}

/*
Definer et ArrayList attay : 1,2,3,4,5,6,7,8,9.
Skriv kode for å konvertere dette til et vanlig heltalls-array.
Skriv så kode for å skrive ut det nye heltalls-arrayet
 */

class Oppgave4{
    public static void main(String [] args){
        ArrayList<Integer> Liste1 = new ArrayList<>();

        for (int i = 1; i < 10; i++){
            Liste1.add(i);
        }

        int [] Liste2 = new int [Liste1.size()];

        for (int i = 0; i < Liste1.size(); i++){
            Liste2 [i] = Liste1.get(i);
        }

        for (int i : Liste2){
            System.out.print(i+" ");
        }
    }
}

/*
Det er definert et to-dimensjonalt helttalls-array (se under).
Hver rad tilsvarer en filmanmelders "score" av 4 filmer (kolonner).
4	6	2	5
7	9	4	8
6	9	3	7
Lag et program som beregner gjennomsnittlig "score"
for de 4 forskjellige filmene og skriver ut resultatet.

Utvid oppgave 6 til også å lese inn matrisen (det to-dimensjonale arrayet) fra brukeren.
Først skal man kunne lese inn antall anmeldere (rader) og antall filmer (kolonner).
Så skal arrayet defineres og man skal lese inn "scores".
Bruk gjerne try/catch for å sikre at man leser inn korrekte tall.
Sjekk også om tallene er mellom 0 og 9.
 */

class Oppgave56 {
    public static void main(String[] args) {
        int AntallAnmeldere, AntallFilmer;
        String InnAnmeldere = showInputDialog("Hvor mange anmeldere?");
        try {
            AntallAnmeldere = Integer.parseInt(InnAnmeldere);
        } catch (Exception e) {
            AntallAnmeldere = 0;
        }
        String InnFilmer = showInputDialog("Hvor mange filmer?");
        try {
            AntallFilmer = Integer.parseInt(InnFilmer);
        } catch (Exception e) {
            AntallFilmer = 0;
        }
        if (AntallFilmer == 0 || AntallAnmeldere == 0) {
            showMessageDialog(null, "Programmet stoppes, ikke angitt korrekt informasjon");
        } else {
            int[][] Tabell = new int[AntallAnmeldere][AntallFilmer];

            int Score;
            String innScore;
            for (int i = 0; i < AntallAnmeldere; i++) {
                for (int j = 0; j < AntallFilmer; j++) {
                    innScore = showInputDialog("Skriv inn score for anmelder " + i + " og film " + j + " (0-9)");
                    try {
                        Score = Integer.parseInt(innScore);
                        if (Score >= 0 && Score <= 9) {
                            Tabell[i][j] = Score;
                        }
                    } catch (Exception e) {
                        showMessageDialog(null, "IKKE gyldig input, ignorert dette");
                    }
                }
            }
            String Ut = "";
            for (int i = 0; i < AntallAnmeldere; i++) {
                Ut += "Anmelder " + i + " : ";
                for (int j = 0; j < AntallFilmer; j++) {
                    Ut += Tabell[i][j] + " ";
                }
                Ut += "\n";
            }
            System.out.println(Ut);
            double Snitt = 0;
            Ut = "Gjennomsnittet er : \n";
            for (int i = 0; i < AntallFilmer; i++) {
                Snitt = 0;
                for (int j = 0; j < AntallAnmeldere; j++) {
                    Snitt += Tabell[j][i];
                }
                Snitt = Snitt / AntallAnmeldere;
                Ut += "Film " + i + " : " + Snitt + "\n";
            }
            showMessageDialog(null, Ut);
        }
    }
}
