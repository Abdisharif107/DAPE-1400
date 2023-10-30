package KlasserogObjekter1;

public class Person {
     public String Navn(String Fornavn, String Etternavn){
         String Navn = Fornavn + Etternavn;
         return Navn;
     }
     static class PersonAlder {
         public String navn;
         public int Fødtselsår;
         public int  Alder(int årstall) {
             int Alder = 2023 - Fødtselsår;
             return Alder;

         }


         public void navn(String NeymarJr) {
         }
     }
     class EksempelMedNavnogAlder{
         public static void main(String [] args){
             PersonAlder Person1 = new PersonAlder();
             Person1.navn("Neymar Jr");
             Person1.Fødtselsår = 2003;
             int Alder= Person1.Alder(2023);
             System.out.print(Person1.navn+" er "+Alder+" år");


         }
     }
}

/*class EksempelTilPerson{
   public static void main( String [] args){
      Person EnPerson = new Person();
        String EtNavn = EnPerson.Navn("Neymar ",  "Jr"+" og er");
       System.out.println(EtNavn);

    }

}

 */
