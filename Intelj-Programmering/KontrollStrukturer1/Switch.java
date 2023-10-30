package KontrollStrukturer1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Switch {
    public static void main(String [] args){
        double Resultat = 0;
        double Tall1 = Double.parseDouble(showInputDialog("Skriv inn tall 1 : "));
        String Regneark = showInputDialog("+, -, *, /");
        double Tall2 = Double.parseDouble(showInputDialog("Skriv inn tall : 2"));
        switch (Regneark){
            case "+":
                Resultat = Tall1 + Tall2;
                break;
            case "-":
                Resultat = Tall1 - Tall2;
                break;
            case "*":
                Resultat = Tall1 * Tall2;
                break;
            case "/":
                Resultat = Tall1 / Tall2;
                break;
            default:
                Resultat = 0;
                break;
        }
        showMessageDialog(null, "Resultatet av regnestykket ble : "+Tall1+" "+Regneark+" "+Tall2+" = "+Resultat);

        /*
        if (Regneark.equals("+")){
            Resultat = Tall1 + Tall2;
        }
        if (Regneark.equals("-")){
            Resultat = Tall1 - Tall2;
        }
        if (Regneark.equals("*")){
            Resultat = Tall1 * Tall2;
        }
        if (Regneark.equals("/")){
            Resultat = Tall1 / Tall2;
        }
        showMessageDialog(null, "Resultatet av regnestykket ble : "+Tall1+" "+Regneark+" "+Tall2+" = "+Resultat);
        */
    }


}
