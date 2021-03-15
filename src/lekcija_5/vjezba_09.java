package lekcija_5;

import java.util.Scanner;

public class vjezba_09 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite broj studenata: ");
        int brojStudenata = unos.nextInt();
        String ime = "";
        String najboljiStudent = "";
        String drugiNajboljiStudent = "";
        double rezultat = 0;
        double najboljiRezultat = 0;
        double drugiRezultat  = 0;
        for (int i = 1; i <= brojStudenata; i++){
            System.out.println("Unesite ime i rezultat: ");
            ime = unos.next();
            rezultat = unos.nextDouble();
            if (i == 1){
                najboljiRezultat = rezultat;
                najboljiStudent = ime;
            }
            else if (i > 1 && rezultat < najboljiRezultat && rezultat > drugiRezultat){
                najboljiRezultat = najboljiRezultat;
                najboljiStudent = najboljiStudent;
                drugiNajboljiStudent = ime;
                drugiRezultat = rezultat;

            }
            else if (i > 1 && rezultat > najboljiRezultat){

                drugiRezultat = najboljiRezultat;
                drugiNajboljiStudent = najboljiStudent;
                najboljiRezultat = rezultat;
                najboljiStudent = ime;

            }
        }
        System.out.println("Najbolji student je sa rezultatom " + najboljiRezultat + " je "
                + najboljiStudent + " drugi najbolji student sa rezultatom " + drugiRezultat + " je " + drugiNajboljiStudent);
    }
}
