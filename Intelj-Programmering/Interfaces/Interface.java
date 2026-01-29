package Interfaces;


    interface Ansatt{
        public double Lønn();
        public String GetNavn();
    }

class Selger implements Ansatt{
        private String Navn;
        private double Lønn;

        public Selger(String Navn, double Lønn){
            this.Navn = Navn;
            this.Lønn = Lønn;
        }
        public double Lønn(){
            return Lønn + 30_000;
        }
        public String GetNavn(){
            return this.Navn;
    }
}

class Montør implements Ansatt{
        private String Navn;
        private double Lønn;

        public Montør(String Navn, double Lønn){
            this.Navn = Navn;
            this.Lønn = Lønn;
        }
        public String GetNavn(){
            return this.Navn;
        }
        public double Lønn(){
            return Lønn;
        }
}

public class Interface {
        public static void main(String [] args){
            Ansatt EnSelger = new Selger("Kylian Mbappé", 250_000);
            Ansatt EnMontør = new Montør("Lionel Messi", 500_000);

            Ansatt [] Liste = new Ansatt[10];
            Liste [0] = EnSelger;
            Liste [1] = EnMontør;

            for (int i = 0; i < Liste.length && Liste [i]!=null; i++){
                System.out.println(Liste[i].GetNavn()+" tjener "+Liste[i].Lønn());
            }
            // Alternativ
            for (Ansatt EnAnsatt : Liste){
                if (EnAnsatt!=null){
                    System.out.println(EnAnsatt.GetNavn()+" tjener "+EnAnsatt.Lønn());
                }
            }
        }
}
