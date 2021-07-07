package vkochergin.module1.example.homework6;

/**
 * Created by Volodymyr Kochergin on 25.04.2017.
 *
 There are statistics for the year by months as an array:
 int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
 Write code which calculates the maximum value from the array, the minimum value and the average.

 */
public class LabWork162 {

    public static void main(String[] args) {
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        int max = m[0];
        int min = m[0];
        int sum = 0;
        double avg = 0.0;

        //finding max in array:
        for (int i = 0; i < m.length; i++) {

            if (m[i] > max){

                max = m[i];

            }

        }

        //finding min in array:
        for (int i = 0; i < m.length; i++) {

            if (m[i] < min){

                min = m[i];

            }

        }

        //finding avg in array:
        for (int i = 0; i < m.length; i++) {
            sum += m[i];
        }
        avg = (double) sum / m.length;

        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
    }

}
