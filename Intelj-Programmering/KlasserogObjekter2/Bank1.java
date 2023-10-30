package KlasserogObjekter2;

public class Bank1 {
    public static void main ( String [ ] args ){
        //TOD0 code application logic here
        Account SavingAccount = new Account("1234567890","Neymar Jr",9000);
        Account PaymentAccount = new Account("1234567890","Neymar Jr,",5000);
        SavingAccount.SetSaldo(2000);
        PaymentAccount.SetSaldo(1000);
        System.out.println("Spaerkonten tilhører "+SavingAccount.GetNavn());
        System.out.println("Saldoen til denne er nå "+SavingAccount.GetSaldo()+ " kr" );
        System.out.println("Saldoen til lønnskontoen er "+PaymentAccount.GetSaldo()+" kr");

    }
}
