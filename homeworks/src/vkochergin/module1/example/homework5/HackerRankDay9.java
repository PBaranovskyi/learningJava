package vkochergin.module1.example.homework5;

import java.util.Scanner;

/**
 * Created by Volodymyr Kochergin on 20.04.2017.
 */
public class HackerRankDay9 {

    public static int Factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println(Factorial(input));

    }
}
