package Array1;

public class Array2 {
    private static int [] Liste = {1,2,3,4,5};

    private static void SkrivArray(int [] InnListe){
        InnListe[0] = 200;
        for (int Tall : InnListe){
            System.out.print(Tall+" ");
        }
    }
    public static void main(String [] args){
        Liste [1] = 300;
        for (int Tall : Liste){
            System.out.print(Tall+" ");
        }
        System.out.println();
        SkrivArray(Liste);
        System.out.println();
        for (int Tall : Liste){
            System.out.print(Tall+" ");
        }
    }
}
