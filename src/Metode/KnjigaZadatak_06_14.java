package Metode;

public class KnjigaZadatak_06_14 {
    public static double vrijednostPi(double broj) {
double pi = 0;
        for (double i = 1; i <= broj; i++)
        pi += Math.pow(-1, i + 1) / (2 * i - 1);
        pi *= 4;
        return pi;

    }

}
