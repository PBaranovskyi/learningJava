package vkochergin.module1.example.homework6;

import java.util.Arrays;

/**
 * Created by Volodymyr Kochergin on 25.04.2017.
 * Write a program, which transpose matrix (2d arrays, size 4x4) and outputs it to the console
 */
public class LabWork165 {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        //Printing original matrix:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        //Transposing matrix, using temp array:
        int[][] temp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                temp[i][j] = matrix[matrix.length - i - 1][matrix[0].length - j - 1];
            }
        }

        matrix = temp;

        //Printing transposed matrix:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
