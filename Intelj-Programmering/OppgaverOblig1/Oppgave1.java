package OppgaverOblig1;

import static OppgaverOblig1.Sirkel.*;

class Sirkel{
    // Statisk metode som beregner og returnerer sirkelens diameter.
    public static double Diameter(double Radius){
        double Sum = Radius * 2;
        return Sum;
    }

    // Statisk metode som beregner og returnerer sirkelens omkrets. // Omkrets = 2*pi*r
    public static double Omkrets(double radius){
        double Sum = radius * 2 * Math.PI;
        return Sum;
    }

    /* Statisk metode som beregner og returnerer sirkelens areal.
       Areal = pi*r^2
       Math.PI kan brukes for en konstant for PI
       Math.pow kan brukes for å opphøye et tall i en potens

     */
    public static double Areal(double Radius){
        double Sum = Math.PI * Math.pow(Radius,2);
        return Sum;
    }

}

public class Oppgave1 {
    public static void main( String [] args){
        System.out.println("Diameter med radius 23.5 er "+String.format("%.2f", Diameter(23.5)));
        System.out.println("Omkrets av sirkelen med radius 23.5"+String.format("%.2f", Omkrets(23.5)));
        System.out.println("Arealet av sirkelen med radius 23.5"+String.format("%.2f", Areal(23.5)));
    }

}
