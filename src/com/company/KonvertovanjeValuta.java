package com.company;

import java.util.Scanner;

public class KonvertovanjeValuta {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        final double KONVERTIBILNE_MARKE_U_FUNTAMA = 2.20;
        System.out.print("Unesite iznos u funtama: ");
        double funta = unos.nextDouble();
        System.out.print("Iznos u KM je: " + (funta * KONVERTIBILNE_MARKE_U_FUNTAMA));
    }
}