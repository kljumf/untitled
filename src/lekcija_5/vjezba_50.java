package lekcija_5;

import java.util.Scanner;

public class vjezba_50 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite riječ: ");
        String rijec = unos.nextLine();
        int brojac = 0;
        for (int i = 0; i < rijec.length(); i++){
            if (Character.isUpperCase(rijec.charAt(i))) {
                brojac++;
            }
        }
        System.out.println("Velikih slova je " + brojac);

    }
}
