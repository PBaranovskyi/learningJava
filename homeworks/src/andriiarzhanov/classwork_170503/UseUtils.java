package andriiarzhanov.classwork_170503;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

/**
 * Created by arzhanov on 03.05.17.
 */
public class UseUtils {

    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomInt2(20, 200);
        }

        double[] doubleArray = new double[10];

        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = (int) (randomDouble(10, 30) * 100) / 100.;
            doubleArray[i] = new BigDecimal(randomDouble(10, 30)).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();

        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(doubleArray));

        for (int i = 0; i < 5; i++) {
            System.out.printf(" %-8s ", "Column" + i);
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" %-8d ", array[i]);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.printf(Locale.US, " %-8.2f ", doubleArray[i]);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }

    private static double randomDouble(int minBound, int maxBound) {
        double randDouble = randomInt1(minBound, maxBound) + Math.random() - 1;
        return randDouble;
    }


    private static int randomInt2(int minBound, int maxBound) {
        Random random = new Random();
        int randInt = minBound + random.nextInt(maxBound - minBound);
        return randInt;
    }

    private static int randomInt1(int minBound, int maxBound) {
        int randInt = minBound + (int) (Math.random() * (maxBound - minBound));
        return randInt;
    }
}
