package andriiarzhanov.com.hackerrank;

import java.util.Scanner;

/**
 * Created by arzhanov on 11.04.17.
 */
public class Day2_Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double tip = mealCost * ((double)tipPercent / 100);
        double tax = mealCost * ((double)taxPercent / 100);
        double doubleCost = mealCost + tip + tax;
        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(doubleCost);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
