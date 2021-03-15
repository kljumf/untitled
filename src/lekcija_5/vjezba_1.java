package lekcija_5;

import java.util.Scanner;

public class vjezba_1 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite string: ");
        String string = unos.nextLine();
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }

    }
}
