package andriiarzhanov.com.hackerrank.Day9_Recursion;

import java.util.Scanner;

/**
 * Created by arzhanov on 19.04.17.
 */
public class Day9_Recursion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.print(factorial(n));
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
