package vkochergin.module1.example.Homework2;

import java.util.Scanner;

/**
 * Created by Volodymyr Kochergin on 11.04.2017.
 */
public class LabWork157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your positive number, please:");
        int n = scanner.nextInt();

        for (int min = 1; min <= n; min++) {
            int sum = 0;
            for (int e = 1; e < min; e++) {
                if ((min % e) == 0) {
                    sum += e;
                }
            }
            if (sum == min){
                System.out.println(sum);
            }
        }
    }
}
