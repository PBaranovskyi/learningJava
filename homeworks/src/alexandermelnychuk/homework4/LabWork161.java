package alexandermelnychuk.homework4;

/*Task:
        Create an array of all the even numbers from 2 to 30 (2,4,6...30)
        and display elements of the array to the screen.*/

import java.util.Arrays;

public class LabWork161 {
    public static void main(String[] args) {
        int[] arr = new int[15];

        for (int i = 2, arrIndex = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                arr[arrIndex] = i;
                arrIndex++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}