package andriiarzhanov.module5;

/**
 * Created by arzhanov on 25.04.17.
 */
public class LabWork_1_6_3 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int counter = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                matrix[i][y] = counter;
                counter++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                System.out.print(matrix[y][i] + " ");
            }
            System.out.println();
        }
    }
}
