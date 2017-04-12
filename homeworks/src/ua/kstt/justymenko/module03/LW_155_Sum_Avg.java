package ua.kstt.justymenko.module03;

/**
 * Created by n1kropol on 4/11/17.
 */
public class LW_155_Sum_Avg {
    public static void main(String[] args) {
        int num = 42;
        int sum = 0;

        for (int i = 0; i < num; i++) {
            sum += i;
        }
        System.out.println("The Sum is: " + sum);
        double avg = (double) sum / num;
        System.out.println("The Avg: is " + avg);
    }
}
