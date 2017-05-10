package kpobozhny.hackerrank.Day09;

import java.util.Scanner;

/**
 * Created by kostya on 4/23/17.
 */
public class Solution {

    static int factorial(int n) {

        return n == 1 ? 1 : n * factorial(--n);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }
}
