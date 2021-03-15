package nizovi;

import java.util.Scanner;

public class NizProsjekBrojeva {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite dužinu niza: ");
        int duzinaNiza = unos.nextInt();
        System.out.println("Unesite int brojeve: ");
        int[] nizInt = new int[duzinaNiza];
        double[] nizDouble = new double[duzinaNiza];
        for (int i = 0; i < nizInt.length; i++) {

            nizInt[i] = unos.nextInt();
        }
        System.out.println("Unesite double niz: ");
        for (int i = 0; i < nizDouble.length; i++) {

            nizDouble[i] = unos.nextDouble();
        }
        System.out.println("Prosjek je: " + average(nizDouble));
    }

    public static int average(int[] array) {
        int zbirBrojeva = 0;
        int prosjekBrojeva = 0;

        for (int i = 0; i < array.length; i++) {
            zbirBrojeva += array[i];
            prosjekBrojeva = zbirBrojeva / array.length;


        }
        return prosjekBrojeva;
    }

    public static double average(double[] array) {
        double zbirBrojeva = 0;
        double prosjekBrojeva = 0;

        for (int i = 0; i < array.length; i++) {
            zbirBrojeva += array[i];
            prosjekBrojeva = zbirBrojeva / array.length;


        }
        return prosjekBrojeva;
    }
}



