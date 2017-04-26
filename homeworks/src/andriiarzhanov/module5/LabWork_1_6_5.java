package andriiarzhanov.module5;

/**
 * Created by arzhanov on 25.04.17.
 */
public class LabWork_1_6_5 {
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
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int[][] transpotedMatrix = new int[4][4];
        for (int i = 0; i < transpotedMatrix.length; i++) {
            for (int y = 0; y < transpotedMatrix[i].length; y++) {
                transpotedMatrix[i][y] = matrix[y][i];
            }
        }

        for (int i = 0; i < transpotedMatrix.length; i++) {
            for (int y = 0; y < transpotedMatrix[i].length; y++) {
                System.out.print(transpotedMatrix[i][y] + " ");
            }
            System.out.println();
        }
    }
}
