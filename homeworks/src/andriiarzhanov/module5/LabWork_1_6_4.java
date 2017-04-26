package andriiarzhanov.module5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by arzhanov on 25.04.17.
 */
public class LabWork_1_6_4 {
    public static void main(String[] args) {
        int[] intArray = new int[30];

        Random random = new Random();

        for (int i = 0; i < intArray.length; i++) {

            intArray[i] = random.nextInt(100) + 1;
        }
        Arrays.sort(intArray);
        System.out.println("Array: " + Arrays.toString(intArray));

        Scanner scan = new Scanner(System.in);
        int search = 0;


        System.out.println("Please enter number from 1 to 100");
        search = scan.nextInt();

        int start = 0, end = intArray.length - 1, middle = (start + end) / 2;

        while (start <= end) {
            if (intArray[middle] < search)
                start = middle + 1;
            else if (intArray[middle] == search) {
                System.out.println(search + " found at location " + (middle + 1));
                break;
            } else {
                end = middle - 1;
            }

            middle = (start + end) / 2;
        }
        if (start > end) {
            System.out.println(search + " is not present in the list");
        }
    }
}
