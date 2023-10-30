package KontrollStrukturer2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgaver {
    /*
    Lag en forløkke som viser alle tallene fra 0 til 10 på hver sin linje under hverandre (0 til og med 9).
     */
    public static void main( String [] args){
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
class Oppgave2{
    /*
    Lag en forløkke som summerer alle tallene fra 0 til 10 og viser summen (0 til og med 9)
     */
    public static void main(String [] args){
        int Sum = 0;
        for (int i = 0; i < 10; i++){
            Sum+=i;
        }
        System.out.println("Summen av tallene mellom 0 og 9 er "+Sum);
    }
}

class Oppgave3{
    /*
    Lag en forløkke som viser alle partall mellom fra 0 til 20 med et mellomrom mellom tallene (0 til og med 18).
     */
    public static void main(String [] args){
        for (int i = 0; i < 20; i+=2){
            System.out.print(i+" ");
        }
    }
}

class Oppagve4{
    /*
    Lag en forløkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 98)
     */
    public static void main(String [] args){
        int Sum = 0;
        int Teller = 0;
        for (int i = 0; i < 100; i +=2){
            Sum += i;
            Teller++;
        }
        System.out.println("Summen av alle partallene fra 0 til 98 er "+Sum);
        double Gjennomsnitt = (double) Sum/ (double) Teller;
        System.out.println("Gjennomsnittet av alle partallene fra 0 til 98 er "+Gjennomsnitt);
    }
}

class Oppgave5{
    /*
    Lag en while-løkke som viser alle tallene fra 0 til 10 på hver sin linje under hverandre (0 til og med 9).
     */
    public static void main(String [] args){
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }
    }
}

class Oppgave6{
    /*
    Lag en while-løkke som summerer alle tallene fra 0 til 10 og viser summen (0 til og med 9)
     */
    public static void main(String [] args){
        int Sum = 0;
        int i = 0;
        while (i < 10){
            Sum +=1;
            i++;
        }
        System.out.println("Summen av tallene fra 0 til 9 er "+Sum);


    }
}

class Oppgave7{
    public static void main(String [] args){
        int i = 0;
        while (i < 20){
          System.out.println(i+" ");
          i+=2;
        }
    }
}

class Oppagve8{
    /*
    Lag en while-løkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 98).
     Finn også gjennomsnittet.
     */
   public static void main(String [] args){
          int i = 0;
          int Sum = 0;
          int Teller = 0;
          while (i < 100){
              Sum+= i;
              i +=2;
              Teller ++;
          }
       System.out.println("Summen av partallene fra 0 og 98 er "+Sum);
       double Gjennomsnitt = (double) Sum / (double) Teller;
       System.out.println("Gjennomsnittet av alle partallene fra 0 til 98 er "+Gjennomsnitt);

    }
}
 //Vanskeligere oppgaver
 /*
 Beregn Pi med 10 desimalers nøyaktighet. Pi med 12 desimaler er 3.14159265358.
 Bruk en løkke til å beregne pi ved hjelp av denne rekken:Pi=4-4/3+4/5-4/7+4/9-4/11+....

 Lag en innlesning av antall ledd i rekken (omganger i løkken) slik at det er mulig å
 variere hvor mange som trengs for å oppnå en presisjon på 10 siffer.

 Tips: Bruk long isteden for int for å ha mulighet for stort nok tall i løkken.
 */
class Oppagve9{
    public static void main(String [] main){
        int Nummer = Integer.parseInt(showInputDialog("Skriv inn et heltall for antall: "));
        double pi = 4;
        int Fortegn = -1;
        for (long i =3; i <Nummer; i +=2){
            pi += Fortegn * (4 / (double)i);
            Fortegn = - Fortegn;
        }
        showMessageDialog(null, "PI skal være 3.141592655358.\n Blir : "+pi);
    }

}
 /*
 Lag en primtallsgenerator. Det vil si liste ut alle primtall fra 0 og opp til et valgt tall.
 Et primtall er et tall som bare er delelig med 1 og seg selv.
  */

class Oppgave10{
    public static void main(String [] args){
        int N = 100;
        int I = 1;
        while (I <= N){
            int C = 0;
            for (int j = 1;j <= I; j++){
                if (I % j == 0){
                    C++; // Øk teller; Deling med
                }
            }
            if (C==2){
                System.out.print(" "+ I);
            }
            I++;

        }
    }
}
 /*
 Lag en primtallsgenerator. Det vil si liste ut alle primtall fra 0 og opp til et valgt tall.
 Et primtall er et tall som bare er delelig med 1 og seg selv.
 */
class Oppagve11{
    public static void main(String [] args){
        int N = Integer.parseInt(showInputDialog("Skrivv inn et heltall :"));
        int C = 0;
        String Primtall = " er et primtall";
        for (int I = 1; I  <= N; I++){
            if (N % I == 0){
                C++;
            }
            if (C > 2){
                Primtall = " er ikke et primtall";
                break; // Gå ut av for-løkken det er ikke et primtall
            }
        }
        showMessageDialog(null, "Tallet " + N + Primtall);
    }
 }
