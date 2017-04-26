package ua.kstt.justymenko.module03;

import java.util.Scanner;

/**
 * Created by n1kropol on 4/11/17.
 */
public class LW_157_PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int sum = 0;

        for (int perfectNumber = 6; perfectNumber <= userInput; perfectNumber++) {

            for (int i = 1; i < perfectNumber; i++) {
                if (perfectNumber % i == 0)
                    sum += i;
            }
            if (sum == perfectNumber)
                System.out.println(perfectNumber + " is perfect");
            sum = 0;
        }
        scanner.close();
    }
}
