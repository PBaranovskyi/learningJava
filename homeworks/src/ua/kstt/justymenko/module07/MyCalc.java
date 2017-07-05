package ua.kstt.justymenko.module07;

/**
 * Created by n1kropol on 5/21/17.
 */
public class MyCalc {
    public static double calcPi(int n){
        double pi = n;
        int divisor = n - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                pi = pi - ((double) n / divisor);
                divisor += 2;
            } else {
                pi = pi + ((double) n / divisor);
                divisor += 2;
            }
        }
        return pi;
    }

    public static void main(String[] args) {
        System.out.println(calcPi(7));
    }
}
