package Metode;

public class Predavanje_04 {
    public static int sumDigits(long n){
long suma = 0;
        while (n != 0){
long posljednjaCifra = n % 10;
suma = suma + posljednjaCifra;
n = n / 10;




        }
        return (int) suma;
    }
}
