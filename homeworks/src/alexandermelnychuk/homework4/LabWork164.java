package alexandermelnychuk.homework4;

/*Task
        Write a program, which uses a binary search in a sorted array of
        integer numbers to find a certain element.*/

import java.util.Arrays;
import java.util.Scanner;

public class LabWork164 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 21, 5, 22, 9, 29, 25, 48, 11, 17, 8, 14};
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.print("Please input any number from array: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();

        boolean condition = false;

        for (int i = 0; i < arr.length && !condition; i++) {
            if (arr[i] == number) {
                int valueIndex = Arrays.binarySearch(arr, number);
                System.out.print("Index of number in array is: " + valueIndex);
                condition = true;
            }
        }

        if (!condition) {
            System.out.println("No such number in array!");
        }
    }
}