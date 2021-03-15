package nizovi;

import java.util.Scanner;

public class Zadatak_01 {
    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);

        int[] nizPodataka = new int[10];
        double sumaUnesenihBrojeva = 0;
        int brojacOcjenaIznadProsjeka = 0;
        for (int i = 0; i < nizPodataka.length; i++) {
            System.out.println("Unesite broj na poziciju " + i);
            nizPodataka[i] = unos.nextInt();
            sumaUnesenihBrojeva += nizPodataka[i];
        }
        double prosjek = sumaUnesenihBrojeva / nizPodataka.length;
        for (int i = 0; i < nizPodataka.length; i++){

            if (prosjek < nizPodataka[i]){
            brojacOcjenaIznadProsjeka++;
            }
        }
        }

}
