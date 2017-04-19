package oleksanderkrasilnikov.homework2;

import java.util.Scanner;

public class LabWork156 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();
        int sum = 0;
        while (numb > 0) {
            sum += Math.pow(numb % 10, 2);
            numb /= 10;
        }
        System.out.println("Sum of squares of digits of number: " + sum);
    }
}

