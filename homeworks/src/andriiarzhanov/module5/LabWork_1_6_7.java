package andriiarzhanov.module5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by arzhanov on 25.04.17.
 */
public class LabWork_1_6_7 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][20];

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                matrix[i][y] = random.nextInt(4) + 1;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }

        Scanner scan = new Scanner(System.in);
        int search = 0;


        System.out.println("Please enter number from 1 to 4");
        search = scan.nextInt();


        for (int i = 0; i < matrix.length; i++) {
            int[] founded = new int[matrix[i].length];
            int foundedCount = 0;
            for (int y = 0; y < matrix[i].length; y++) {
                if (matrix[i][y] == search) {
                    founded[y] = y;
                    foundedCount++;
                } else {
                    founded[y] = -1;
                }
            }

            int[] line = new int[foundedCount];
            int lineCount = 0;
            String lineString = "";
            for (int x = 0; x < founded.length; x++) {
                if (founded[x] != -1) {
                    line[lineCount] = founded[x];
                    lineCount++;
                }
            }

            if (line.length > 2) {
                //System.out.println("start preparing line " + i);
                lineString = prepareArrayString(line);
            } else {
                lineString = Arrays.toString(line);
            }

            for (int x = 0; x < line.length; x++) {

            }
            System.out.println("Line" + i + ": " + lineString);
        }
    }

    private static String prepareArrayString(int[] line) {
        int y = 0;
        String outString = "";

        while (y < line.length) {
            int start = line[y], end = line[y];
            for (int i = y; i < line.length; i++) {
                if (i + 2 <= line.length && end == (line[i + 1] - 1)) {
                    end = line[i + 1];
                    y = i;
                } else {
                    y = i;
                    break;
                }
            }
            if (outString.length() != 0 && outString.lastIndexOf(",") != outString.length()) {
                outString = outString + ",";
            }
            if (start != end && start != end - 1) {
                outString = outString + start + "-" + end;
            } else {
                outString = outString + line[y];
            }
            y++;
        }
        return "[" + outString + "]";
    }
}
