package ua.kstt.justymenko.module03;

import java.util.Scanner;

/**
 * Created by n1kropol on 4/14/17.
 */
public class HackRank_Day3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = "Weird";
        } else {
            // Complete the code
            if (n >= 2 && n <= 5)
                System.out.println("Not Weird");
            else if (n >= 6 && n <= 20)
                System.out.println("Weird");
            else if (n > 20)
                System.out.println("Not Weird");
        }
        System.out.println(ans);
    }
}
