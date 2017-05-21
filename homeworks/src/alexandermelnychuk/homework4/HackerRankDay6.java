package alexandermelnychuk.homework4;

/*Task:
        Given a string, S, of length N that is indexed from 0 to N - 1, print its even-indexed and odd-indexed characters
        as 2 space-separated strings on a single line (see the Sample below for more detail).*/

import java.util.Scanner;

public class HackerRankDay6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String[] stringList = new String[n];

        for (int i = 0; i < stringList.length; i++) {
            stringList[i] = scan.nextLine();
        }

        scan.close();

        for (String word : stringList) {
            String even = "";
            String odd = "";
            for (int s = 0; s < word.length(); s++) {
                if (s % 2 == 0) {
                    even += word.charAt(s);
                } else if (s % 2 != 0) {
                    odd += word.charAt(s);
                }
            }
            System.out.print(even);
            System.out.print(" ");
            System.out.print(odd + "\n");
        }
    }
}