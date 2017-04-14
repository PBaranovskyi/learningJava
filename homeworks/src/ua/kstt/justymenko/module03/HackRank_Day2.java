package ua.kstt.justymenko.module03;

import java.util.Scanner;

/**
 * Created by Ustymenko on 04/14/17.
 * in HackerRank class calls Arithmetic
 */
public class HackRank_Day2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.

        // cast the result of the rounding operation to an int and save it as totalCost
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
        int totalCost = (int) Math.round(mealCost + tip + tax);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
