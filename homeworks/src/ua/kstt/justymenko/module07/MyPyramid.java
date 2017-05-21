package ua.kstt.justymenko.module07;

import java.util.Scanner;

/**
 * Created by n1kropol on 5/21/17.
 */
public class MyPyramid {
    public static void printPyramid(int h){
        if (h > 1 && h < 9) {
            for (int i = 1; i <= h; i++) {
                for (int j = i; j <= h; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j < i; j++) {
                    System.out.print(j);
                }
                System.out.print(i);
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Height should be between 1 to 9, please try again");
        }
    }

    public static void main(String[] args) {
        System.out.print("Please enter number between 1 to 9: ");
        Scanner scanner = new Scanner(System.in);
        printPyramid(scanner.nextInt());
    }
}
