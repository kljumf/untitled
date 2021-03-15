package Metode;

public class Predavanja_02 {

    public static int brojDanaUGodini(int godina) {
        if ((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0)) {
            return 366;
        }
        return 365;
    }

}
