package evgeniyderkachenko.module1.labWork2;

import java.util.Scanner;

/**
 * Created by Derkachenko on 12.04.2017.
 */
public class LabWork157 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b = 1;
        int c = in.nextInt();
        int calc_sum = 0;
        int all_range = 0;


        for (all_range = 1; all_range <= c; all_range++) {
            calc_sum = 0;
            for (a = 1; a <= all_range; a++) {
                b = all_range % a;

                if (b == 0) {
                    calc_sum = calc_sum + a;
                }
            }
            if (calc_sum - a + 1 == all_range) {
                System.out.println(all_range);
            }
        }
    }
}
