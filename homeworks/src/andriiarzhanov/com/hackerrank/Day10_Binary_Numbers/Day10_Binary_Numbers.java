package andriiarzhanov.com.hackerrank.Day10_Binary_Numbers;

import java.util.Scanner;

/**
 * Created by arzhanov on 19.04.17.
 */
public class Day10_Binary_Numbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String rm = "";
        int count = 0, maxCount = 0;
        while (n > 0) {
            rm = n % 2 + rm;
            if (n % 2 == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > maxCount) {
                maxCount = count;
            }
            n = n / 2;
        }
        System.out.println(maxCount);
    }
}
