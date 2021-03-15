package Metode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Scanner unos = new Scanner(System.in);
        System.out.println("Unesite broj stranica: ");
        int brojStranica = unos.nextInt();
        System.out.println("Unesite velicinu stranice: ");
        double stranica = unos.nextDouble();
        System.out.println(KnjigaZadatak_06_36.area(brojStranica, stranica));
}
}
