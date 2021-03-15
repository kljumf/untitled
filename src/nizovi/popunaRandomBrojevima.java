package nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class popunaRandomBrojevima {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite veličinu niza: ");
        int velicinaNIza = unos.nextInt();
        int[] niz = new int[velicinaNIza];
        int najvecaVrijednost = niz [0];
        int index = 0;

        for (int i = 0; i < niz.length; i++) {
            niz[i] = unos.nextInt();
            if (najvecaVrijednost < niz[i]) {
                najvecaVrijednost  = niz[i];
                index = i;
            }
        }
        System.out.println(najvecaVrijednost + " " + index);
    }
}
