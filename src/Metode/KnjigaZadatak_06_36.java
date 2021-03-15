package Metode;

public class KnjigaZadatak_06_36 {

    public static double area(int n, double side){
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
