package Metode;

public class KnjigaZadatak_06_20 {
    public static int countLetters(String s) {
        int brojSlova = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                brojSlova++;
            }
        }

        return brojSlova;
    }
}

