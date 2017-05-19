package andriiarzhanov.com.hackerrank.Day5_Loops;

import java.util.Scanner;

/**
 * Created by arzhanov on 19.04.17.
 */
public class Day5_Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
