package vkochergin.module1.example.homework5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Volodymyr Kochergin on 21.04.2017.
 */
public class HackerRankDay10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String binaryString = Integer.toBinaryString(n);


        int max = 1;
        int temp = 1;

        for (int i = 0; i < binaryString.length() - 1; i++) {
            if (binaryString.charAt(i) == '1' && binaryString.charAt(i + 1) == '1') {
                temp++;
                if (temp > max) {
                    max = temp;
                }
            } else {
                temp = 1;
            }
        }

        System.out.println(max);


    }
}
