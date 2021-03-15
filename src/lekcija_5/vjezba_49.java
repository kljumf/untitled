package lekcija_5;

import javax.swing.*;
import java.util.Scanner;

public class vjezba_49 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite riječ: ");
        String rijec = unos.nextLine();
        int samoglasnici = 0;
        int suglasnici = 0;
        for (int i = 0; i < rijec.length(); i++) {
            if (Character.toUpperCase(rijec.charAt(i)) == 'A'
                    || Character.toUpperCase(rijec.charAt(i)) == 'E'
                    || Character.toUpperCase(rijec.charAt(i)) == 'I'
                    || Character.toUpperCase(rijec.charAt(i)) == 'O'
                    || Character.toUpperCase(rijec.charAt(i)) == 'U') {


                samoglasnici++;

            } else
                suglasnici++;
        }
        System.out.println("Suglasnika je " + suglasnici + " , a samoglasnika je " + samoglasnici);
    }
}

