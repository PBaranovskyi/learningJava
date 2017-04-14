package kpobozhny.hackerrank;

import java.util.Scanner;

/**
 * Created by kostya on 4/12/17.
 */
public class Day01 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i02;
        double d02;
        String s02;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        //System.out.println("Enter integer: ");
        i02=scan.nextInt();
        //System.out.println("Enter double: ");
        d02=scan.nextDouble();
        //System.out.println("Enter String: ");
        scan.nextLine();
        s02=scan.nextLine();


        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+i02);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d+d02);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s+s02);

        scan.close();
    }
}
