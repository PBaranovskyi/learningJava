package bogdanh.com.kstt.week4;

import java.util.Arrays;

public class Lab165 {

    public static void main(String[] args) {


        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j + 1;
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(matrix));

        matrix = transpose(matrix);

        System.out.println("After the transposing the matrix");

        System.out.println(Arrays.deepToString(matrix));


    }

    private static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposed = new int[rows][columns];


        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                transposed[row][col] = matrix[col][row];
            }
        }
        return transposed;
    }
}
