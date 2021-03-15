package com.company;

import java.util.Scanner;

public class Sekunde {
    public static void main(String[] args) {
        //1. tražiti od korisnika da unese broj sekundi
        //2. izračunati broj minuta i sekundi
        //3. ispisati dobijeni rezultat
        System.out.println("Molimo Vas unesite broj sekundi: ");
        Scanner sekunde = new Scanner(System.in);
        int brojSekundi = sekunde.nextInt();
        int brojMinuta = brojSekundi / 60;
        int ostatkSekundi = brojSekundi % 60;
        System.out.println(brojSekundi + " sekudni je " + brojMinuta + " minuta i " + ostatkSekundi + " sekundi ");


    }
}
