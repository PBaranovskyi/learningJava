package oleksanderkrasilnikov.homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LabWork164 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        Arrays.sort(array);
        Scanner scan = new Scanner(System.in);
        System.out.println("Input element to search: ");
        int searchElement = scan.nextInt();
        int flag = Arrays.binarySearch(array, searchElement);
        if (flag > 0) {
            System.out.println("Index of your element is: " + flag);
        } else {
            System.out.println("There is not such element in the array");
            for (int i : array) {
                System.out.print(i + " ");
            }
        }


    }

}
