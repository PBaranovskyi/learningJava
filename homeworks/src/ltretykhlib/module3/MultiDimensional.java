package ltretykhlib.module3;

import java.util.Objects;

/**
 * Created by Tretykhlib on 24.04.2017.
 */
public class MultiDimensional {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int[] arr2 = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;

        }



        int count = 0;
        for (int i1 = 0; i1 < arr2.length; i1++) {
            if(i1==5){
                continue;
            }
            arr2[count] = count;
            System.out.println(arr2[count]);
            count++;
        }


        System.out.println ("starting loop:");
        for (int n = 0; n < 7; ++n)
        {
            System.out.println ("in loop: " + n);
            if (n == 2) {
                continue;
            }
            System.out.println ("   survived first guard");
            if (n == 4) {
                break;

            }
            System.out.println ("   survived second guard");
            // continue at head of loop
        }
// break out of loop
        System.out.println ("end of loop or exit via break");


        Object[] arr3 = new Object[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr2;
        }

        for (Object o : arr3) {
            int[] toStringInt = (int[]) o;
            for (int i : toStringInt) {
                //  System.out.print("****" + i);
            }
            //  System.out.println();
        }

        int sliceCount = 0;
        int[][][] intArrays = new int[5][10][100];

       outer:
       for (int[][] intarray : intArrays) {
          inner:  for (int[] ints : intarray) {
                for (int anInt : ints) {
                  //  System.out.print(anInt + " ");
                    break inner;
                }
                sliceCount++;
              //  System.out.println();
                if (sliceCount == 1) {
                    break outer;
                }
            }
            sliceCount = 0;
           // System.out.println();
        }

    }
}
