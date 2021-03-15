package com.company;

import java.util.Scanner;

public class Temperatura{
    public static void main(String[] args) {
        // Tražiti od korisnika da unese temperaturu u celzijusima
        System.out.println("Unesite temperaturu u Celzijusima");
        double temperaturaCelzijus;
        Scanner unos = new Scanner(System.in);
        temperaturaCelzijus = unos.nextDouble();
        // Unijeti formulu za preračunavanje iz celzijusa u fahrenhite
        double temperaturaFahrenheite = (9.0 / 5) * temperaturaCelzijus + 32;
        // ispisati rezultat
        System.out.println("Temperatura u Fahrenheitima je: " + temperaturaFahrenheite);


    }
}
