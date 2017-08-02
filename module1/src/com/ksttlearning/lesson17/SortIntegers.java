package com.ksttlearning.lesson17;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by citsym on 24.07.17.
 */
public class SortIntegers {




    public static void main(String[] args) {

        Integer[] array = new Integer[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(array));

        Comparator<Integer> integerComparator = (o1, o2) -> {
            if (o1 % 2 == 1 && o2 % 2 == 0) {
                return 1;
            }

            return -1;
        };


        Arrays.sort(array, integerComparator);

        System.out.println(Arrays.toString(array));

    }




}
