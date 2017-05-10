package kpobozhny.homework.labwork_1_6;

/**
 * Created by kostya on 4/29/17.
 */

/*Task:
        There are statistics for the year by months as an array:
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        Write code which calculates the maximum value from the array, the minimum value and the average.*/

public class labwork_1_6_2 {

    static int getArrayMax(int[] array) {

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int getArrayMin(int[] array) {

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static int getArrayAvg(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        int[] array = {10, 90, 20, -20};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Max: " + getArrayMax(array));
        System.out.println("Min: " + getArrayMin(array));
        System.out.println("Avg: " + getArrayAvg(array));
    }

}
