package OppgaverOblig2;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    private static boolean i;

    public static void main(String[] args) {
        int NedreGrense = parseInt(showInputDialog("Skriv inn et tall"));
        if (NedreGrense < 0) {
            showMessageDialog(null, "Tallet er for lavt, vær så snill velg et større tall");
        }
        int ØvreGrense = parseInt(showInputDialog("Skriv innn et tall som er større enn den forrige"));
        if (ØvreGrense > 100) {
            showMessageDialog(null, "Tallet er altfor stort! Velg et mindre tall");
        }
        if (NedreGrense > ØvreGrense) {
            showMessageDialog(null, "Tallet er lavere enn den første, please velg et større tall");
            return;
        }
        int SluttSum = 0;

        for (int i = NedreGrense; i <= ØvreGrense; i++) {
            SluttSum += i;
            if (i == NedreGrense) {
                System.out.print(i);
            }
            else if (i == ØvreGrense) {
                System.out.print(" + " + i + " = " + SluttSum );
            }
            else{
                    System.out.print(" + " + i);
                }
            if(i%10==0){
                System.out.println();
            }
            }

        


        }
    }





