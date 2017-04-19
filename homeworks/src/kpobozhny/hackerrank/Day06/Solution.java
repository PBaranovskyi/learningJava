package kpobozhny.hackerrank.Day06;


import java.util.Scanner;

/**
 * Created by kostya on 4/18/17.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            String even = "", odd = "";
            for (int j = 0; j < str.length(); j++) {
                if (j % 2 == 0) {
                    even = even + str.charAt(j);
                } else {
                    odd = odd + str.charAt(j);
                }
            }
            System.out.println(even + " " + odd);
        }
        sc.close();
    }
}
