package Array1;

public class Arrays {
    public static void main( String [] args){
        int [] Liste = new int[4];
        Liste[0] = 23;
        Liste[1] = 2;
        Liste[2] = -4;
        Liste [3] = 5;

        String Ut = "Her er tallene i listen : ";
        Ut += Liste[0] + " ";
        Ut += Liste[1] + " ";
        Ut += Liste[2] + " ";
        Ut += Liste[3] + " ";
        System.out.println(Ut);

        //Alternativt med en løkke
        for (int i= 0; i < Liste.length; i++){
            System.out.print(Liste[i] + " ");
        }

    }
}
