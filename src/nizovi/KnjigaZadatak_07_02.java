package nizovi;

public class KnjigaZadatak_07_02 {
    public static void main(String[] args) {
        int [] niz = PomocnaKLasa.unesiNiz(10);
        for (int i = niz.length - 1; i >= 0; i--){
            System.out.println(niz[i]);
        }
    }
}
