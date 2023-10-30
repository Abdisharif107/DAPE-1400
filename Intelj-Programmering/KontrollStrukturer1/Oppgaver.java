package KontrollStrukturer1;

import static javax.swing.JOptionPane.*;

/*
Les inn en heltallsvariabel. Skriv så ut en tekst ”Du er myndig men kan ikke kjøpe alkohol
 med mer enn 22 % på polet”.
Dvs. at du må ha en beslutning som tester på om alderen eller mellom 18 og 20.
Dersom dette ikke er tilfelle skriv ut
”Du er enten umyndig eller så kan du kjøpe hva du vil på polet”.
 */

public class Oppgaver {
    public static void main (String [] args){
        String InnAlder= showInputDialog("Hvor gammel er du");
        int Alder = Integer.parseInt(InnAlder);
        if (Alder >= 18 && Alder <= 20){
          showMessageDialog(null, "Du er myndig, men kan ikke kjøpe alkohol med " +
                  "mer enn 22 % på polet.");
        }
          else{
              showMessageDialog(null, "Du er enten umyndig eller så kan du  " +
                      "kjøpe hva du vil på polet");
        }
    }
}

//Opgave 2
/*
    Les inn en heltallsvariabel "alder".
    Avhengig av hva denne er så skal det skrives ut en tekst tilsvarende :
    ”Du kan ta førerkortet for bil da du er gammel nok” eller
    ”Du er for ung til å ta førerkort for bil”.

    Gjør dette uten bruk av en else-setning (bruk to if-setninger).
     */
class Oppgave2{
    public static void main( String [] args){
        String InnAlder= showInputDialog("Skriv inn alderen din");
        int Alder= Integer.parseInt(InnAlder);
        if (Alder >= 18){
            showMessageDialog(null,"Du kan ta førerkrot for bil siden du er gammel nok");
        }
        if (Alder <18){
            showMessageDialog(null, "Du er for ung til å ta førerkort for bil");
        }
    }
}

//Opgave 3
/*
 Gjør oppgave 2 ved hjelp av en else-setning (i tillegg til en if).
 */

class Oppgave3{
    public static void main( String [] args){
        String InnAlder= showInputDialog("Skriv inn alderen din");
        int Alder= Integer.parseInt(InnAlder);
        if (Alder >= 18){
            showMessageDialog(null,"Du kan ta førerkrot for bil siden du er gammel nok");
        }
        else {
            showMessageDialog(null, "Du er for ung til å ta førerkort for bil");
        }
    }
}

//Opgave 4
/*
 Definer så en variabel som indikerer høyeste alder man kan ta førerkort uten årlig legesjekk (= 70 år).
 Oppdater oppgavene over slik at programmet skriver ut meldingene

 Du er for ung til å ta førerkort for bil
 Du kan ta førerkort for bil og du trenger ikke årlige legesjekker
 Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker

 */

class Oppagve4{
    public static void main ( String [] args ){
        String InnAlder= showInputDialog("Skriv inn alderen din");
        int Alder= Integer.parseInt(InnAlder);
        if (Alder < 18){
            showMessageDialog(null, "Du er for ung til å ta førerkort for bil");
        }
        else if (Alder < 70) {
            showMessageDialog(null, "Du kan ta førerkort for bil og du trenger ikke årlige legesjekker");
        }
        else {
            showMessageDialog(null, "Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker");
        }
      /*
        if (Alder >= 70){
            showMessageDialog(null,"Du er absolutt gammel nok for å kjøre bil" +
                    " men må ha årlige legesjekker");
        }
        if (Alder >= 18 && Alder < 70){
            showMessageDialog(null,"Du kan ta førerkort for bil og du trenger ikke årlige legesjekker");
        }
        if (Alder < 18) {
            showMessageDialog(null, "Du er for ung til å ta førerkort for bil");*/
        }
    }
/*
Lag et program som leser inn et månedsnavn. Så skal programmet skrive ut hvilken årstid det er. Reglene er:
   Sommer : juni, juli, august
   Høst : september, oktober, november
   Vinter: desember, januar, februar,
   Vår : mars, april, mai,
   a) Lag først et program som løser det med if /else

   b) Lag deretter et program som løser det med bruk av switch.
 */
class Oppgave5a{
    public static void main ( String [] args ){
        String Måned= showInputDialog("Skriv inn månden (f. eks mars)");
        if (Måned.equals("Juni") || Måned.equals("Juli")|| Måned.equals("August")){
            showInputDialog(null,"Det er Sommer");
        }
        else if (Måned.equals("September") || Måned.equals("Oktober")|| Måned.equals("November")){
            showInputDialog(null,"Det er Høst");
        }
        else if (Måned.equals("Desmeber") || Måned.equals("Januar")|| Måned.equals("Februar")){
            showInputDialog(null,"Det er Vinter");
        }
        else if (Måned.equals("Mars") || Måned.equals("April")|| Måned.equals("Mai")){
            showInputDialog(null,"Det er Vår");
        }
        else {
            showMessageDialog(null,"Det er ikke gyldig måned");
        }

    }
}

class Oppgave5b{
    public static void main ( String [] args ){
        String Måned= showInputDialog("Skriv inn månden (f. eks April)");
        switch (Måned){
            case "Juni":
            case "Juli":
            case "August":
                showMessageDialog(null,"Det er Sommer");
                break;
            case "Spetember":
            case "Oktober":
            case "November":
                showMessageDialog(null, "Det er Høst");
                break;
            case "Desmber":
            case "Januar":
            case "Februar":
                showMessageDialog(null,"Det er Vinter");
                break;
            case "Mars":
            case "April":
            case "Mai":
                showMessageDialog(null,"Det er Vår");
                break;
            default:
                showMessageDialog(null,"Fei input, ikke gyldig måned");
                break;
        }
    }
}
