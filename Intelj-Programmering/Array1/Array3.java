package Array1;
import java.util.Arrays;
public class Array3 {
    public static void main( String[] args){
        double [] Liste1 = {1.2,3.5,2.6,-3.6,5.6,10};

        Arrays.sort(Liste1);

        for (double Tall : Liste1){
            System.out.print(Tall+" ");
        }
        double [] Liste2 = Arrays.copyOf(Liste1, Liste1.length);
        double [] Liset3 = Liste2;
        boolean B = Arrays.equals(Liste2, Liste1);
        int Location = Arrays.binarySearch(Liste1, 5.6);

        System.out.println("\n Indeksen til tallet 5.6 er : "+Location);
    }
}
