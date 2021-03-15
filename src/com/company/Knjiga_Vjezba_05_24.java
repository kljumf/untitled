package com.company;

public class Knjiga_Vjezba_05_24 {
    public static void main(String[] args) {
        double suma = 0;
        for (double x  = 1; x < 98; x += 2) {
           double y = x + 2;
           suma += x / y;
           System.out.println(x + "        " + y + "    " + suma);



            }
        System.out.println("Suma niza 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/33 + ... + 95/97 + 97/99 je " + suma);



        }
    }


