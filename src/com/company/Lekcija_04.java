package com.company;

import java.util.Scanner;

public class Lekcija_04 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite cijeli broj: ");
        int cijeliBroj = unos.nextInt();
        for (cijeliBroj = 1; cijeliBroj <= 100; cijeliBroj++){
            if (cijeliBroj % 13 == 0){
                System.out.print(cijeliBroj + " ");
            }
        }
    }
}
