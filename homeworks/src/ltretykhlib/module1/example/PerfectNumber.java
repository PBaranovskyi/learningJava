package ltretykhlib.module1.example;

import java.util.Scanner;

/**
 * Created by Tretykhlib on 11.04.2017.
 */
public class PerfectNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter counter:");
        int j = s.nextInt();

        for (int i = 1; i <= j; i++) {
            int sum = 0;
            int k = 1;
            for (k = 1; k < i; k++) {
                int a = i % k;

                if (a == 0) {
                    sum += k;
                }
            }
            if (sum == i) {
                System.out.println(sum);
            }
        }
    }
}

