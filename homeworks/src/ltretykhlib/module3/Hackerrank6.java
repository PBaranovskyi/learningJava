package ltretykhlib.module3;

import java.util.Scanner;

/**
 * Created by Tretykhlib on 19.04.2017.
 */
public class Hackerrank6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <= q; i++) {
            String str = sc.nextLine();
            int t1 = 0, t2 = 0;
            char[] temp = new char[str.length()];
            char[] temp2 = new char[str.length()];
            for (int j = 0; j < str.length(); j++) {
                str.charAt(j);
                if (j % 2 != 0) {
                    temp[t1] = str.charAt(j);
                    t1++;
                } else {
                    temp2[t2] = str.charAt(j);
                    t2++;
                }

            }
            System.out.print(temp);
            System.out.print(" ");
            System.out.print(temp2);

        }
    }
}

