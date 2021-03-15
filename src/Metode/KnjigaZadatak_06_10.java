package Metode;

public class KnjigaZadatak_06_10 {
    public static void ispisProstihBrojervaDo(int doBroja) {

        for (int i = 1; i < doBroja; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
