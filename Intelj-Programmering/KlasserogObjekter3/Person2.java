package KlasserogObjekter3;

public class Person2 {
    public String Personnummer;
    public String Navn;
    public String Adresse;
    public String Telefonnummer;

    public String ToString(){
        String Ut = "Her er innholdet i objektet ; \n";
        Ut += "Personnummer : "+this.Personnummer+"\n";
        Ut += "Navn : "+this.Navn+"\n";
        Ut += "Adresse : "+this.Adresse+"\n";
        Ut += "Telefonnummer"+this.Telefonnummer+"\n";
        return Ut;
    }
}

class ToString{
    public static void main(String [] args){
        Person2 EnPerson = new Person2();
        EnPerson.Personnummer ="12345678912";
        EnPerson.Navn = "Maria";
        EnPerson.Adresse = "Askerveien 2";
        EnPerson.Telefonnummer = "09234578";
        System.out.println(EnPerson);
    }
}
