package com.company;

import java.util.Scanner;

public class Knjiga_Vjezba_05_08 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite broj studenata: ");
        int brojStudenata = unos.nextInt();
           for (int i = 0; i <= brojStudenata; i++){
            System.out.print("Unesite ime i prezime studenta: ");
            String imeIPrezime = unos.nextLine();
            System.out.println("Unesite ostvareni rezultat: ");
            int rezultat = unos.nextInt();
              // System.out.println(imeIPrezime + " " + rezultat);
        }

    }
}
