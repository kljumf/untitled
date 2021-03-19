package nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class KnjigaZadatak_07_27 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("duzina niz 1");

        int duzinaPrvogNiza = unos.nextInt();
        int[] niz1 = new int[duzinaPrvogNiza];

        System.out.println("Unesite niz 1");
        for (int i = 0; i < niz1.length; i++) {
            System.out.print("el:");

            niz1[i] = unos.nextInt();
        }
        System.out.println("duz niz2: ");
        int dr = unos.nextInt();
        int[] niz2 = new int[dr];

        for (int i = 0; i < niz2.length; i++) {
            System.out.print("el:");
            niz2[i] = unos.nextInt();
        }
        if (equals(niz1, niz2) == true) {

            System.out.println("Nizovi su identični.");
        }
        if (equals(niz1, niz2) == false)
            System.out.println("Nizovi su različiti.");
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {

            return false;

        }
        Arrays.sort(list1);
        Arrays.sort(list2);
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }

        }
        return true;
    }
}
