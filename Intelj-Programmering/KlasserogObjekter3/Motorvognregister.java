package KlasserogObjekter3;

class Dato{
    private int Dag, Måned, År;

    public Dato(int Dag, int Måned, int År){
        this.Dag = Dag;
        this.Måned = Måned;
        this.År = År;
    }
    private static String Månedsnavn(int Mnd){
        String [] Navn = {"Januar", "Februar", "Mars", "April", "Mai", "Juni",
        "Juli", "August", "September", "Oktober", "November", "Desember"};
        if (Mnd > 0 && Mnd < 13)
        return Navn [ Mnd -1];
        else
            return "Ukjent måned";
    }
    public String ToString(){
        return Dag + " "+Månedsnavn(Måned)+" "+År;
    }
}
class Car {
    public String Typebetegnelse;
    public Date Førstegangsregistrert;
    public String Kjennetegn;

    public Car(String Typebetegnelse, Date Førstegangsregistrert, String Kjennetegn){
        this.Typebetegnelse = Typebetegnelse;
        this.Førstegangsregistrert = Førstegangsregistrert;
        this.Kjennetegn = Kjennetegn;
    }
    public String ToString(){
        String Ut = "Typebetegnelse : "+Typebetegnelse+"\n"+
                "Førstegangsregistrert : "+Førstegangsregistrert+
                "Kjennetegn : "+Kjennetegn;
        return Ut;
    }
}
public class Motorvognregister {
    public static void main(String [] args){
        Car [] Register = new Car[100];

        Date Dato1 = new Date(8, 4, 2023);

        Car Mercedes = new Car("Mercedes G63", Dato1, "EL78930");

        Date Dato2 = new Date(3, 5, 2023);

        Car BMW = new Car("BMW XM 7",Dato2,"AR67809");

        Register [0] = Mercedes;
        Register [1] = BMW;

        for (Car EnBil : Register){
            if (EnBil != null){
                System.out.println(EnBil);
                System.out.println("---------------");
            }
        }
    }
}