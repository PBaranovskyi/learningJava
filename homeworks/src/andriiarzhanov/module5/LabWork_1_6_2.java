package andriiarzhanov.module5;

/**
 * Created by arzhanov on 25.04.17.
 */
public class LabWork_1_6_2 {
    public static void main(String[] args) {
        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};

        int max = 0, min = Integer.MAX_VALUE;
        double avg, sum = -1.;

        for (int i = 0; i < m.length; i++) {
            max = max < m[i] ? m[i] : max;
            min = min > m[i] ? m[i] : min;
            sum += (double) m[i];
        }
        avg = sum / m.length;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);
    }
}
