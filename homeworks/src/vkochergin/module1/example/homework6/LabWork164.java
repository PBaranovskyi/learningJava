package vkochergin.module1.example.homework6;

import java.util.Arrays;

/**
 * Created by Volodymyr Kochergin on 25.04.2017.
 * Write a program, which uses a binary search in a sorted array of integer numbers to find a certain element.
 */
public class LabWork164 {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 44, 85, 33399, 24, 987, 445};

        Arrays.sort(myArray);

        int n = Arrays.binarySearch(myArray, 33399);

        System.out.println("Index of element that you are looking for is: " + n);
    }
}
