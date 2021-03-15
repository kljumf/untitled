package com.company;

import java.util.Scanner;

public class SlucajniBrojGreska {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        int prviNasumičniBroj = (int) (Math.random() * 10);
        System.out.println("Prvi nasumični broj je: " + prviNasumičniBroj);
        int drugiNaszmičniBroj = (int) (Math.random() * 10);
        System.out.println("Drugi nasumični broj je: " + drugiNaszmičniBroj);
        System.out.println("Molimo Vas unesite rezultat zbira dva nasumična broja ");
        int rezultatZbira = unos.nextInt();
        if (rezultatZbira == (prviNasumičniBroj + drugiNaszmičniBroj)) {
            System.out.println("Odgovro koji ste unijeli je tačan. Svaka čast!");

        } else {
            System.out.println("Odgovor koji ste unijeli nije tačan. Tačna odgovor je " + (prviNasumičniBroj + drugiNaszmičniBroj));
        }
    }
}

