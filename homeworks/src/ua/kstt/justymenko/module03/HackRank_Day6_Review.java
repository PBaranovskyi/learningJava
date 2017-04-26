package ua.kstt.justymenko.module03;

import java.util.Scanner;

/**
 * Created by n1kropol on 4/16/17.
 */
public class HackRank_Day6_Review {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] wordsMass = new String[n];
        for (int i = 0; i < n; i++) {
            wordsMass[i] = in.nextLine();
        }

        for (String word : wordsMass) {
            for (int j = 0; j < word.length(); j++) {
                if (j % 2 == 0)
                    System.out.print(word.charAt(j));
            }
            System.out.print (" ");

            for (int i = 0; i < word.length(); i++) {
                if (i % 2 != 0)
                    System.out.print(word.charAt(i));
            }
            System.out.println();
        }
    }
}
