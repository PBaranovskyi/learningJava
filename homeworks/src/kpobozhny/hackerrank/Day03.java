package kpobozhny.hackerrank;

import java.util.Scanner;

/**
 * Created by kostya on 4/17/17.
 */

/*Task
        Given an integer, , perform the following conditional actions:

        If is odd, print Weird
        If is even and in the inclusive range of 2 to 5, print Not Weird
        If is even and in the inclusive range of 6 to 20, print Weird
        If is even and greater than 20, print Not Weird

        Constraints: 1<=n<=100
        */

public class Day03 {

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
            if (2 <= n && n <= 5) {
                ans = "Not Weird";
            } else if (6 <= n && n <= 20) {
                ans = "Weird";
            } else ans = "Not Weird";
        }
        System.out.println(ans);
    }
}
