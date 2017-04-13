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
                    System.out.println(number);
                    System.out.println("Enter number x: ");
                    break;
                case 2:
                    number = "Two";
                    System.out.println(number);
                    System.out.println("Enter number x: ");
                    break;
                case 3:
                    number = "Three";
                    System.out.println(number);
                    System.out.println("Enter number x: ");
                    break;
                case 4:
                    number = "Four";
                    System.out.println(number);
                    System.out.println("Enter number x: ");
                    break;
                case 5:
                    number = "Five";
                    System.out.println(number);
                    System.out.println("Enter number x: ");
                    break;
                case 6:
                    number = "Six";
                    System.out.println(number);
                    System.out.println("Enter number x: ");
                    break;
                case 7:
                    number = "Seven";
                    System.out.println(number);
                    System.out.println("Enter number x: ");
                    break;
                case 8:
                    number = "Eight";
                    System.out.println(number);
                    System.out.println("Enter number x: ");
                    break;
                case 9:
                    number = "Nine";
                    System.out.println(number);
                    System.out.println("Enter number x: ");
                    break;
                default:
                    number = "Other";
                    System.out.println(number);
                    System.out.println("Enter number x: ");
                    break;

            }
        }

    }
}
