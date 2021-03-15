package com.company;

import java.util.Scanner;

public class Racunanje1 {
    public static void main(String[] args) {
    double stopaPDVa = 1.17;
        System.out.println("Unesite vrijednost");
        Scanner unos = new Scanner(System.in);
        double unesenaVrijednost = unos.nextDouble();
        double sumasapdvom = unesenaVrijednost * stopaPDVa;
        System.out.println("Iznos sa PDV-om: " + sumasapdvom);

    }
}
