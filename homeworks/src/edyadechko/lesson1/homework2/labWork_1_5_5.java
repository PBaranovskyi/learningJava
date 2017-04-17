package edyadechko.lesson1.homework2;

import java.util.Scanner;

/**
 * Created by Evgeny on 17.04.2017.
 */
public class labWork_1_5_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some integer number: ");
        int n = scanner.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The Sum is: " + sum);
        System.out.println("The Avg is: " + (double) sum/n);
    }
}
