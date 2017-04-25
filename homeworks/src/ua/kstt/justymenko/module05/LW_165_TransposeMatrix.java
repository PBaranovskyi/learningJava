package ua.kstt.justymenko.module05;

import java.util.Arrays;

/**
 * Created by n1kropol on 4/25/17.
 */
public class LW_165_TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int[][] transMatrix = new int[4][4];
        int counter = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = counter;
                transMatrix[i][j] = matrix[j][i];
                counter++;
            }
        }


        System.out.println("Matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix");
        for (int i = 0; i < transMatrix.length; i++) {
                System.out.println(Arrays.toString(transMatrix[i]));
        }
    }
}
