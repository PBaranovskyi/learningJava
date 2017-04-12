package ltretykhlib.module1.example;

import java.util.Scanner;

/**
 * Created by Tretykhlib on 12.04.2017.
 */
public class Hackerrank3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        double tipPercent = scan.nextInt(); // tip percentage
        double taxPercent = scan.nextInt(); // tax percentage
        scan.close();


        double tips=mealCost*(tipPercent/100);
        System.out.println(tips);
        double tax=mealCost*(taxPercent/100);
        System.out.println(tax);
        double totalCost=mealCost+tips+tax;

        int totalCostRounded = (int) Math.round(totalCost);
        System.out.println("The total meal cost is "+ totalCostRounded+" dollars.");

        // Write your calculation code here.

        // cast the result of the rounding operation to an int and save it as totalCost
       // int totalCost = (int) Math.round(/*numberToRoundHere*/);

        // Print your result
    }
}
