package evgeniyderkachenko.module1.labWork2;

import java.util.Scanner;

/**
 * Created by Derkachenko on 12.04.2017.
 */
public class LabWork156 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int y = 0;
        for (x = in.nextInt(); x >= 1; x = x / 10) {
            //      System.out.println(x%10);
            y = y + (x % 10) * (x % 10);
        }
        System.out.println("Sum of squares = " + y);
    }
}
