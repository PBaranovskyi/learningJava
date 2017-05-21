package alexandermelnychuk.homework4;

/*Task:
        Given an integer, n, print its first 10 multiples. Each multiple n x i (where 1 ≤ i ≤ 10) should be printed on a
        new line in the form: n x i = result.*/

import java.util.Scanner;

public class HackerRankDay5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d %c %2d %c %d %n", n, 'x', i, '=', n * i);
        }
    }
}