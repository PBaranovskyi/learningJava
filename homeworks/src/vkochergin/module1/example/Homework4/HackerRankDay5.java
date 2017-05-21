package vkochergin.module1.example.Homework4;

import java.util.Scanner;

/**
 * Created by Volodymyr Kochergin on 19.04.2017.
 */
public class HackerRankDay5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= 10; i++) {

            int result = i * n;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
