package ua.kstt.justymenko.module03;

import java.util.Scanner;

/**
 * Created by n1kropol on 4/11/17.
 */
public class LW_156_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        scanner.close();

        int result = 0;
        for (int i = 0; i <= num.length()-1; i++){
            char letter = num.charAt(i);
            int square = Integer.parseInt(String.valueOf(letter)) * Integer.parseInt(String.valueOf(letter));
            result += square;
        }

        System.out.println(result);

    }
}
