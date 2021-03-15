package com.company;

import java.util.Scanner;

public class Skolarina {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        double skolararina = 10000;
        double rastSkolarine = 0.05;
        int godina = 0;
        double ukupnaSkolarina = 0;

        for (godina = 1; godina < 11; godina++) {
            skolararina = skolararina + (skolararina * 0.05);
            if (godina == 10)
                System.out.println("Skolarina u destoj godini je " + skolararina);
        }
        for (godina = 1; godina < 5; godina++) {
            skolararina = skolararina + (skolararina * 0.05);
            ukupnaSkolarina += skolararina;
            if (godina == 4)
                System.out.println("Ukupna skolarina 4 godine poslije 10 godine je " + ukupnaSkolarina);
        }

    }
}

