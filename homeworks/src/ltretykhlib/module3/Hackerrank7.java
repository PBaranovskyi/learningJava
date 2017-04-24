package ltretykhlib.module3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Tretykhlib on 19.04.2017.
 */
public class Hackerrank7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            System.out.println(arr[i]);
        }

        in.close();
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;

        }
        // Arrays.stream(arr).forEach(System.out::print);
        //System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        for (int el : arr) {
            System.out.println("__________" + el);
        }
    }
}

