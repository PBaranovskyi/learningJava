package ilyarogachov.homework3converter;

/**
 * Created by Tom on 25.04.2017.
 */
public class Mainmeth {
    public static void main(String[] args) {
        Calculate c = new Calculate();
        double usd = c.hrivnausd("Hrivna", 5400.0);
        System.out.println("Summa USD = " + usd);
    }


}
