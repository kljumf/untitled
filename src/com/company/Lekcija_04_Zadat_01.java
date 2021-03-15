package com.company;

import java.util.Scanner;

public class Lekcija_04_Zadat_01 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite string: ");
        String noviUnos = unos.nextLine();
        System.out.println(noviUnos);
        System.out.println("Dužina stringa je " + noviUnos.length());
        System.out.println("Prvi karakter je " + noviUnos.charAt(0));

    }
}
