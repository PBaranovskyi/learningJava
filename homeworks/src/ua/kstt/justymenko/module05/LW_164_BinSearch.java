package ua.kstt.justymenko.module05;

import java.util.Arrays;

/**
 * Created by n1kropol on 4/25/17.
 */
public class LW_164_BinSearch {
    public static void main(String[] args) {
        // initializing unsorted int array
        int intArr[] = {30,20,5,12,55};

        // sorting array
        Arrays.sort(intArr);

        // let us print all the elements available in list
        System.out.println("The sorted int array is:");
        for (int number : intArr) {
            System.out.println("Number = " + number);
        }

        // entering the value to be searched
        int searchVal = 12;

        int retVal = Arrays.binarySearch(intArr,searchVal);
        System.out.println("The index of element 12 is : " + retVal);
    }
}
