package kpobozhny.hackerrank.Day05;

import java.util.Scanner;

/**
 * Created by kostya on 4/17/17.
 */

/*Task
        Given an integer, n, print its first 10 multiples.
        Each multiple n x i (where 1<=i<=10 ) should be printed on a new line in the form: n x i = result.*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
