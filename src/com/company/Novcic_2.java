package com.company;

public class Novcic_2 {
    public static void main(String[] args) {
        int novčić = (int) (Math.random() * 2);
        int glava = 0;
        int pismo = 0;
        int brojac = 0;
        for (brojac = 0; brojac < 1000000; brojac++) {

            if (novčić == 1) {
                glava++;
            } else {
                pismo++;
            }

        }
        System.out.println("glava je " + glava + " pismo je " + pismo);
    }
}
