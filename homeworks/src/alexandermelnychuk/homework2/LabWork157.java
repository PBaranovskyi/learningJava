package alexandermelnychuk.homework2;

/*Task:
        Write a program that find and displays all perfect numbers from 1 to n (perfect number
        is a positive integer that is equal to the sum of its proper positive divisors, excluding the
        number itself).*/

import java.util.Scanner;

public class LabWork157 {
    public static void main(String[] args) {
        System.out.print("Please enter any number (below or equal to 10,000): ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt(), divSum;
        scan.close();

        for (int i = 1; i <= number && number <= 10000; i++) {
            divSum = 0;
            for (int e = 1; e < i; e++) {
                if (i % e == 0) {
                    divSum += e;
                }
            }
            if (divSum == i) {
                System.out.println(divSum + " - is a perfect number");
            }
        }
    }
}