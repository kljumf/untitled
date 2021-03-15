package Metode;

public class KnjigaZadatak_06_10_Ponovo {

    public static boolean isPrime(int broj) {
        for (int i = 2; i < broj; i++) {
            if (broj % i == 0) {
                return false;

            }
        }
        return true;
    }
    public static void primarniBroj (int broj){
        int brojac = 0;
        for (int i = 1; i < broj; i++){
            brojac++;
            if (isPrime(i)){
                System.out.println(i);
            }

        }
        System.out.println("Ukupno primarnih brojeva je " + brojac);
    }
}
