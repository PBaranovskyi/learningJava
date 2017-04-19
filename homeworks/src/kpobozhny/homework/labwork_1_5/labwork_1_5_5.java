package kpobozhny.homework.labwork_1_5;

import java.util.Scanner;

/**
 * Created by kostya on 4/12/17.
 */

/*Task:
    Write a program to produce the sum of 1, 2, 3, ..., to an upper bound - n.
        Also compute and display the average.
        The output shall look like: The Sum is: 100 The Avg is: 10*/

public class labwork_1_5_5 {

    public static void main(String[] args) {
        int n, sum = 0;
        double avg;
        String inputString;
        boolean enteredCorrectValue = false;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter number n: ");
            inputString = scan.nextLine();

            try {
                n = Integer.parseInt(inputString);

                // calculate SUM
                for (int i = 0; i < n; i++) {
                    sum += i;
                }

                // calculate AVG
                avg = (double) sum / n;

                // print result
                System.out.println("The Sum is:" + sum);
                System.out.println("The Avg is:" + avg);

                // set exit condition
                enteredCorrectValue = true;

            } catch (NumberFormatException e) {
                System.out.println("Invalid value. Try again.");
            }

        } while (!enteredCorrectValue);

        scan.close();
    }
}
