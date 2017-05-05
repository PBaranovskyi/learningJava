package ua.kstt.justymenko.module03;

import java.util.Scanner;

/**
 * Created by n1kropol on 4/16/17.
 */
public class HackRank_Day5_Loops {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            for (int i = 1; i < 11; i++) {
                System.out.printf("%2d x %-2d = %2d %n", n, i, n * i);
//                System.out.println(n + " x " + i + " = " + n * i);
            }

        }
}
