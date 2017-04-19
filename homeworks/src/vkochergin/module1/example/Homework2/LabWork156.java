package vkochergin.module1.example.Homework2;

import java.util.Scanner;

/**
 * Created by Volodymyr Kochergin on 11.04.2017.
 */
public class LabWork156 {
    public static void main(String[] args) {
        System.out.println("Enter your number, please: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int sum = 0;

        while(number > 0){
            int t = number % 10;
            sum += t * t;
            number = number / 10;
        }

        System.out.println(sum);


    }
}
