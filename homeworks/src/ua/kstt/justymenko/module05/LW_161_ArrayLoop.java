package ua.kstt.justymenko.module05;

/**
 * Created by n1kropol on 4/24/17.
 */
public class LW_161_ArrayLoop {
    public static void main(String[] args) {
        int[] arr = new int[15];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            counter += 2;
            arr[i] = counter;
            System.out.print(arr[i] + " ");
        }
    }
}
