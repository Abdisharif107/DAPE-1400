package Array2;

import java.util.ArrayList;

class Car{
    public String Farge;
    public int [] Verdier = new int[5];
}

public class Array5 {
    public static void main(String [] args){
        ArrayList <Car> cars = new ArrayList <Car> (5);

        Car Mercedes = new Car();
        Mercedes.Farge = "Svart";
        Mercedes.Verdier [0] = 4; // Antall dører
        Mercedes.Verdier [1] = 850; // HP

        Car Bugatti = new Car();
        Bugatti.Farge = "Blå";
        Bugatti.Verdier [0] = 2; // Antall dører;
        Bugatti.Verdier [1] = 2000; // HP

        cars.add(Mercedes);
        cars.add(Bugatti);

        for (Car oneCar : cars) {
            System.out.println("Fargen: "+oneCar.Farge);
            System.out.println("Antall dører: "+oneCar.Verdier[0]);
            System.out.println("Antall HP: "+oneCar.Verdier[1]);
            System.out.println("---------------");
        }
        cars.remove(Mercedes);
        cars.add(Bugatti);

        for (Car oneCar : cars){
            System.out.println("Fargen: "+oneCar.Farge);
            System.out.println("Antall dører: "+oneCar.Verdier[0]);
            System.out.println("Antall HP: "+oneCar.Verdier[1]);
            System.out.println("---------------");
        }
        System.out.println("Lengden på arrayet er nå: "+cars.size());
        cars.clear();
        System.out.println("Lengden på er arrayet er nå:"+cars.size());

    }
}
