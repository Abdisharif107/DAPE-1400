package KontrollStrukturer1;

import java.security.SecureRandom;

public class Terningkast {
    public static void main(String[] args) {
        int AntallKast = 1000;

        int Terning1 = 0;
        int Terning2 = 0;
        int Terning3 = 0;
        int Terning4 = 0;
        int Terning5 = 0;
        int Terning6 = 0;

        int Kast;

        SecureRandom TilfeldigTall = new SecureRandom();

        for (int i = 0; i < AntallKast; i++) {
            Kast = TilfeldigTall.nextInt(6);
            Kast++;
            if (Kast == 1) {
                Terning1++;
            }
            else if (Kast == 2) {
                Terning2++;
            }
            else if (Kast == 3) {
                Terning3++;
            }
            else if (Kast == 4) {
                Terning4++;
            }
            else if (Kast == 5) {
                Terning5++;
            }
            else {
                Terning6++;
            }
            String UtStreng = "";
            UtStreng += "Antall 1`ere er : " + Terning1 + "\n";
            UtStreng += "Antall 2`ere er : " + Terning2 + "\n";
            UtStreng += "Antall 3`ere er : " + Terning3 + "\n";
            UtStreng += "Antall 4`ere er : " + Terning4 + "\n";
            UtStreng += "Antall 5`ere er : " + Terning5 + "\n";
            UtStreng += "Antall 6`ere er : " + Terning6 + "\n";
            System.out.println(UtStreng);


        }
    }

    class switch1 {
        public static void main(String[] args) {
            int AntallKast = 6000;

            int Terning1 = 0;
            int Terning2 = 0;
            int Terning3 = 0;
            int Terning4 = 0;
            int Terning5 = 0;
            int Terning6 = 0;

            int Kast;

            SecureRandom TilfeldigTall = new SecureRandom();

            for (int i = 0; i < AntallKast; i++) ;
            Kast = TilfeldigTall.nextInt(6);
            Kast++;
            switch (Kast) {
                case 1:
                    Terning1++;
                    break;
                case 2:
                    Terning2++;
                    break;
                case 3:
                    Terning3++;
                    break;
                case 4:
                    Terning4++;
                    break;
                case 5:
                    Terning5++;
                    break;
                default:
                    Terning6++;
                    break;
            }
            String UtStreng = "";
            UtStreng += "Antall 1`ere er : " + Terning1 + "\n";
            UtStreng += "Antall 2`ere er : " + Terning2 + "\n";
            UtStreng += "Antall 3`ere er : " + Terning3 + "\n";
            UtStreng += "Antall 4`ere er : " + Terning4 + "\n";
            UtStreng += "Antall 5`ere er : " + Terning5 + "\n";
            UtStreng += "Antall 6`ere er : " + Terning6 + "\n";
            System.out.println(UtStreng);
        }
    }
}


