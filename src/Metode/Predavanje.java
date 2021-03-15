package Metode;

import java.io.CharArrayReader;

public class Predavanje {
    public static void main(String[] args) {
        String riječ = "Napisati";
        int brojacVelikihSlova = 0;
        int brojacMalihSlova = 0;

        for (int i = 0; i < riječ.length(); i++){

            if (Character.isUpperCase(riječ.charAt(i)));
            {
                brojacVelikihSlova++;
            }

        }
        System.out.println(brojacVelikihSlova);
    }

}
