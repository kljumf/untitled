package com.company;

public class DjeljivostBrojeva {
    public static void main(String[] args) {
        int brojac = 0;
        for (int i = 100; i <= 200; i++) {

            if (i % 5 == 0 ^ i % 6 == 0) {
                brojac++;
                System.out.print(i + " ");
                if (brojac == 10) {
                    System.out.println();
                    brojac = 0;
                }

            }

        }
    }
}
