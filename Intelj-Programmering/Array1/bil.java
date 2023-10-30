package Array1;

import Variabler2.Tall;

class Bil {
    private String Farge;

    public Bil(String Farge){
        this.Farge = Farge;
    }
    public void SetFarge(String Farge){
        this.Farge = Farge;
    }
    public String GetFarge(){
        return Farge;
    }
}
class Reference{
    private static void ReferenceTest(Bil [] ListeAvBiler, String Farge){
        Farge = "Grønn";
        ListeAvBiler[0].SetFarge(Farge);
    }
    public static void main(String [] args){
        Bil [] biler = new Bil [3];

        Bil Volvo = new Bil("Rød");
        Bil Mercedes = new Bil("Svart");
        Bil BMW = new Bil("Blå");

        biler [0] = Volvo;
        biler [1] = Mercedes;
        biler [2] = BMW;

        String Farge = "Oransj";
        ReferenceTest(biler, Farge);

        System.out.println("Fargen til volvoen er : "+biler[0].GetFarge());
        System.out.println("Variablen farge er nå : "+Farge);
    }
}
class MiniMax{
    private static int min(int [] InnArray){
        int Minste = InnArray[0];
        for (int tall : InnArray){
            if (tall < Minste){
                Minste = tall;
            }
        }
        return Minste;
    }
    public static int Maks(int [] InnArray){
        int Største = InnArray [0];
        for (int tall : InnArray) {
            if (tall > Største){
                Største = tall;
            }
        }
        return Største;
    }
    public static void main(String [] args){
        int [] Liste = {3, -1, 0, 34, -6,8};

        System.out.println("Største tallet er "+Maks(Liste));
        System.out.println("Minste tallet er "+min(Liste));
    }
}
class BinærSøk {
    public static int Indeks(int[] Liste, int Nøkkel) {
        int Lav = 0;
        int Høy = Liste.length - 1;
        while (Lav <= Høy) {
            //Nøkkel er i listen eller ikke tilsetdet (return -1).
            int Middel = Lav + (Høy - Lav) / 2;
            if (Nøkkel < Liste[Middel]) {
                Høy = Middel - 1;
            } else if (Nøkkel > Liste[Middel]) {
                Lav = Middel + 1;
            } else {
                return Middel;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int [] primtall = {2, 3, 4, 5, 7, 11, 13, 17, 19, 23, 31, 37,
                           41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        //NB: Må være en liste som sortert stigende!
        System.out.println("Tallet 42 er et primtall "+Indeks(primtall, 43));
        System.out.println("Tallet 43 er ikke et primtall "+Indeks(primtall, 42));
    }
}



