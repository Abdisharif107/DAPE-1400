package Arv;

class Ansatt{
    private String Navn;
    private double Lønn;

    public Ansatt(String Navn,double Lønn){
        this.Navn = Navn;
        this.Lønn = Lønn;
    }

    public String GetNavn(){
        return this.Navn;
    }

    public double GetLønn(){
        return this.Lønn;
    }
}

class Selger extends Ansatt{
    private static final double Bonus = 30_000;

    public Selger(String Navn, double Lønn){
        super(Navn, Lønn);
    }

    public double getLønn(){
        return super.GetLønn()+Bonus;
    }
}

class Montør extends Ansatt{
    public Montør(String Navn, double Lønn){
        super(Navn, Lønn);
    }
}

public class Arv1 {
    public static void main(String [] args){
        Ansatt Selger = new Selger("Cristian Dior",500_000);
        Ansatt Montør = new Montør("Naymar Jr",800_000);

        Ansatt [] Liste = new Ansatt[10];
        Liste [0] = Selger;
        Liste [1] = Montør;

        for (int i = 0; i < Liste.length && Liste [i]!=null;i++){
            System.out.println(Liste [i].GetNavn()+" tjener "+Liste [i].GetLønn());
        }
    }
}
