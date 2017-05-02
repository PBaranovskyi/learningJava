package kpobozhny.homework.labwork_1_6;

/**
 * Created by kostya on 4/29/17.
 */

/*Task:
        Write a program, which transpose matrix (2d arrays, size 4x4)
        and outputs it to the console*/

public class labwork_1_6_5 {

    static int[][] transpose(int[][] array) {

        int[][] transposedArray = new int[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                transposedArray[i][j] = array[j][i];
            }
        }

        return transposedArray;
    }

    public static void main(String[] args) {
        int[][] array = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = (int) (100 * Math.random() - 50);
            }
        }
        System.out.println("Initial array:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
        array = transpose(array);
        System.out.println("Transposed array:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
