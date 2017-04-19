package erik.module4;

import java.util.Scanner;

/**
 * Created by Erik Pavliuk on 18/04/2017.
 */
public class HackerRank01 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
//-------------------------------------------------------
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.nextLine();
        double d1 = Double.valueOf(s1);
        int i1 = Integer.valueOf(s1);
        System.out.println(i + i1);
        System.out.println(d + d1);
        System.out.println(s + s1 + s2);
    }
}