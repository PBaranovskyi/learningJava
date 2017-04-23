package ua.kstt.justymenko.module04;

import java.util.Scanner;

/**
 * Created by n1kropol on 4/22/17.
 */
public class Solution {

    public static int factorial(int num){
        if (num > 1)
            return num * factorial(num - 1);
        else
            return num;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int scannerNumber = in.nextInt();
        int result = Solution.factorial(scannerNumber);
        System.out.println(result);

    }
}
