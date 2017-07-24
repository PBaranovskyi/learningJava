package oleksanderkrasilnikov.lesson7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Krasilnikov on 24.07.2017.
 */
public class ClassWork {

    public static void main(String[] args) {
        Integer [] arr = new Integer [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, (first, second) ->  (first%2==1) && (second%2==0) ? 1 :  -1 );

        System.out.println(Arrays.toString(arr));
    }
}
