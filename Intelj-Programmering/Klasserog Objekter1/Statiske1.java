package KlasserogObjekter1;

import java.text.DecimalFormat;

public class Statiske1 {
   private static double BeregnAreal(double radius){
       double Areal = Math.PI * Math.pow(radius,2);
       return Areal;
   }
    public static void main( String [] args){
       double Radius = 23.23;
       double Areal = BeregnAreal(Radius);
        DecimalFormat df2 = new DecimalFormat(".##");
       System.out.println("Arealet til en sirkel med radius "+Radius+" er "+df2.format(Areal));
    }
}
