package lekcija_5;

import java.util.Scanner;

public class vjezba_04_09 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite karakter: ");
        String karakter = unos.nextLine();
        char slovo = karakter.charAt(0);
        System.out.println((int) slovo);
    }
}
