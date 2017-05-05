package bogdanh.com.kstt.week4;


import java.util.Arrays;

//Write a program, which uses a binary search in a sorted array of integer numbers to find a certain element.
public class Lab164 {

    public static void main(String[] args) {

        int[] arr = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};

        System.out.println("Number is stored at index : " + Arrays.binarySearch(arr, 9));

    }


}
