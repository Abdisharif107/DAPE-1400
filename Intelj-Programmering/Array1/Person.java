package Array1;

public class Person {
    public String Navn;
    public int Alder;
}
class ArrayObjekter{
    public static void main( String [] args){
        Person[] Liste = new Person[3];
        Person Neymar = new Person();
        Neymar.Navn = "Neymar";
        Neymar.Alder = 32;
        Liste[0]= Neymar;
        Person Mbappe = new Person();
        Mbappe.Navn = "Mbappe";
        Mbappe.Alder = 23;
        Liste[1] = Mbappe;

        for(int i = 0; i < Liste.length; i++){
            if (Liste[i] !=null){
        System.out.println(Liste[i].Navn+" "+Liste[i].Alder);
            }
        }
    }
}
class Person1{
    public String Navn;
    public int Alder;
}
class ArrayObjekter1{
    private static void EndrePerson(Person[] innliste,String NyttNavn){
        innliste[0].Navn = NyttNavn;
    }
    public static void main(String [] args){
            Person[] Liste = new Person[2];
            Person Neymar = new Person();
            Neymar.Navn = "Neymar";
            Neymar.Alder = 32;
            Liste[0]= Neymar;
            Person Mbappe = new Person();
            Mbappe.Navn = "Mbappe";
            Mbappe.Alder = 23;
            Liste[1] = Mbappe;

            EndrePerson(Liste,"Finn");
            for (Person EnPerson : Liste){
                System.out.println(EnPerson.Navn+" "+EnPerson.Alder);
            }

        }
}