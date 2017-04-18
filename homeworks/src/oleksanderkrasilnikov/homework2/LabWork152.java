package oleksanderkrasilnikov.homework2;

import java.util.Scanner;

public class LabWork152 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number x = ");
        int x = scan.nextInt();

        if (x == 1) {
            System.out.println("One");
        } else if (x == 2) {
            System.out.println("Two");
        } else if (x == 3) {
            System.out.println("Three");
        } else if (x == 4) {
            System.out.println("Four");
        } else if (x == 5) {
            System.out.println("Five");
        } else if (x == 6) {
            System.out.println("Six");
        } else if (x == 7) {
            System.out.println("Seven");
        } else if (x == 8) {
            System.out.println("Eight");
        } else if (x == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Other");
        }
    }
}
