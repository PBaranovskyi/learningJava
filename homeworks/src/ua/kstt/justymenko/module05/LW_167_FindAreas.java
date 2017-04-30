package ua.kstt.justymenko.module05;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by n1kropol on 4/25/17.
 */
public class LW_167_FindAreas {
    public static void main(String[] args) {
        int iDimension = 4;
        int jDimension = 5;
        int[][] matrix = new int[iDimension][jDimension];
        int finder = 1;
        Random random = new Random();
        for (int i = 0; i < iDimension; i++) {
            for (int j = 0; j < jDimension; j++) {
                matrix[i][j] = random.nextInt(jDimension) + 1;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            String prefix = "";
            int begin = 0;
            int end = 0;
            boolean isBeginSet = false;
            boolean isRepeated = false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (j + 2 < matrix[i].length && matrix[i][j] == finder && matrix[i][j + 1] == finder && matrix[i][j + 2] == finder) {
                    isRepeated = true;
                    if (!isBeginSet) {
                        isBeginSet = true;
                        begin = j;
                    }
                    end = j + 2;
                    if (j + 2 != matrix[i].length - 1)
                        continue;
                }
                if (isRepeated) {
                    builder.append(prefix);
                    builder.append(begin + "-" + end);
                    prefix = ",";
                    isRepeated = false;
                    j = end + 1;
                }
                if (j < matrix[i].length && matrix[i][j] == finder) {
                    builder.append(prefix);
                    prefix = ",";
                    builder.append(j);
                }
                if (j < matrix[i].length)
                    continue;
            }
            i++;
            System.out.println("Line " + i + ": [" + builder + "]");
            i--;
            builder.setLength(0);
        }
    }
}
