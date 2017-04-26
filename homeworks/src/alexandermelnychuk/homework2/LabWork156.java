package alexandermelnychuk.homework2;

//Task: Write a program that calculates and displays the sum of squares of digits of number

import java.util.Scanner;

public class LabWork156 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt(), sumSquare = 1;

        for (int i = 2; i <= number; i++) {
            sumSquare += i * i;
        }

        System.out.println(sumSquare);
        scan.close();
    }
}
