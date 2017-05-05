package erik.module4;

import java.util.Scanner;

/**
 * Created by Erik Pavliuk on 19/04/2017.
 */
public class HackerRank02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + (mealCost * tipPercent / 100 + mealCost * taxPercent / 100));
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}