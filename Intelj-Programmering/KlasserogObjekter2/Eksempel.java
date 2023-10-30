package KlasserogObjekter2;

class Bil2{
    //Ingen attributter
    public double Rekkevidde(double Tank, double Forbruk){
        double Rekkevidde = Tank / Forbruk;
        return Rekkevidde;
    }
}

public class Eksempel {
    public static void main ( String [] args ){
        Bil2 BMW = new Bil2();
        double Rekkevidde = BMW.Rekkevidde(90,0.9);
        System.out.println("Rekkevidden til bilen er ");
        System.out.print(Rekkevidde+" mil");
    }
}
