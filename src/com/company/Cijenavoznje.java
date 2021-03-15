package com.company;

import java.util.Scanner;

public class Cijenavoznje {
    public static void main(String[] args) {
        // Tražiti od korisnika da unese distancu, potrošnju i cijenu po litrama
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite distancu u km: ");
        double distanca = unos.nextDouble();
        System.out.println("Unesite potrošnju goriva u litrama: ");
        double potrošnjaGoriva = unos.nextDouble();
        System.out.println("Unesite cijenu goriva po litri: ");
        double cijenaGoriva = unos.nextDouble();
        double cijenaVoznje = distanca * (potrošnjaGoriva / 100) * 1.95;
        System.out.println("Cijena voznje iznosi: " + cijenaVoznje);

    }
}
