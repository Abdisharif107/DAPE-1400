package KlasserogObjekter3;

class Person{
    public String Navn;
}
public class ByRef {
    private static void EndreNavn (Person PersonRefl, String Navn){
        PersonRefl.Navn = Navn;
    }
    public static void main(String [] args){
        Person Person1 = new Person();
        Person1.Navn = "Heidi";
        System.out.println("Navnet til person1 er : "+Person1.Navn);
        EndreNavn(Person1, "Kari");
        System.out.println("Navnet til Person1 er nå : "+Person1.Navn);
    }
}