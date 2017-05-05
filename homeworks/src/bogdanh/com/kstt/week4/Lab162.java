package bogdanh.com.kstt.week4;

/*
There are statistics for the year by months as an array:
int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
Write code which calculates the maximum value from the array, the minimum value and the average.*/

import java.util.Arrays;

public class Lab162 {

    public static void main(String[] args) {

        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};

        int min = min(m);
        int max = max(m);
        double avg = avg(m);

        System.out.println(Arrays.stream(m).summaryStatistics());
        System.out.println(String.format("min = %d , max = %d , avg = %f", min, max, avg));

    }

    private static int min(int[] m) {
        int min = m[0];

        for (int i = 1; i < m.length; i++) {
            if (min > m[i]) {
                min = m[i];
            }
        }
        return min;
    }

    private static int max(int[] m) {
        int max = m[0];

        for (int i = 1; i < m.length; i++) {
            if (max < m[i]) {
                max = m[i];
            }
        }
        return max;
    }

    private static double avg(int[] m) {

        int count = m.length;
        int sum = 0;

        for (int i : m) {
            sum += i;
        }

        return (double) sum / count;
    }


}
