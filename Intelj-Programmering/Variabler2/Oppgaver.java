package Variabler2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Oppgave1 {
    /*
    Lag et program som leser inn alderen din (et heltall).
    Vis så denne i en meldingsbox sammen med en tekst f.eks som ”Min alder er 19 år.”
     */
    public static void main( String [] args){
        String InnAlder = showInputDialog("Skriv inn alderen din");
        int Alder = Integer.parseInt(InnAlder);
        showMessageDialog(null,"Min alder er "+Alder+ " år.");

    }


}
class Opggave2{
    /*
      Lag et program som leser inn tre desimaltall.
      Programmet skal så summere disse tallene og vise summen i System.out.
       */
    public static void main(String [] args){
        String InnTall1 = showInputDialog("Skriv inn et tall : ");
        String InnTall2 = showInputDialog("Skriv inn et tall til : ");
        String InnTall3 = showInputDialog("Skriv inn enda et tall : ");
        double Tall1 = Double.parseDouble(InnTall1);
        double Tall2 = Double.parseDouble(InnTall2);
        double Tall3 = Double.parseDouble(InnTall3);
        double Sum = Tall1+Tall2+Tall3;
        System.out.print("Summen av tallene "+Tall1+" , "+Tall2+" , "+Tall3);
        System.out.print(" er "+Sum);
    }
}
class Oppgave3{
    /*
    Utvid programmet i oppgave 2 og beregn gjennomsnittet av tallene som er lest inn.
    Vis så dette resultatet via 1) Meldingsboks og 2) System.out.
     */
    public static void main( String [] args){
            String InnTall1 = showInputDialog("Skriv inn et tall : ");
            String InnTall2 = showInputDialog("Skriv inn et tall til : ");
            String InnTall3 = showInputDialog("Skriv inn enda et tall : ");
            double Tall1 = Double.parseDouble(InnTall1);
            double Tall2 = Double.parseDouble(InnTall2);
            double Tall3 = Double.parseDouble(InnTall3);
            double Sum = Tall1+Tall2+Tall3;
            Double Gjennomsnitt = Sum / 3;
            String Ut = "Summene av tallene "+Tall1+Tall2+Tall3+" er "+Sum+"\n"+
                    "Gjennomsnitte av tallene er "+Gjennomsnitt;
            System.out.print(Ut) ;
            showMessageDialog(null,Ut);
        }

    }
class Oppgave4{
    /*
    Endre på programmet i oppgave 3 slik at du sikrer
    at det skrives inn tall og ikke vanlig tekst i input-boksene.
    Bruk try og catch for å få dette til.
     Dersom det ikke skrives inn et tall sett eller flere inputs skal input sette til 0.
     */
    public static void main(String [] args){
        String InnTall1 = showInputDialog("Skriv inn et tall : ");
        String InnTall2 = showInputDialog("Skriv inn et tall til : ");
        String InnTall3 = showInputDialog("Skriv inn enda et tall : ");
        double Tall1,Tall2,Tall3;
        try{
            Tall1 = Double.parseDouble(InnTall1);
            Tall2 = Double.parseDouble(InnTall2);
            Tall3 = Double.parseDouble(InnTall3);
        }
        catch (Exception e){
            Tall1 = 0;
            Tall2 = 0;
            Tall3 = 0;
        }
        double Sum = Tall1+Tall2+Tall3;
        Double Gjennomsnitt = Sum / 3;
        String Ut = "Summene av tallene "+Tall1+Tall2+Tall3+" er "+Sum+"\n"+
                "Gjennomsnitte av tallene er "+Gjennomsnitt;
        System.out.print(Ut) ;
        showMessageDialog(null,Ut);
    }
}
class Oppgave4Alternativ{
    public static void main(String [] args){
        String InnTall1 = showInputDialog("Skriv inn et tall : ");
        String InnTall2 = showInputDialog("Skriv inn et tall til : ");
        String InnTall3 = showInputDialog("Skriv inn enda et tall : ");
        double Tall1,Tall2,Tall3;
        try{
            Tall1 = Double.parseDouble(InnTall1);
        }
        catch (Exception e){
            Tall1 = 0;
        }
        try{
            Tall2 = Double.parseDouble(InnTall2);
        }
        catch (Exception e){
            Tall2 = 0;
        }
        try{
            Tall3 = Double.parseDouble(InnTall3);
        }
        catch (Exception e){
            Tall3 = 0;
        }
        double Sum = Tall1+ Tall2+ Tall3;
        Double Gjennomsnitt = Sum / 3;
        String Ut = "Summene av tallene "+Tall1+" , "+Tall2+" , "+Tall3+" er "+Sum+"\n"+
                "Gjennomsnitte av tallene er "+Gjennomsnitt;
        System.out.print(Ut) ;
        showMessageDialog(null,Ut);
    }
}
