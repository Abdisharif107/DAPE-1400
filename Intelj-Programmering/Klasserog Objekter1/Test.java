package KlasserogObjekter1;
class TestBil{
    private String Farge;
    public void SettFarge(String Fargen){
        Farge = Fargen;

    }
    public String HentFarge(){
        return Farge;
    }
}
class DebugAvObjekt1{
    public static void main(String [] args){
        TestBil NyBil = new TestBil();
        NyBil.SettFarge("Blå");
        String Bilfargen = NyBil.HentFarge();
        System.out.println("Fargen til bilen er "+Bilfargen);

    }
}




