package com.company;

import java.util.Scanner;

public class Metri {
    public static void main(String[] args) {
        // Tražiti od korisniak da unese broj stopa
        System.out.println("Molim Vas unesite broj stopa: ");
        Scanner unos = new Scanner(System.in);
        double brojStopa = unos.nextDouble();
        final double KONVERTER_STOPA_U_METRE = 0.305;
        // Napisati formulu za racunanje stopa u metre
        double metri = brojStopa * KONVERTER_STOPA_U_METRE;
        // Napisati stope u metre
        System.out.println("Broj metara je: " + metri);
    }
}
