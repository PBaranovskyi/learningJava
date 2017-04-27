package vkochergin.module1.example.homework6;

/**
 * Created by Volodymyr Kochergin on 25.04.2017.
 *  Write a program, which creates square matrix like those in the figure
 * below and prints them formatted to the console. The size of the matrix is 4 x 4:
 * <p>
 * 1 5 9 13
 * 2 6 10 14
 * 3 7 11 15
 * 4 8 12 16
 */
public class LabWork163 {

    public static void main(String[] args) {

        int[][] matrix = {{1, 5, 9, 13},
                {2, 6, 10, 14},
                {3, 7, 11, 15},
                {4, 8, 12, 16}};


        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");

            }

            System.out.println();
        }
    }
}
