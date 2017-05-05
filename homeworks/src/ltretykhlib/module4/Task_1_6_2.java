package ltretykhlib.module4;

/**
 * Created by Tretykhlib on 02.05.2017.
 */
public class Task_1_6_2 {
    public static void main(String[] args) {
        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        double average;
        double sum = 0;
        double minimum = m[0];
        double maximum = 0;

        for (int i = 0; i < m.length; i++) {
            sum = sum + m[i];
            if (m[i] > maximum) {
                maximum = m[i];
            } else if (m[i] < minimum) {
                minimum = m[i];
            }
        }

        average = sum / m.length;
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }

}
