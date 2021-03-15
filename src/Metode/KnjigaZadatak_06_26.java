package Metode;

public class KnjigaZadatak_06_26 {

    public static boolean palindrom(int broj) {
        int sacuvaniOrginal=broj;
        int posljednjaCifra = 0;
        String palindrom = "";
        while (broj != 0) {
            posljednjaCifra = broj % 10;
            palindrom += posljednjaCifra;
            broj = broj / 10;
        }
        System.out.println(palindrom);
        String orginal = String.valueOf(sacuvaniOrginal);
        return palindrom.equals(orginal);
    }

    public static boolean palindromicPrime(int broj) {
        for (int i = 2; i < broj; i++) {
            if (broj % i == 0) {
                return false;
            }

            }
        return true;
    }
}
