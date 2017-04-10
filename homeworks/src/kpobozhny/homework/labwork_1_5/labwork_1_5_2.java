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
        boolean enteredCorrectValue=false;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Enter number x: ");
            inputString = scan.nextLine();

            try {
                x = Integer.parseInt(inputString);
                switch (x){
                    case 1: System.out.println("One");break;
                    case 2: System.out.println("Two");break;
                    case 3: System.out.println("Three");break;
                    case 4: System.out.println("Four");break;
                    case 5: System.out.println("Five");break;
                    case 6: System.out.println("Six");break;
                    case 7: System.out.println("Seven");break;
                    case 8: System.out.println("Eight");break;
                    case 9: System.out.println("Nine");break;
                    default: if(x>9){System.out.println("Other"); }
                    //it was not described in the task what should be done if we have a negative number (x<1), so let's do nothing.
                }

                enteredCorrectValue=true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid value. Try again.");
            }

        }while(!enteredCorrectValue);

        scan.close();
    }
}
