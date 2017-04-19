package oleksanderkrasilnikov.hakerrank;


import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        double tipPercent = scan.nextDouble(); // tip percentage
        double taxPercent = scan.nextDouble(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double tip = (mealCost / 100) * tipPercent;
        double tax = (mealCost / 100) * taxPercent;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + tax + tip);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
