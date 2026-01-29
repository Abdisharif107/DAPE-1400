package Alternativer;


class Dato {
    private int dag, måned, år;

    public Dato( int dag, int måned, int år ) {
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
        return dag + " "+månedsnavn(måned)+" "+år;
    }
}

class Motorsykkel extends Kjøretøy{

    public Motorsykkel(String typebetegnelse, Dato førstegangsregistrert, String kjennetegn){
        super(typebetegnelse, førstegangsregistrert, kjennetegn);
    }

    public String toString() {
        return super.toString();
    }
}

class Bil extends Kjøretøy{

    public int lastekapasitet;

    public Bil(String typebetegnelse, Dato førstegangsregistrert, String kjennetegn,int lastekapasitet) {
        super(typebetegnelse, førstegangsregistrert, kjennetegn);
        this.lastekapasitet = lastekapasitet;
    }

    public String toString(){
        String ut = super.toString();
        ut += "Lastekapasitet : "+lastekapasitet;
        return ut;
    }
}

class Kjøretøy{
    public String typebetegnelse;
    public Dato førstegangsregistrert;
    public String kjennetegn;

    public Kjøretøy(String typebetegnelse, Dato førstegangsregistrert, String kjennetegn) {
        this.typebetegnelse = typebetegnelse;
        this.førstegangsregistrert = førstegangsregistrert;
        this.kjennetegn = kjennetegn;
    }

    public String toString(){
        String ut = "Typebetegnelse : "+typebetegnelse+"\n"+
                "Førstegangsregistrert : "+førstegangsregistrert+"\n"+
                "Kjennetegn : "+kjennetegn+"\n";
        return ut;
    }
}

public class MotorvognReg {

    public static void main(String[] args) {
        // opprett et array av Biler
        Kjøretøy [] register = new Kjøretøy[100];

        Dato dato1 = new Dato(1,3,2020);

        Bil volvo = new Bil("Volvo T5",dato1,"DR34123",1000);

        Dato dato2 = new Dato(3,4,2020);

        Bil audi = new Bil("Audi RS6",dato2,"BS11223",500);

        Motorsykkel ducati = new Motorsykkel("Ducati",dato1,"DR2345");

        register[0] = volvo;
        register[1] = audi;
        register[2] = ducati;

        for (Kjøretøy etKjøretøy : register){
            if(etKjøretøy != null){
                System.out.println(etKjøretøy);
                System.out.println("----------");
            }
        }
    }
}