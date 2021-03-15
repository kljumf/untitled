package nizovi;

import java.util.Scanner;

public class PomocnaKLasa {
    public static int[] unesiNiz(int brojUnosa) {
        System.out.println("Unesite " + brojUnosa + " brojeva: ");
        Scanner unos = new Scanner(System.in);
        int[] niz = new int[brojUnosa];
        for (int i = 0; i < brojUnosa; i++) {
            niz[i] = unos.nextInt();
        }
        return niz;
    }

    public static void ispis(int[] niz) {
        for (int proizvoljno : niz) {
            System.out.println("broj = " + proizvoljno);
        }
    }



    public static void ispis(double[] niz) {
        for (double proizvoljno : niz) {
            System.out.println("broj = " + proizvoljno);
        }
    }
}
