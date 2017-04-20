package ltretykhlib.module3;

import java.util.Scanner;

/**
 * Created by Tretykhlib on 19.04.2017.
 */
public class Hackerrank5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            int mult = n * i;
            System.out.println(n + " x " + i + " = " + mult);
        }

    }
}
