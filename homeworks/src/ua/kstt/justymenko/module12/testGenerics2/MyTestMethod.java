package ua.kstt.justymenko.module12.testGenerics2;

/**
 * Created by n1kropol on 7/4/17.
 */
public class MyTestMethod {

    public static <T extends Number & Comparable<T>> int calcNum (T[] myArray, T maxElem){
        int count = 0;
        for (T t : myArray) {
            if (t.compareTo(maxElem) > 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] arr =  {1,2,3,4,5,6,7,8,9};
        Double[] arr2 = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        System.out.println(calcNum(arr, 5));
        System.out.println(calcNum(arr2, -1.0));
    }
}
