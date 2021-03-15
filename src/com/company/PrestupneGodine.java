package com.company;

import java.util.Scanner;

public class PrestupneGodine {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite početnu godinu: ");
        int početnaGodina = unos.nextInt();
        System.out.println("Unesite krajnju godinu: ");
        int krajnjaGodina = unos.nextInt();
        int brojač = 0;
        int brojPoRedu = 0;
        for (brojač = početnaGodina; brojač <= krajnjaGodina; brojač++) {
            if ((brojač % 4 == 0 && brojač % 100 != 0) || (brojač % 400 == 0)) {
                System.out.print(brojač + " ");
                brojPoRedu++;
                if (brojPoRedu == 10) {
                    System.out.println();
                    brojPoRedu = 0;
                }
            }
        }
    }
}
