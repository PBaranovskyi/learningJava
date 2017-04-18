package kpobozhny.homework.labwork_1_5;

import java.util.Scanner;

/**
 * Created by kostya on 4/11/17.
 */

/* Task:
        1. Write a program which prompts user for the number "x", reads it from the keyboard,
                and saves it in an int variable called "x".
        2. Then prints "One", "Two",... , "Nine" if the variable "x" is 1, 2,... , 9 and "Other" if x >9, respectively.
        3. Use: (a) a "nested-if" statement; (b) a "switch-case" statement.
        4. The output shall look like (user input – in green): -Enter number x: 1    -Enter number x: 12
                                                               -One                  - Other*/

public class labwork_1_5_2 {

    public static void main(String[] args) {

        int x;
        String inputString;
        boolean enteredCorrectValue = false;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter number x: ");
            inputString = scan.nextLine();

            try {
                x = Integer.parseInt(inputString);
                String strNumber = "";
                switch (x) {
                    case 1:
                        strNumber = "One";
                        break;
                    case 2:
                        strNumber = "Two";
                        break;
                    case 3:
                        strNumber = "Three";
                        break;
                    case 4:
                        strNumber = "Four";
                        break;
                    case 5:
                        strNumber = "Five";
                        break;
                    case 6:
                        strNumber = "Six";
                        break;
                    case 7:
                        strNumber = "Seven";
                        break;
                    case 8:
                        strNumber = "Eight";
                        break;
                    case 9:
                        strNumber = "Nine";
                        break;
                    default:
                        if (x > 9) {
                            strNumber = "Other";
                        }
                        //it was not described in the task what should be done if we have a negative number (x<1), so let's do nothing.
                }
                System.out.println(strNumber);
                // set exit condition
                enteredCorrectValue = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid value. Try again.");
            }

        } while (!enteredCorrectValue);

        scan.close();
    }
}
