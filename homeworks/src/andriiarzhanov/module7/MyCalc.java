package andriiarzhanov.module7;

import java.util.Scanner;

/**
 * Created by arzhanov on 23.05.17.
 */
public class MyCalc {
    public static double calcPi(int n) {
        double PI = n;
        double div = n - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                PI = PI - ((double) n / div);
            } else {
                PI = PI + ((double) n / div);
            }
            div += 2;
        }

        return PI;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int limit = 0;


        System.out.println("Please enter number from 1 to 100(it can be double)");
        limit = scan.nextInt();
        System.out.println(calcPi(limit));
    }
}
