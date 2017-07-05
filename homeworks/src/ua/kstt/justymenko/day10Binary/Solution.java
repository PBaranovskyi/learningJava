package ua.kstt.justymenko.day10Binary;

import java.util.Scanner;

/**
 * Created by n1kropol on 4/24/17.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String strNumber = Integer.toBinaryString(n);
        in.close();
        int counter = 0;
        int maxOnes = 0;

        for (int i = 0; i < strNumber.length(); i++) {
            if ('1' == strNumber.charAt(i))
                counter++;
            else {
                if (counter > maxOnes)
                    maxOnes = counter;
                counter = 0;
            }
        }
        if ((maxOnes == 0 && counter > 0) || counter > maxOnes)
            System.out.println(counter);
        else
            System.out.println(maxOnes);
    }
}
