package KontrollStrukturer2;

import javax.swing.*;

public class While2 {
    public static void main (String [] args){
        int Sum = 0;
        int Anatll = 0;
        String Input = JOptionPane.showInputDialog("Skriv inn et heltall og avslutt med 0");
        int InnTall = Integer.parseInt(Input);
        while (InnTall > 0){
            Sum = Sum + InnTall;
            Anatll = Anatll +1;
            Input = JOptionPane.showInputDialog("Skriv inn et heltall og avslutt med 0");
            InnTall = Integer.parseInt(Input);
        }
        JOptionPane.showMessageDialog(null,"Summen er :"+Sum);
        double Gjennomsnitt = (double) Sum /(double) Anatll;
        JOptionPane.showMessageDialog(null,"Gjennomsnittet er :"+Gjennomsnitt);

    }
}
