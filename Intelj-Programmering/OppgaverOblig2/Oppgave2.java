package OppgaverOblig2;
import static javax.swing.JOptionPane.*;

public class Oppgave2 {
    int Tall;
    int RandomTall;

    public int NyttTall(){
        RandomTall = (int) (Math.random() * 201);
        return RandomTall;
    }
    public void ShowMessage(String Message){
        showMessageDialog(null, Message);
    }
    private void ForLite(){
        ShowMessage("Tallet er for lite");
    }
    private void ForStor(){
        ShowMessage("Tallet er for stort");
    }
    public void AvsluttRunde(int Antall, int Gjetning ){
        ShowMessage("Gratulerer! "+ RandomTall+
                " er det korrekte tallet du brukte "+Gjetning+" forsøk");
    }
    public void Kjørspill(){
        NyttTall();
        System.out.print(NyttTall());

        int Gjetning = 0 ;
        int RandomTall1 = RandomTall;

        while (true){
            Tall = Integer.parseInt(showInputDialog("Jeg tenker på et tall mellom 0 og 200, prøv å gjett :"));
            Gjetning++;
            try {
                if (RandomTall1 > Tall){
                    ForLite();
                } else if (RandomTall1 < Tall) {
                    ForStor();
                } else if (RandomTall1 == Tall) {
                    AvsluttRunde(RandomTall, Gjetning);
                    break;
                }
            } catch (Exception e) {
                showMessageDialog(null, "Feil");
            }
        }
    }
    public static void main ( String [] args ){
        Oppgave2 NyttSpill = new Oppgave2();
        NyttSpill.Kjørspill();
        showMessageDialog(null, "Feil");
    }
}




