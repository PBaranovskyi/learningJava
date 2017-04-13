package ltretykhlib.module1.example;

import java.util.*;

/**
 * Created by Tretykhlib on 11.04.2017.
 */
public class Hackerrank2 {
    public static void main(String[] args) {

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);

        int my = scan.nextInt();
        System.out.println(i + my);

        double k = scan.nextDouble();
        System.out.println(d + k);

        String str;
        str = scan.nextLine();
        str = scan.nextLine();
        System.out.println(s.concat(str));

        scan.close();


    }
}

