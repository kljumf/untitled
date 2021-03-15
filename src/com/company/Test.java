package com.company;

import java.util.Scanner;

public class Test {

    public static void ocjenjivanje(double bodovi) {
        if (bodovi >= 90) {
            System.out.print("Ocjena je 10");
        }
        if (bodovi < 90 && bodovi >= 80) {
            System.out.print("Ocjena je 9");
        }
        if (bodovi < 80 && bodovi >= 70) {
            System.out.print("Ocjena je 8");
        }
        if (bodovi < 70 && bodovi >= 60) {
            System.out.print("Ocjena je 7");
        }
        if (bodovi < 60 && bodovi >= 50) {
            System.out.print("Ocjena je 6");
        }
        if (bodovi < 50) {
            System.out.print("Korisnik nije položio ispit");
        }

    }

    public static void main(String[] args) {
        System.out.print("N je osvojio ");
        ocjenjivanje(65.9);

    }
}
