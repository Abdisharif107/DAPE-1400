package Aritmetikkoglogiskuttrykk;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave1 {
    /*
    Les inn to variabler; navn, alder. Skriv så følgende historie (et eksempel):
    Per Olsen er i dag 32 år. Han er født i 1986.
    I 2053 er han 67 år og da vil han være pensjonist.
     */
    public static void main(String [] args) {
        String Navn = showInputDialog("Skriv inn navn");
        String innAlder = showInputDialog("Skriv inn alderen");
        int alder = Integer.parseInt(innAlder);
        int Fødelseår = 2023 - alder;
        int pensjonår = Fødelseår + 67;
        System.out.print(Navn + " er i dag "+alder+" år. Han er født i "+Fødelseår);
        System.out.print(". I "+pensjonår+" er han 67 år og vil være pensjonist. ");
    }
}
class Oppgave2{
   /*
   Lag et program som definerer en variabel int antall=0.
   Skriv så ut partallene mellom 0 og 10 (2,4,6,8) ved å øke variabelen med 2 mellom hver gang.
    */
    public static void main( String [] args){
        int antall = 0;
        antall+=2;
        System.out.print(antall+", ");
        antall = antall + 2;
        System.out.print(antall+", ");
        antall +=2;
        System.out.print(antall+", ");
        antall += 2;
        System.out.print(antall+", ");

    }
}
class Opggave3{
    /*
    Lag et program som regner ut arealet av et rektangel.
    Programmet skal lese inn lengden og bredden på rektangelet.
    Regn så ut  arealet og skriver ut svaret på følgende måte:
    ”Et rektangel med bredde 20.0 cm og lengde 40.0 cm har et areal på 800.0 cm^2”.
     */
    public static void main( String [] args){
        String innLengde = showInputDialog("Skriv inn lengden:");
        String innBredde = showInputDialog("Skriv inn breden:");
        double lengde = Double.parseDouble(innLengde);
        double bredde = Double.parseDouble(innBredde);
        double areal = lengde * bredde;
        System.out.print("Et rektangel med bredde "+bredde+ " cm og lengde "+lengde);
        System.out.print(" cm har areal på "+areal+ " cm ^2");
        }
    }
