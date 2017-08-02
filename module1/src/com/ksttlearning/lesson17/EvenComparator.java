package com.ksttlearning.lesson17;

import java.util.Comparator;

/**
 * Created by citsym on 24.07.17.
 */
public class EvenComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {

        if (o1 % 2 == 1 && o2 % 2 == 0) {
            return 1;
        }

        return -1;
    }
}
