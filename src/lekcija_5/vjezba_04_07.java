package lekcija_5;

import java.util.Scanner;

public class vjezba_04_07 {
    public static void main(String[] args) {
        System.out.println("Unesite ASCII kod: ");
        Scanner unos = new Scanner(System.in);
        int kod = unos.nextInt();
        System.out.println("Karakter je " + (char) kod);



    }
}
