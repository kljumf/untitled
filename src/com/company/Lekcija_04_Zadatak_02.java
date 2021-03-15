package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Lekcija_04_Zadatak_02 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite ocjenu slovima A, B, C, D ili F: ");
        String slovo = unos.next().toUpperCase(Locale.ROOT);
        switch (slovo){
            case "A":
                System.out.println("5");
                break;
            case "B":
                System.out.println("4");
                break;
            case "C":
                System.out.println("3");
                break;
            case "D":
                System.out.println("2");
                break;
            case "E":
                System.out.println("1");
                break;





        }

    }
}
