package bogdanh.com.kstt.week4;


//Create an array of all the even numbers from 2 to 30 (2,4,6...30) and display elements of the array to the screen.

import java.util.Arrays;

public class Lab161 {

    private static final int MULTIPLIER = 2;

    public static void main(String[] args) {

        int[] ints = new int[16];

        // int[] ints = IntStream.iterate(0, i -> i + 2).limit(16).toArray();
       // Arrays.setAll(ints, i -> i * MULTIPLIER);

        for (int i = 0; i < ints.length; i++) {
            ints[i] = i * MULTIPLIER;
        }

        System.out.println(Arrays.toString(ints));
    }
}
