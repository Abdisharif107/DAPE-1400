package Variabler2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Desimaltall {
    public static void main( String [] args){
        String InnStreng1 = showInputDialog("Skriv inn et desimaltall");
        String InnStreng2 = showInputDialog("Skriv inn et desimaltall til");
        double InnTall1 = Double.parseDouble(InnStreng1);
        double InnTall2 = Double.parseDouble(InnStreng2);
        double Divisjon = InnTall1/InnTall2;
        String Ut = "Divisjonen "+InnTall1+ " er delt på "+InnTall2+" er "+Divisjon;
        showMessageDialog(null,Ut);

    }

}
