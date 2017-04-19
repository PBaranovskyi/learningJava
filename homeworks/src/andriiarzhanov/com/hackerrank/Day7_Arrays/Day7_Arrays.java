package andriiarzhanov.com.hackerrank.Day7_Arrays;

import java.util.Scanner;

/**
 * Created by arzhanov on 19.04.17.
 */
public class Day7_Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        String stringVar = "";
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int k = n - 1; k >= 0; k--) {
            stringVar = stringVar + arr[k] + " ";
        }
        System.out.println(stringVar);
        in.close();
    }
}
