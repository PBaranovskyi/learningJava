package com.ksttlearning.lesson4;

/**
 * Created by citsym on 24.04.17.
 */
public class MultyDementional {

    public static void main(String[] args) {

//        int[] intArray = new int[10];
//
//
//        int count = 0;
//
//        for (int item : intArray) {
//            intArray[count] = count;
//            System.out.println(intArray[count]);
//            count++;
//        }
//
//
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i]  = i;
//        }
//
//
//
        int[] intArray2 = new int[10];

        for (int i = 0; i < intArray2.length; i++) {
            intArray2[i] = i;
        }

        Object[] arrayOfObjects = new Object[10];

        for (int i = 0; i < arrayOfObjects.length; i++) {
            arrayOfObjects[i] = intArray2;
        }


        double[] doubleArray = new double[10];
        arrayOfObjects[5] = doubleArray;


//        for (Object object : arrayOfObjects) {
//
//            int[] toStringInt = (int[]) object;
//
//            for (int i : toStringInt) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//
//        }

        int sliceCount = 0;

        int[][][] intArrays = new int[5][10][100];

        for (int[][] intArray : intArrays) {
            for (int[] ints : intArray) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                sliceCount++;
                System.out.println();
                if (sliceCount == 1) {
                    break;
                }
            }

            sliceCount = 0;
            System.out.println();

        }


    }

}
