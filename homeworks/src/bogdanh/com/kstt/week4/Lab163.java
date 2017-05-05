package bogdanh.com.kstt.week4;

import java.util.Arrays;

public class Lab163 {

    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i + j;
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
