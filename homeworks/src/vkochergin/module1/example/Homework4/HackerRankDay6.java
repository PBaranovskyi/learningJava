package vkochergin.module1.example.Homework4;

import java.util.Scanner;

/**
 * Created by Volodymyr Kochergin on 19.04.2017.
 */
public class HackerRankDay6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0) {

            String s = scanner.next();

            for (int i = 0; i < s.length(); i++) {

                if (i % 2 == 0) {

                    System.out.print(s.charAt(i));
                }
            }

            System.out.print(" ");

            for (int i = 0; i < s.length(); i++) {

                if (i % 2 == 1) {

                    System.out.print(s.charAt(i));
                }
            }

            t -= 1;

            System.out.println();
        }
    }
}
