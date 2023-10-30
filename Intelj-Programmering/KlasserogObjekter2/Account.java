package KlasserogObjekter2;

public class Account {
    private String Personnummer;
    private String Navn;
    private double Saldo;

    public Account(String Personnummer, String Navn, double Saldo) {
        this.Personnummer = Personnummer;
        this.Navn = Navn;
        this.Saldo = Saldo;
    }

    public void SetPersonnummer() {
        this.Personnummer = Personnummer;
    }
    public String GetPersonnummer(){
        return Personnummer;
    }
    public void SetNavn(){
        this.Navn = Navn;
    }
    public String GetNavn(){
        return Navn;
    }
    public void SetSaldo(int i){
        this.Saldo = Saldo;
    }
    public double  GetSaldo(){
        return Saldo;
    }


}



