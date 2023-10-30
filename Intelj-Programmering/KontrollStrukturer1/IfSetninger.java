package KontrollStrukturer1;

import javax.swing.*;

public class IfSetninger {
    public static void main(String [] args){
        String InPut = JOptionPane.showInputDialog("Fyll inn alderen din : ");
        int Alder = Integer.parseInt(InPut);
        if (Alder < 13){
            JOptionPane.showMessageDialog(null, "Du er ikke gammel nok");
        }
        else if (Alder < 18){
            JOptionPane.showMessageDialog(null,"Du er ungdom");
        } else if (Alder < 70) {
            JOptionPane.showMessageDialog(null, "Du er voksen");
        }
        else {
            JOptionPane.showMessageDialog(null, "Du er pensjonist");
        }
    }
}
class IfSetninger2{
    //Alternativ for If-Setninger
    public static void main(String [] args){
        String Input2 = JOptionPane.showInputDialog("Fyll inn Alderen din :");
        int Alder2 = Integer.parseInt(Input2);

        if (Alder2 < 13){
            JOptionPane.showMessageDialog(null,"Du er et barn");
        }
        if (Alder2 >= 13 && Alder2 < 18){
            JOptionPane.showMessageDialog(null, "Du er ungdom");
        }
        if (Alder2 >= 18 && Alder2 < 70){
            JOptionPane.showMessageDialog(null, "Du er voksen");
        }
        if (Alder2 >= 70){
            JOptionPane.showMessageDialog(null, "Du er pensjonist");
        }
    }

}
