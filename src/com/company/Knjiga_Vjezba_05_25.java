package com.company;

public class Knjiga_Vjezba_05_25 {
    public static void main(String[] args) {

        double suma = 0;
        int i = 0;
        for (i = 1; i <= 100000; i++) {
            double kolicnik = Math.pow(-1, i + 1) / ((2 * i) - 1);
            suma += kolicnik;
            if (i == 10000)
            System.out.println(4 * suma);


        }
    }
}
