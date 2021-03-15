package com.company;

import java.util.Scanner;

public class Kniga_Vjezba_05_01_Internet {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite cijeli broj, niz se prekida kada uneste 0: ");
        int cijeliBroj = unos.nextInt();
        int pozitivniBojevi = 0;
        int negativniBrojevi = 0;
        double suma = 0;
        int brojač = 0;
        while (cijeliBroj !=0){
            if (cijeliBroj > 0)
                pozitivniBojevi++;
            else
                negativniBrojevi++;
            suma += cijeliBroj;
            brojač ++;
            cijeliBroj = unos.nextInt();
        }
        System.out.println("Ukupno pozitivnih brojeva je " + pozitivniBojevi);
        System.out.println("Ukupno negativnih brojeva je " + negativniBrojevi);
        System.out.println("Suma je " + suma);
        System.out.println("Prosjek je " + (suma / brojač));
    }
}
