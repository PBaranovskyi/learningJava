package andriiarzhanov.module5;

import java.util.Arrays;

/**
 * Created by arzhanov on 25.04.17.
 */
public class LabWork_1_6_1 {
    public static void main(String[] args) {
        int end = 30;
        int[] evenNumbersArray = new int[end / 2];
        for (int i = 0; i < evenNumbersArray.length; i++) {
            evenNumbersArray[i] = (i + 1) * 2;
        }

        System.out.println(Arrays.toString(evenNumbersArray));

    }
}
