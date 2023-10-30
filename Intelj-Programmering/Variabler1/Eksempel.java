package Strenger;

import javax.swing.*;

public class Eksempel
{
    public static void main(String []args)
    {
        String navn;
        navn = JOptionPane.showInputDialog("Hvem er du?");
        String utskrift;
        utskrift = "Hei " +  navn;
        JOptionPane.showMessageDialog(null, utskrift);
    }
}
