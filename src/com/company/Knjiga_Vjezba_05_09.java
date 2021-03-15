package com.company;

import java.util.Scanner;

public class Knjiga_Vjezba_05_09 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        int najboljiRezultat = 0;
        String imeNajboljegStudenta = "";
        int drugiRezultat = 0;
        String imeDrugog = "";
        System.out.println("Unesite broj studenata: ");
        int brojStudenata = unos.nextInt();
        System.out.println("Unesite ime i rezultat za svakog studenta: ");
        for (int i = 0; i < brojStudenata; i++){
            String ime = unos.next();
            int rezultat = unos.nextInt();
            if (najboljiRezultat < rezultat){
                najboljiRezultat = rezultat;
                imeNajboljegStudenta = ime;
            }

        }

    }
}
