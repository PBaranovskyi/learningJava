package ilyarogachov.homework5.home55;

/**
 * Created by rogachev on 23.05.17.
 */
public class MyCalc {


    public static void pin(int n) {

        while (n < 1) {
            System.out.println("Error: Enter a positive integer: ");
            break;
            }
        double pi=0;
        for (int count = 1; count <= n; count++) {
            if (count == 1) {
                pi = 4;
            } else if (count % 2 == 1) {
                pi = pi + (4 / ((2 * (double) count) - 1));
            } else {
                pi = pi - (4 / ((2 * (double) count) - 1));
            }

        }
        System.out.println(pi);


    }
}
