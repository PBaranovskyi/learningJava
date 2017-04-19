package oleksanderkrasilnikov.hakerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        String[] A = new String[T];
        for (int i = 0; i < T; i++) {
            A[i] = in.nextLine();
        }
        for (int i = 0; i < A.length; i++) {
            String[] B = A[i].split("");
            String even = "";
            String odd = "";
            for (int k = 0; k < B.length; k++) {
                if (k % 2 == 0) {
                    even = even + B[k];
                } else {
                    odd = odd + B[k];
                }
            }
            System.out.println(odd + " " + even);
        }

    }
}
