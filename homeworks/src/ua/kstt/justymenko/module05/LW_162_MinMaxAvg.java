package ua.kstt.justymenko.module05;

import java.util.Arrays;

/**
 * Created by n1kropol on 4/24/17.
 */
public class LW_162_MinMaxAvg {
    public static void main(String[] args) {
        int[] m = new int[] {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int min = Arrays.stream(m).min().getAsInt();
        int max = Arrays.stream(m).max().getAsInt();
        double avg = Arrays.stream(m).average().getAsDouble();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Avg = " + avg);
    }
}
