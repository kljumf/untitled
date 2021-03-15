package Metode;

public class KnjigaZadatak_06_23 {
    public static int count(String str, char a) {
        int brojKaraktera = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.valueOf(str.charAt(i)) == a) {
                brojKaraktera++;
            }
        }
        return brojKaraktera;
    }
}
