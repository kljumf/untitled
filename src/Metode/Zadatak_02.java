package Metode;

public class Zadatak_02 {
    public static int sabiranje (int prviBroj, int drugiBroj){
    int sabiranje = prviBroj + drugiBroj;
    return sabiranje;
    }
    public static double sabiranje (double prviBroj, double drugiBroj){
        double sabiranje = prviBroj + drugiBroj;
        return sabiranje;
    }

    public static void main(String[] args) {

        System.out.println(sabiranje(2,4));
        System.out.println(sabiranje(2.0,4.00));

    }
}
