package Arv;

class Dato{
    private int Dag, Måned, År;

    public Dato(int Dag, int Måned, int År){
        this.Dag = Dag;
        this.Måned = Måned;
        this.År = År;
    }
    private static String MånedNavn(int mnd){
        String [] Navn = {"Januar", "Februar","Mars", "April", "Mai", "Juni"
        ,"Juli", " August" , "September", "Oktober", "November", "Desember"};
        if (mnd > 0 && mnd < 13)
            return Navn [mnd - 1];
        else
            return "Ukjent måned";
    }

    public String Tostring(){
        return Dag+" "+MånedNavn(Måned)+" "+År;
    }
}
class Motorsykkel extends Kjøretøy{
    public int Lastekapasitet;

    public Motorsykkel(String Typebetegenlse, Dato FørstegangsRegistert, String Kjennetegn, int Lastekapasitet){
        super(Typebetegenlse,FørstegangsRegistert,Kjennetegn);

    }
    public String ToString() {
        String Ut = "Typebetegnelse : " + TypeBetegnelse + "\n" +
                "Første gangs registeringsdato : " + FørstegangsRegistret + "\n" +
                "Kjennetegn : " + Kjennetegen+"\n"+
                "Lastekapasitet : "+Lastekapasitet+" kg";
        return Ut;
    }
}
class Bil extends Kjøretøy{
    public int Lastekapasitet;

    public Bil(String TypeBetegnelse, Dato FørstegangsRegistret, String Kjennetegn, int LasteKapasitet){
        super(TypeBetegnelse,FørstegangsRegistret,Kjennetegn);
        this.Lastekapasitet = LasteKapasitet;
    }
    public String ToString(){
        String Ut ="Typebetegnelse : "+TypeBetegnelse+"\n"+
                "Første gangs registreringsdato : "+FørstegangsRegistret+"\n"+
                "Kjennetegn : "+Kjennetegen+"\n"+
                "Lastekapasitet : "+Lastekapasitet+" kg";
        return Ut;
    }
}

class Kjøretøy{
    public String TypeBetegnelse;
    public Dato FørstegangsRegistret;
    public String Kjennetegen;

    public Kjøretøy(String TypeBetegnelse, Dato FørstegangsRegistret, String Kjennetegn){
        this.TypeBetegnelse = TypeBetegnelse;
        this.FørstegangsRegistret = FørstegangsRegistret;
        this.Kjennetegen = Kjennetegn;
    }
}

public class Motorvogn {
    public static void main(String [] args){
        Kjøretøy [] Register = new Kjøretøy[100];

        Dato dato1 = new Dato(3,5,2023);

        Bil Mercedes = new Bil("Mercedes G63 AMG",dato1,"AM12345",2800);

        Dato dato2 = new Dato(6,8,2024);

        Bil Porsche = new Bil("Porsche GT3 RS",dato2,"SU56789",1430);

        Dato dato3 = new Dato(9,7,2023);

        Motorsykkel Kawasaki = new Motorsykkel("Kawasaki Ninja H2R",dato3,"Bu09876",216);

        Register [0] = Mercedes;
        Register [1] = Porsche;
        Register [2] = Kawasaki;

        for (Kjøretøy EtKjøretøy : Register){
            if (EtKjøretøy !=null){
                System.out.println(EtKjøretøy);
                System.out.println("-----------------");
            }
        }
    }
}
