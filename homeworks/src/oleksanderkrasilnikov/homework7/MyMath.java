package oleksanderkrasilnikov.homework7;

import java.util.Arrays;

public class MyMath {

    final static double pi = 3.14;

    public static double areaOfCircle(double radius) {
        return pi * Math.pow(radius, 2);
    }

    public static int findMin(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }

    public static int findMax(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    public static double calcPi(int n) {
        double pi = n;
        int d = n - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                pi = pi - ((double) n / d);
                d += 2;
            } else {
                pi = pi + ((double) n / d);
                d += 2;
            }
        }
        return pi;
    }
}
