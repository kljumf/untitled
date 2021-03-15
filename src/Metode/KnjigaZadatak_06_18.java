package Metode;

public class KnjigaZadatak_06_18 {
    public static boolean isValidPassword(String password) {
        if (password.length() < 9) {
            System.out.println("Lozinka mora imati najmanje 8 znakova.");
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                System.out.println("Lozinka može sadržavati samo slova i brojeve.");
                return false;
            }
        }
        int brojac = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                brojac++;
            }
        }
        if (brojac < 2) {
            System.out.println("Lozinka mora imati najmanje dva broja. ");
            return false;
        }
        return true;
    }
}



