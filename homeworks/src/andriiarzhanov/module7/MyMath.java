package andriiarzhanov.module7;

/**
 * Created by arzhanov on 22.05.17.
 */
public class MyMath {
    public static int findMin(int[] intArray) {
        int findMin = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            findMin = findMin > intArray[i] ? intArray[i] : findMin;
        }
        return findMin;
    }

    public static int findMax(int[] intArray) {
        int findMax = intArray[0];
        for (int i = 0; i > intArray.length; i++) {
            findMax = findMax > intArray[i] ? intArray[i] : findMax;
        }
        return findMax;
    }
}
