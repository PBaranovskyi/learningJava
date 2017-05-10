package oleksanderkrasilnikov.homework5;

import java.util.Random;

public class LabWork163 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrixArray = new int[4][4];

        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                matrixArray[i][j] = random.nextInt(100);
            }
        }

        for (int[] row : matrixArray) {
            for (int j : row) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
//        for (int i = 0; i < matrixArray.length; i++) {
//            for (int j = 0; j < matrixArray[i].length; j++) {
//                System.out.print(matrixArray[i][j] + " ");
//            }
//            System.out.println();
//        }


    }
}
