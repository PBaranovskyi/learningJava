package vkochergin.module1.example.homework7.hackerrankday14;

import java.util.Scanner;

/**
 * Created by Volodymyr Kochergin on 28.04.2017.
 */
public class DifferenceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
