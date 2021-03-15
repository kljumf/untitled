package lekcija_5;

public class vjezzba_07 {
    public static void main(String[] args) {
        double skolarina = 10000;
        final double rastSkolarine = 1.05;
        int brojGodina = 0;
        double visinaSkoalarine = 0;

        for (brojGodina = 1; brojGodina < 15; brojGodina++) {
            skolarina *= rastSkolarine;

            if (brojGodina == 10) {
                System.out.println(skolarina);
            }
            if (brojGodina > 10) {
                visinaSkoalarine += skolarina;

            }

        }
        System.out.println(visinaSkoalarine);
    }

}
