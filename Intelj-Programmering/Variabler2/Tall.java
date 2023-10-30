package Variabler2;

import javax.swing.*;

public class Tall {
    public static void main(String [] args){
        String InnStreng = JOptionPane.showInputDialog("Skriv inn et heltall");
        int Tall;
        try{
            Tall = Integer.parseInt(InnStreng);
        }
        catch (Exception e){
         Tall = 0;
        }
        System.out.println("Tallet er "+Tall);
    }
}
