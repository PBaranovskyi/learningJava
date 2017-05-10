package ua.kstt.justymenko.module05;

/**
 * Created by n1kropol on 4/24/17.
 */
public class LW_163_Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int counter = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = counter;
                counter++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
