package andriiarzhanov.module5;

import java.util.Arrays;

/**
 * Created by arzhanov on 25.04.17.
 */
public class LabWork_1_6_6 {
    public static void main(String[] args) {
        double[] temperature = new double[]{-2.9, -0.7, 5.8, 14.3, 22.3, 25.2, 27.9, 26.9, 20.5, 11.5, 5.6, 0.0};
        for (int i = 0; i < temperature.length; i++) {
            for (int j = i + 1; j < temperature.length; j++)
                if (temperature[j] < temperature[i]) {
                    double temp = temperature[i];
                    temperature[i] = temperature[j];
                    temperature[j] = temp;
                }
        }
        System.out.println(Arrays.toString(temperature));
    }

}

