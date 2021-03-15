package com.company;

import java.util.Scanner;

public class Cijelibrojevi {
    public static void main(String[] args) {
        // Tražiti od korisnika da unese cijeli broj
        System.out.println("Unesite cijeli broj: ");
        Scanner unos = new Scanner (System.in);
        int cijeliBroj = unos.nextInt();
        int prviBroj = cijeliBroj / 100;
        int drugiBroj = (cijeliBroj / 10) % 10;
        int zadnjiBroj = cijeliBroj % 10;
        System.out.println("Zbir cifara je: " + prviBroj + " " + drugiBroj + " " + zadnjiBroj + " " + "= " + (prviBroj + drugiBroj + zadnjiBroj));    }
}
