package KlasserogObjekter2;

class Car{
    public String Farge;

    public void ShowColor(){ System.out.println("Fargen til bilen er "+Farge);}
}

public class Objekter2 {
    public static void main ( String [] args ){
        Car NewCar = new Car();
        NewCar.Farge = "Red";
        NewCar.ShowColor();
    }
}
