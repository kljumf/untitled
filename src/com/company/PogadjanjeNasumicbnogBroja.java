package com.company;

import java.util.Scanner;

public class PogadjanjeNasumicbnogBroja {
    public static void main(String[] args) {
        int nasumičniBroj = (int) (Math.random() * 11);
        System.out.println(nasumičniBroj);
        System.out.println("Pokušajte pogoditi broj: ");
        Scanner unos = new Scanner(System.in);
        int korisnikovBroj = unos.nextInt();
        while (korisnikovBroj != nasumičniBroj) {

            if (korisnikovBroj > nasumičniBroj) {
                System.out.println("Vaš broj je veći od slučajnog broja, unesite novi broj: ");
                korisnikovBroj = unos.nextInt();
            } else {
                System.out.println("Vaš broj je manji od slučajnog broja, unesite novi broj: ");
                korisnikovBroj = unos.nextInt();
            }

        }
        System.out.println("Unijeli ste tačan broj.");
    }
}
