package kpobozhny.homework.labwork_1_5;

import java.util.Scanner;

/**
 * Created by kostya on 4/12/17.
 */

/*Task:
        Write a program that calculates and displays the sum of squares of digits of number*/

public class labwork_1_5_6 {

    public static void main(String[] args) {
        int n, sum = 0;
        String inputString;
        boolean enteredCorrectValue = false;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter number n: ");
            inputString = scan.nextLine();

            try {
                n = Integer.parseInt(inputString);
                n = Math.abs(n);

                // calculate SUM
                for (int i = 0; i < inputString.length(); i++) {
                    sum += Math.pow(Character.getNumericValue(inputString.charAt(i)), 2);
                }

                // print result
                System.out.println("The Sum is:" + sum);

                // set exit condition
                enteredCorrectValue = true;

            } catch (NumberFormatException e) {
                System.out.println("Invalid value. Try again.");
            }

        } while (!enteredCorrectValue);

        scan.close();
    }
}


