package KlasserogObjekter2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/*
Det skal lages en klasse kalt Vind. Denne klassen skal beregne ut i fra en
oppgitt vindhastighet i km/t om det er stille (mindre enn 2 km/t)
og om det er orkan (mer enn 120 km/t).

Videre skal klassen kunne beregne hvor mye vindhastigheten tilsvarer på Beaufort-skala (1-12).
Formelen for Beaufort er :
(((vindhastighet i km/t) / 3.01)^0.6666)+0.5. ^ betyr opphøyd i.
Bruk gjerne Math.pow funksjonen for å foreta beregningen.

Til slutt skal det være mulig å regne ut antall knop i en metode. En knop er lik 1852 meter.

Nedenfor illustreres hvordan klassen og metodene skal se ut:

public class Vind {
   private double vindHastighet = 0.0;

   // her skal det inn en konstruktør for å sette vindhastigheten

   public double getVindhastighet() {
   // sett inn kode her
   }

   public boolean erOrkan() {
   // sett inn kode her
   }

   public boolean erVindstille() {
   // sett inn kode her
   }

   public double getKnop() {
   // sett inn kode her
   }

   public int getBeaufort() {
   // sett inn kode her
   }
}
Lag så kode for å teste ut metodene via en main-metode.
 */
class Vind {
    private double VindHastighet = 0.0;

    public Vind(double VindHastighet) {
        this.VindHastighet = VindHastighet;
    }


    public double getVindhastighet() {
        return VindHastighet;
    }


    public boolean erOrkan() {
        if (VindHastighet >= 120) {
            return true;
        }
        return false;
    }

    public boolean erVindstille() {
        if (VindHastighet <= 2) {
            return true;
        }
        return false;
    }


    public double getKnop() {
        double Knop = VindHastighet / 1.852;
        return Knop;
    }

    public int getBeaufort() {
        int Beaufort = (int) (Math.pow(VindHastighet / 3.01, 0.666) + 0.5);
        if (Beaufort > 12){
            Beaufort =12;
        }
        return Beaufort;
    }
}




public class Oppgave6 {
    public static void main ( String [] args ){
        String InnVind = showInputDialog("Oppgi vindhastigheten");
        double vind = Double.parseDouble(InnVind);
        Vind SjekkVind = new Vind(vind);
        String Ut = "Vindhastigheten er "+SjekkVind.getVindhastighet()+"\n";
        if (SjekkVind.erOrkan()){
            Ut+="Det er orkan.\n";
        }
        if (SjekkVind.erVindstille()){
           Ut+="Det er vindstille.\n";
        }
        String Knop = String.format("%.2f", SjekkVind.getKnop());
        Ut += "Det er "+Knop+" knop.\n";
        Ut += "Og det tilsvarer "+SjekkVind.getBeaufort()+" på beaufort-skalaen";
        showMessageDialog(null,Ut);
    }
}
