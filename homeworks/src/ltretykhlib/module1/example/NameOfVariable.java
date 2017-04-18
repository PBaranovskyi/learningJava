package ltretykhlib.module1.example;

import java.util.Scanner;

/**
 * Created by Tretykhlib on 11.04.2017.
 */
public class NameOfVariable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month;
        String number;
        System.out.println("Enter number x: ");
        while (scan.hasNextInt()) {
            switch (month = scan.nextInt()) {
                case 1:
                    number = "One";
                    break;
                case 2:
                    number = "Two";
                    break;
                case 3:
                    number = "Three";
                    System.out.println(number);
                    break;
                case 4:
                    number = "Four";
                    break;
                case 5:
                    number = "Five";
                    break;
                case 6:
                    number = "Six";
                    break;
                case 7:
                    number = "Seven";
                    break;
                case 8:
                    number = "Eight";
                    break;
                case 9:
                    number = "Nine";
                    break;
                default:
                    number = "Other";
                    break;

            }
            System.out.println(number);
            System.out.println("Enter number x: ");
        }

    }
}
