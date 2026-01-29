package KlasserogObjekter3;

interface Kjøretøy{
    public String toString();
}

class Date {
    private int dag, måned, år;

    public Date(int dag, int måned, int år ) {
        this.dag = dag;
        this.måned = måned;
        this.år =år;
    }

    private static String månedsnavn( int mnd ) {
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if ( mnd > 0 && mnd < 13 )
            return navn[ mnd - 1 ];
        else
            return "ukjent måned";
    }

    public String toString(){
        return dag+" "+månedsnavn(måned)+" "+år;
    }
}

class Motorsykkel implements Kjøretøy{
    public String typeBetegnelse;
    public Date førstegangsRegistert;
    public String kjennetegn;

    public Motorsykkel(String typeBetegnelse, Date førstegangsRegistrert, String kjennetegn){
        this.typeBetegnelse = typeBetegnelse;
        this.førstegangsRegistert = førstegangsRegistrert;
        this.kjennetegn = kjennetegn;
    }

    public String toString(){
        String ut = "Typebetegnelse : "+typeBetegnelse+"\n"+
                "Første gangs registreringsdato : "+førstegangsRegistert+"\n"+
                "Kjennetegn : "+kjennetegn;
        return ut;
    }
}

class car implements Kjøretøy{
    public String typeBetegnelse;
    public Date førstegangsRegistert;
    public String kjennetegn;
    public int lastekapasitet;

    public car(String typeBetegnelse, Date førstegangsRegistrert, String kjennetegn,
               int lastekapasitet){
        this.typeBetegnelse = typeBetegnelse;
        this.førstegangsRegistert = førstegangsRegistrert;
        this.kjennetegn = kjennetegn;
        this.lastekapasitet = lastekapasitet;
    }

    public String toString(){
        String ut = "Typebetegnelse : "+typeBetegnelse+"\n"+
                "Første gangs registreringsdato : "+førstegangsRegistert+"\n"+
                "Kjennetegn : "+kjennetegn+"\n"+
                "Lastekapasitet : "+lastekapasitet+" kg";
        return ut;
    }
}

public class Interface {

    public static void main(String[] args) {
        Kjøretøy [] register = new Kjøretøy [100];

        Date dato1 = new Date(1,3,2015);

        car volvo = new car("Vovlo T5",dato1,"DP23456",450);

        Date dato2 = new Date(4,10,2016);

        Motorsykkel ducati = new Motorsykkel("Ducati",dato2,"DR4567");

        register[0]=volvo;
        register[1]=ducati;

        for (Kjøretøy etKjøretøy : register){
            if(etKjøretøy !=null){
                System.out.println(etKjøretøy);
                System.out.println("-----");
            }
        }
    }
}