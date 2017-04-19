package ltretykhlib.module1.example;

import java.util.Scanner;

/**
 * Created by Tretykhlib on 15.04.2017.
 */
public class Hackerrank4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if (n % 2 == 1 || n % 2 == 0 && n >= 6 && n <= 20) {
            ans = "Weird";
        } else if (n % 2 == 0 && n >= 2 && n <= 5) {
            ans = "Not Weird";

        } else if (n % 2 == 0 && n > 20) {
            ans = "Not Weird";
        }

        // Complete the code

        System.out.println(ans);
    }
}


