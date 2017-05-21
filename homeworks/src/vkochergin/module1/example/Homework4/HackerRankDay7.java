package vkochergin.module1.example.Homework4;

import java.util.Scanner;

/**
 * Created by Volodymyr Kochergin on 19.04.2017.
 */
public class HackerRankDay7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = in.nextInt();

        }

        String result = "";

        for (int i = arr.length - 1; i >= 0; i--) {

            result = result + arr[i] + " ";

        }

        System.out.println(result);
        in.close();
    }
}
