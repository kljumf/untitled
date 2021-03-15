package Metode;

public class KnjigaZadatak_06_08 {
    public static double celsisuToFahrenhite (double celsius){
        double fahrenhite = 0;
        fahrenhite = (9.0 / 5) * celsius + 32;

    return fahrenhite;
    }

    public static double fahrenhiteToCelsius (double fahrenhite){
        double celsius = 0;
        celsius = (5.0 / 9) * (fahrenhite - 32);
        return celsius;
    }
}
