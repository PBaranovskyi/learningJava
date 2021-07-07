package vkochergin.module1.example.homework6;

import java.util.Arrays;

/**
 * Created by Volodymyr Kochergin on 25.04.2017.
 * Write a program that sorts an array of average temperature
 * values by months of 2015  as follows: at first the negative values, then - positive values
 */
public class LabWork166 {
    public static void main(String[] args) {
        double[] temperatureByMonth = {7, 10.5, 17.8, 29.4, 30.5, 28.3, 25.4, 13.4, 8.4, -3, -10, -11.2};

        Arrays.sort(temperatureByMonth);

        System.out.println(Arrays.toString(temperatureByMonth));
    }
}
