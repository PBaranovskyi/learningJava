package ua.kstt.justymenko.module03;

import java.util.Scanner;

/**
 * Created by n1kropol on 4/11/17.
 */
public class LW_156_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= num; i++)
            result += i * i;
        System.out.println(result);
        scanner.close();
    }
}
