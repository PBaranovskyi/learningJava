package oleksanderkrasilnikov.hakerrank;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int sizeOfArray = in.nextInt();
        in.nextLine();
        String[] inputArray = new String[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            inputArray[i] = in.nextLine();
        }
        for (int i = 0; i < inputArray.length; i++) {
            String[] tempArray = inputArray[i].split("");
            String even = "";
            String odd = "";
            for (int k = 0; k < tempArray.length; k++) {
                if (k % 2 == 0) {
                    even = even + tempArray[k];
                } else {
                    odd = odd + tempArray[k];
                }
            }
            System.out.println(odd + " " + even);
        }
    }
}
