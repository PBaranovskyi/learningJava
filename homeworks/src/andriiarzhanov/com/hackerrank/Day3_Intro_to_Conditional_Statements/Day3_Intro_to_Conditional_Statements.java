package andriiarzhanov.com.hackerrank.Day3_Intro_to_Conditional_Statements;

import java.util.Scanner;

/**
 * Created by arzhanov on 19.04.17.
 */
public class Day3_Intro_to_Conditional_Statements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if (n % 2 == 1) {
            ans = "Weird";
        } else {
            // Complete the code
            if (n >= 2 && n <= 5) {
                ans = "Not Weird";
            } else if (n > 5 && n <= 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
    }

}
