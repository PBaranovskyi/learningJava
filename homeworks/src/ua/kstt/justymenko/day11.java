package ua.kstt.justymenko;

import java.util.Scanner;

/**
 * Created by n1kropol on 5/1/17.
 */
public class day11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int[] result = new int[16];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                result[k] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                            arr[i + 1][j + 1] +
                            arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                k++;
            }
        }

        int max = result[0];
        for (int i = 0; i < result.length; i++) {
            if (result[i] > max)
                max = result[i];
        }
        System.out.println(max);
    }
}
