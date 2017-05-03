package com.ksttlearning.lesson6;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

/**
 * Created by citsym on 03.05.17.
 */
public class UseUtils {


    public static void main(String[] args) {

        int[] array = new int[20];

//        for (int i = 0; i < array.length; i++) {
//
//            array[i] = randomInt1(10, 30);
//        }

        for (int i = 0; i < array.length; i++) {

            array[i] = randomInt2(0, 200);
        }


        double[] doubles = new double[10];

        for (int i = 0; i < doubles.length; i++) {

            doubles[i] = (int) (randomDouble(10, 30) * 100) / 100.0;

            doubles[i] = new BigDecimal(randomDouble(10, 30)).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(doubles));


        for (int i = 0; i < 5; i++) {
            System.out.printf(" %-8s ", "Column " + i);
        }

        System.out.printf("%n");


        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//            if (i % 5 == 0){
//                System.out.println();
//            }
            System.out.printf(" %-8d ", array[i]);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }



        for (int i = 0; i < doubles.length; i++) {
//            System.out.print(array[i] + " ");
//            if (i % 5 == 0){
//                System.out.println();
//            }
            System.out.printf(Locale.ENGLISH," %-8.1f ", doubles[i]);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }

    }

    private static double randomDouble(int minBound, int maxBound) {
        double randInt = randomInt1(minBound, maxBound) + Math.random() - 1;

        return randInt;
    }

    private static int randomInt1(int minBound, int maxBound) {
        int random = minBound + (int) (Math.random() * (maxBound - minBound));
        return random;
    }

    private static int randomInt2(int minBound, int maxBound) {
        Random random = new Random();
        int randInt = minBound + random.nextInt(maxBound - minBound);
        return randInt;
    }
}
