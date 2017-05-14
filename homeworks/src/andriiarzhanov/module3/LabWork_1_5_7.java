package andriiarzhanov.module3;

import java.util.Scanner;

/**
 * Created by arzhanov on 11.04.17.
 */
public class LabWork_1_5_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter upper limit value");
        int end = scan.nextInt();
        for (int i = 1; i <= end; i++) {
            int sum = 0;
            for (int y = 1; y < i; y++) {
                if ((i % y) == 0) {
                    sum += y;
                }
            }
            if (sum == i) {
                System.out.println(sum);
            }
        }
    }

}
