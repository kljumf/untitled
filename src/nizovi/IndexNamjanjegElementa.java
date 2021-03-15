package nizovi;

import java.util.Scanner;

public class IndexNamjanjegElementa {
    public static void main(String[] args) {
        System.out.println("Unesite dužinu niza: ");
        Scanner unos = new Scanner(System.in);
        int duzinaNiza = unos.nextInt();
        int[] niz = new int[duzinaNiza];
        System.out.println("Unesite deste elemenata: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = unos.nextInt();
        }
        System.out.println("Najmanji elemnt " + smallestElement(niz) + " je na indexu " + indexOfSmallestElement(niz));
    }

    public static int indexOfSmallestElement(int[] array) {
        int najmanjaVrijednost = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (najmanjaVrijednost > array[i]) {
                najmanjaVrijednost = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int smallestElement(int[] array) {
        int najmanjaVrijednost = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (najmanjaVrijednost > array[i]) {
                najmanjaVrijednost = array[i];
                index = i;
            }
        }
        return najmanjaVrijednost;
    }
}
