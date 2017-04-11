package andriiarzhanov.com.hackerrank;

import java.util.Scanner;

/**
 * Created by arzhanov on 11.04.17.
 */
public class Day1_Data_Types {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int intVar;
        double doubleVar;
        String stringVar = "";
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        intVar = scan.nextInt();
        doubleVar = scan.nextDouble();
        while(scan.hasNextLine()) {
            stringVar = stringVar.concat(scan.nextLine());
        }
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + intVar);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + doubleVar);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + stringVar);
        scan.close();
    }
}
