package Metode;

public class ValidacijaSifre {

    public static boolean validiraj (String password){
        final int MIN_BROJ_KARAKTERA = 9;
        if (password.length() < MIN_BROJ_KARAKTERA){
            System.out.println("Invalid pass, nema dovoljno karaktera.");
            return false;
        }


        return true;

    }
}
