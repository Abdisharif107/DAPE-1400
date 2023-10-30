package KlasserogObjekter2;

class Bil{
    private String Farge;
    private int HK;

    public Bil(String Farge, int HK){
        this.Farge = Farge;
        this.HK = HK;
    }

    public void SetFarge(String Farge){
        this.Farge = Farge;
    }

    public String GetFarge(){
        return Farge;
    }
    public void SetHK(int HK){
       if (HK > 0){
           this.HK =HK;
       }
    }
    public int GetHK(){
        return HK;
    }
}
public class Konstruktører {
    public static void main(String [] args){
        Bil Ferrari = new Bil("Rød",1800);
        int HK = Ferrari.GetHK();
        String Farge = Ferrari.GetFarge();
        System.out.print("Bilens farge er "+Farge+". Den har "+HK+" HK");
    }
}
