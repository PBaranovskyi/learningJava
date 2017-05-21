package alexandermelnychuk.homework4;

/*Task:
        There are statistics for the year by months as an array:
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        Write code which calculates the maximum value from the array, the minimum
        value and the average.*/

import java.util.Arrays;

public class LabWork162 {
    public static void main(String[] args) {
        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        System.out.println("Maximum value in array = " + sortIntegers(m)[m.length - 1]);
        System.out.println("Minimum value in array = " + sortIntegers(m)[0]);
        System.out.println("Average array value is - " + averageArrayValue(m));
    }

    private static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    private static double averageArrayValue(int[] array) {
        double sum = 0;

        for (int num : array) {
            sum += num;
        }

        return sum / array.length;
    }
}
