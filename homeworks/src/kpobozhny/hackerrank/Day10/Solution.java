package kpobozhny.hackerrank.Day10;

import java.util.Scanner;

/**
 * Created by kostya on 5/2/17.
 */
public class Solution {

    public static void main(String[] args) {
        int n;
        String inputString;
        Scanner scan = new Scanner(System.in);
        inputString = scan.nextLine();

        n = Integer.parseInt(inputString);
        int max = 0, counter = 0;
        String binary = Integer.toBinaryString(n);

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                counter++;
                if (max < counter) {
                    max = counter;
                }
            } else {
                counter = 0;
            }
        }
        //System.out.println(binary);
        System.out.println(max);
        scan.close();
    }
}
