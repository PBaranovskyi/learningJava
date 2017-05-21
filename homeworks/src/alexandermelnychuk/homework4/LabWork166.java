package alexandermelnychuk.homework4;

/*Task
        Write a program that sorts an array of average temperature values by months of
        2015  as follows: at first the negative values, then - positive values*/

import java.util.Arrays;

public class LabWork166 {
    public static void main(String[] args) {
        double[] temperature = {-4.6, -3.8, 1.7, 7.8, 13.7, 18.7, 21.1, 20.3, 16.5, 10.4, 4.8, -1.3};
        System.out.println(Arrays.toString(orderTemperature(temperature)));
    }

    private static double[] orderTemperature(double[] array) {
        double[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        double temp;
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
}