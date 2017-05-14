package andriiarzhanov.com.hackerrank.Day6_Lets_Review;

import java.util.Scanner;

/**
 * Created by arzhanov on 19.04.17.
 */
public class Day6_Lets_Review {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        scan.nextInt();

        while (scan.hasNext()) {
            String stringVar;
            String even = "";
            String odd = "";

            stringVar = scan.next();

            char[] charArray = stringVar.toCharArray();
            for (int i = 0; i < stringVar.length(); i++) {
                if (i % 2 == 0) {
                    even = even + charArray[i];
                } else {
                    odd = odd + charArray[i];
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}
