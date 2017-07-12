package ua.kstt.justymenko.module12.testGenerics3;

/**
 * Created by n1kropol on 7/9/17.
 */
public class MyTestMethod {
    public static <T extends Number & Comparable<T>> Number calcSum(T[] myArray, T maxElem){
        Double sum = 0.0;
        for (T t : myArray) {
            if (t.compareTo(maxElem) > 0) {
                sum += t.doubleValue();
            }
        }
        return (T) sum;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        Double[] arr2 = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        System.out.println(calcSum(arr, 5));
        System.out.println(calcSum(arr2, 7.7));
    }
}
