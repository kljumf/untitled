package com.company;

public class Skolarina_02_ {
    public static void main(String[] args) {
        double skolarina = 5000;
        final double POVECANJE = 1.07;
        double uvecanjeSkolarine = 10000;
        int brojGodina = 0;
        while (skolarina < uvecanjeSkolarine){
            skolarina *= POVECANJE;
            brojGodina++;

        }
        System.out.println("brojGodina : "+brojGodina);


    }

}
