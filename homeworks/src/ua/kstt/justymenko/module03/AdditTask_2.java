package ua.kstt.justymenko.module03;

import java.util.Scanner;

/**
 * Created by n1kropol on 4/12/17.
 */
public class AdditTask_2 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";



        Scanner scan = new Scanner(System.in);
                    /* Declare second integer, double, and String variables. */
        int intValue;
        double doubleValue;
        String stringValue;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        intValue = scan.nextInt();
        doubleValue = scan.nextDouble();
        scan.nextLine();
        stringValue = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + intValue);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + doubleValue);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + stringValue);


        scan.close();
    }
}