class Oppgave4{
    /*
    Lag et program som regner ut omkretsen til en sirkel Les først inn radiusen.
    Regn så ut  omkretsen av sirkelen (2*3.14*radius) og skriver ut svaret på følgende måte:
     ”Omkretsen av en sirkel med 20.0 cm som radius blir 125.60 cm.”
     */
    public static void main( String [] args){
        String InnRadius =showInputDialog("Skriv inn radius");
        double radius = Double.parseDouble(InnRadius);
        double omkrets = 2 * 3.14 * radius;
        String omkretsMedToDesimaler = String.format("%.2f", omkrets);
        System.out.print("Omkretsen til en sirkel med "+radius+" cm som blir " +
                          omkretsMedToDesimaler+" cm.");
    }
}
class Oppgave5{
    /*
    Lag et program som regner om fra fahrenheit til celsius.
    Les inn verdien for fahrenheit og regn ut tilsvarende celsius med følgende formel:
    C = (F-32)/1.8. Skriv så ut resultatet i Celsius.
    */
    public static void main( String [] args){
        String innGraderIFahrenheit = showInputDialog(" Skriv inn graden i Fahrenheit");
        double graderFahrenheit = Double.parseDouble(innGraderIFahrenheit);
        double graderCelsius = (graderFahrenheit-32)/1.8;
        String graderCelsiusMedToDesimaler = String.format("%.2f", graderCelsius);
        System.out.print(innGraderIFahrenheit+" grader F gir "+graderCelsiusMedToDesimaler+" grader C");

    }
}
class Oppgave6{
    /*
    Lag et program som leser inn et beløp i amerikanske dollar (USD) og regner om
    og skriver ut tilsvarende beløp i norske kroner.
    Benytt dagens valutakurs fra nettet.
     */
    public static void main( String [] args){
       String InnValuta = showInputDialog(" Skriv inn antall US-dollar (USD)");
       int Valuta = Integer.parseInt(InnValuta);
       double NorskeKroner = Valuta * 10.76;
       System.out.print(Valuta+" USD tilsvarer "+ NorskeKroner+ "NOK");
    }
}
class Oppagvee7{
    /*
    Les inn verdier for antall pizza, antall personer og antallSlicesPerPizza.
    Regn så ut hvor mange pizza-slices hver person får dersom man deler likt gitt at en pizza har f.eks 6 slices hver.
    Hvor mange slices er det til overs dersom man deler likt?
    Bruk modulus operatoren. Skriv ut resultatet på følgende form:
    ”Dersom man er 4 personer og har 3 pizzaer får hver person 4 slices og 2 blir til overs”.
    */
    public static void main( String [] args){
        String InnAntallPizza = showInputDialog("Skriv inn antall pizza`er");
        int AntallPizza = Integer.parseInt(InnAntallPizza);
        String InnAntallPersoner = showInputDialog("Skriv inn antall personer");
        int AntallPersoner = Integer.parseInt(InnAntallPersoner);
        String InnAntallSlices = showInputDialog("Skriv inn antall slices per pizza");
        int AntallSlices = Integer.parseInt(InnAntallSlices);
        int AntallSlicesPerPerson = (AntallPizza*AntallSlices)/AntallPersoner;
        int rest = (AntallPizza*AntallSlices)%AntallPersoner;
        System.out.print("Dersom man er "+AntallPersoner+" personer og har "+ AntallPizza+" pizzaer"+
                " med "+AntallSlices+" slices per. pizza får hver peron "+AntallSlicesPerPerson);
        System.out.print(" slices og "+rest+" blir til overs ");



    }
}
class Opgpgave8{
    /*Hva bli resultatet av
    double tall1=1;
    double tall2=2;
    double resultat;
    resultat = tall1 * 4 (tall2 * 2 + tall1) / (tall2-tall1*3);
    System.out.println(resultat);
    */
    public static void main(String[]args){
    double tall1=1;
    double tall2=2;
    double resultat;
    resultat = tall1 * 4 + (tall2 * 2 + tall1) / (tall2-tall1*3);
    System.out.println(resultat);
    }

}
class Oppagve9{
   /* sett tall1 = 5
    sett tall2 = 4
    tall1 == tall2 : ?
    tall1 != tall2 : ?
    tall1 <= tall2 : ?
    tall1 >= tall2 : ?
    tall1 < tall2  : ?
    tall1 > tall2  : ?

    */
    public static void main( String[]args){
        int tall1 = 5;
        int tall2 = 4;
        System.out.println(tall1==tall2);
        System.out.println(tall1!=tall2);
        System.out.println(tall1<=tall2);
        System.out.println(tall1>=tall2);
        System.out.println(tall1<tall2);
        System.out.println(tall1>tall2);


    }

}
class Oppgave10{
    /*Lag et program som leser inn et heltall, alder.
    Avhengig av hva denne er så skal det skrives ut en tekst tilsvarende :
    ”Du kan ta førerkortet for bil da du er gammel nok” eller ”Du er for ung til å ta førerkort for bil”.
    Gjør dette ved bruk to if-setninger.
     */
    public static void main(String [] args){
        String Innalder = showInputDialog("Skriv inn aldren din: ");
        int Alder=Integer.parseInt(Innalder);
        if (Alder >= 18){
          System.out.println("Du kan ta førekorte for bil, siden du er gammel nok.");

        }
        if (Alder < 18){
            System.out.println("Du kan IKKE ta førerkort for bil, fordi du er for ung.");
        }
    }


}
class Oppgave11{
    /*Les inn et tall mellom 0 og 1000 og skriv ut summen av sifrene i tallet (tverrsummen).
    F.eks inndata 751 skal gi utdata 7 + 5 + 1 = 13.
    Tips: 751 % 10 = 1 og 751 / 10 = 75.
     */
    public static void main(String [] args){
        String InnTall = showInputDialog(" Skriv inn et tall mellom 0 og 1000");
        int Tall = Integer.parseInt(InnTall);
        int UtTall= Tall;
        int Sum = 0;
        int EnkelTall;
        EnkelTall = Tall % 10;
        Sum += EnkelTall;
        Tall = Tall/10;
        EnkelTall = Tall % 10;
        Sum += EnkelTall;
        Tall = Tall/10;
        Sum += Tall;
        System.out.print("Tverrsummen av tallet "+UtTall+" er "+Sum);


    }
}








