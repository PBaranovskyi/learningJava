package alexandermelnychuk.homework2;

/*Task:
        1. Write a program which prompts user for the number "x", reads it from the keyboard, and saves it in an int variable called "x".
        2. Then prints "One", "Two",... , "Nine" if the variable "x" is 1, 2,... , 9 and "Other" if x >9, respectively.
        3. Use: (a) a "nested-if" statement; (b) a "switch-case" statement.
        4. The output shall look like (user input – in green): -Enter number x: 1 -Enter number x: 12 -One - Other*/

import java.util.Scanner;

public class LabWork152 {
    public static void main(String[] args) {
        int x;
        String str = null;

        System.out.print("Enter number x: ");

        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        scan.close();

        if (x <= 9) {
            switch (x) {
                case 1:
                    str = "One";
                    break;
                case 2:
                    str = "Two";
                    break;
                case 3:
                    str = "Three";
                    break;
                case 4:
                    str = "Four";
                    break;
                case 5:
                    str = "Five";
                    break;
                case 6:
                    str = "Six";
                    break;
                case 7:
                    str = "Seven";
                    break;
                case 8:
                    str = "Eight";
                    break;
                case 9:
                    str = "Nine";
                    break;
                default:
                    str = "I don't know - \"What if x <=0?\"";
                    break;
            }
        } else str = "Other";

        System.out.println(str);
    }
}
