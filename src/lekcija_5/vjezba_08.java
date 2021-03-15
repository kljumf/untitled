package lekcija_5;

import java.util.Scanner;

public class vjezba_08 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite broj studenata: ");
        int brojStudenata = unos.nextInt();
        double rezultat = 0;
        String imeStudenta = "";
        String najbojljeRangiraniStudent = "";
        double najboljiRezultat = 0;
        for (int i = 1; i <= brojStudenata; i++) {
            System.out.println("Unesite ime i rezultat za svakog studenta: ");
            imeStudenta = unos.next();
            rezultat = unos.nextDouble();
            if (rezultat > najboljiRezultat) {
                najboljiRezultat = rezultat;
                najbojljeRangiraniStudent = imeStudenta;
            }
        }
        System.out.println("Najbolje rangirani student sa rezultatom " + najboljiRezultat + " je " + najbojljeRangiraniStudent);
    }
}
