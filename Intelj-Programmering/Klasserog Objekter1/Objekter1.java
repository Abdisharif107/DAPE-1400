package KlasserogObjekter1;
class Car{
    String Farge;
    public void VisFarge(){
        System.out.println("Fargen til bilen er "+Farge);
    }
    public void SettFarge(String Fargen){
        Farge = Fargen;
    }
    public String HentFarge(){
        return Farge;
    }

}
public class Objekter1{
      public static void main(String[] args) {
          Car NyBil= new Car();
          //NyBil.Farge = "blå";
          NyBil.Farge = "blå";
          //NyBil.VisFarge();
          NyBil.VisFarge();
          String BilFargen;
          BilFargen = NyBil.HentFarge();
          System.out.println("Fargen til bil er "+BilFargen);
          
      }
}
