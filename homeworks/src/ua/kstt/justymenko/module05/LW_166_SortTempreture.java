package ua.kstt.justymenko.module05;

import java.util.Arrays;

/**
 * Created by n1kropol on 4/25/17.
 */
public class LW_166_SortTempreture {
    public static void main(String[] args) {
        double[] temperatureArray = {-3.5, -3, 1.8, 9.3, 15.5, 18.5, 20.5, 19.7, 14.2, 8.4, 1.9, -2.3};
        Arrays.sort(temperatureArray);
        System.out.println(Arrays.toString(temperatureArray));
    }
}
