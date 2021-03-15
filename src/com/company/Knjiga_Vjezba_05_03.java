package com.company;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;

public class Knjiga_Vjezba_05_03 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        final double kilogramPoFunti = 2.2;
        System.out.println("Kilogarm                 Funta  |   Funta                     Kilogram");
        for (int i = 1; i < 200; i += 2) {
            double funta = i * kilogramPoFunti;
            Formatter noviFormat = new Formatter();
            noviFormat.format("%.1f", funta);
            for (int y = 20; y < 516; y += 5)

                System.out.println(i + "                           " + noviFormat + " | " + y + "                   " + (y / kilogramPoFunti));
        }

    }
}
