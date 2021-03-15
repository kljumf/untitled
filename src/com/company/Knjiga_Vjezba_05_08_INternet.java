package com.company;

import java.util.Scanner;

public class Knjiga_Vjezba_05_08_INternet {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        int najboljiRezultat = 0;
        String imeNajboljegStudenta = "";
        System.out.println("Unesite broj studenata: ");
        int brojStudenata = unos.nextInt();
        System.out.println("Unesite ime i rezultat svakog studenta: ");
        for (int i = 0; i < brojStudenata; i++){
            System.out.println("Student: " + (i + 1) + "\n  Ime: ");
            String ime = unos.next();
            System.out.println("      rezultat:  ");
            int rezultat = unos.nextInt();
            if (rezultat > najboljiRezultat){
                najboljiRezultat = rezultat;
                imeNajboljegStudenta = ime;

            }
        }
        System.out.println("Student sa najboljim rezultatom je: " + imeNajboljegStudenta);
    }
}
