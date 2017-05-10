package oleksanderkrasilnikov.homework5;

import java.util.Random;

public class LabWork165 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] fistArray = new int[2][3];

        for (int i = 0; i < fistArray.length; i++) {
            for (int j = 0; j < fistArray[i].length; j++) {
                fistArray[i][j] = random.nextInt(100);
            }
        }

        for (int[] row : fistArray) {
            for (int j : row) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        int[][] secondArray = transposeMatrix(fistArray);

        for (int[] row : secondArray) {
            for (int j : row) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    protected static int[][] transposeMatrix(int[][] array) {
        int[][] temp = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[0].length; j++)
                temp[j][i] = array[i][j];
        return temp;
    }
}
