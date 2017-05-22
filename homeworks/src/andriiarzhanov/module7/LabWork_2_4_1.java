package andriiarzhanov.module7;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by arzhanov on 22.05.17.
 */
public class LabWork_2_4_1 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(intArray));
        System.out.println(MyMath.findMin(intArray));
        System.out.println(MyMath.findMax(intArray));
    }
}
