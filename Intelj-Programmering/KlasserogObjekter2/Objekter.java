package KlasserogObjekter2;

class Bil1{
    private String Farge;
    private int HK;

    public void SetFarge(String Farge){
        this.Farge = Farge;

    }
    public String GetFarge(){
        return Farge;
    }
    public void SetHK(int HK){
        if (HK > 0){
            this.HK = HK;
        }
    }
    public int GetHK(){
        return HK;
    }

}

public class Objekter {
    public static void main( String [] args){
        Bil1 NewCar = new Bil1();
        NewCar.SetFarge("Grønn");
        String BilFargen = NewCar.GetFarge();
        System.out.println("Fargen til bilen er "+BilFargen);
        NewCar.SetHK(890);
        System.out.println("Antall HK til bilen er "+NewCar.GetHK());

    }
}
