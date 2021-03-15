package Metode;

public class Predavanje_03 {

    public static void ispisiKaraktere(char pocetniKarakter, char zavrsniKarakter,
                                       int brojPoLiniji) {
        int brojac = 0;
        for (char i = pocetniKarakter; i < zavrsniKarakter; i++) {

            brojac++;
            System.out.print(i + " ");
            if (brojac == brojPoLiniji) {
                System.out.println();
                brojac = 0;
            }
        }

    }

}

