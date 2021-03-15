package com.company;

import java.util.Scanner;

public class Knjiga_Vjezba_05_01 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite cijeli broj, niz se prekida kada uneste 0: ");
        int cijeliBroj = unos.nextInt();
        int pozitivniBojevi = 0;
        int negativniBrojevi = 0;
        double suma = 0;
        int brojač = 0;
        while (cijeliBroj != 0){
            suma += cijeliBroj;
            brojač++;

            if (cijeliBroj > 0) {
                cijeliBroj = unos.nextInt();
                pozitivniBojevi++;
                }
            else if (cijeliBroj < 0){
                cijeliBroj = unos.nextInt();
                negativniBrojevi++;
                }


            }
        System.out.println("Ukupno pozitivnih brojeva je " + pozitivniBojevi);
        System.out.println("Ukupno negativnih brojeva je " + negativniBrojevi);
        System.out.println("Suma je " + suma);
        System.out.println("Prosjek je " + (suma / brojač));
        }

            }




