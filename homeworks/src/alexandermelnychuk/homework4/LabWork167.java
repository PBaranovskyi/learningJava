package alexandermelnychuk.homework4;

/*Task
        Write a program, which finds in a given matrix the area of equal numbers. Here is
        one example with an area containing 7 elements with equal value of 1:
        1 1 1 3 4
        2 1 3 1 2
        2 2 3 4 1
        3 3 3 1 4*/

import java.util.Arrays;
import java.util.Scanner;

public class LabWork167 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input number of rows and columns for new matrix!");
        System.out.print("Rows: ");
        int row = scan.nextInt();
        System.out.print("Columns: ");
        int col = scan.nextInt();
        scan.close();

        int[][] matrix = createMatrix(row, col);
        int[] duplicateValues = duplicateValuesArray(matrix, row, col);
        printMatrix(matrix);
        printDuplicateValues(matrix, duplicateValues);
    }

    private static void printDuplicateValues(int[][] dArray, int[] array) {
        System.out.print("\n");
        for (int v = 0; v < array.length; v++) {
            System.out.println("Founded duplicate number: " + array[v]);
            for (int r = 0; r < dArray.length; r++) {
                int indexCount = 0;
                for (int c = 0; c < dArray[r].length; c++) {
                    if (array[v] == dArray[r][c]) {
                        indexCount++;
                    }
                }
                if (indexCount != 0) {
                    int[] dValues = new int[indexCount];
                    indexCount = 0;
                    for (int col1 = 0; col1 < dArray[r].length; col1++) {
                        if (array[v] == dArray[r][col1]) {
                            dValues[indexCount] = col1;
                            indexCount++;
                        }
                    }
                    System.out.println("Line " + (r + 1) + ": " + Arrays.toString(dValues));
                }
            }
            System.out.println();
        }
    }

    private static int[][] createMatrix(int row, int column) {
        int[][] board = new int[row][column];

        for (int r = 0; r < board.length; r++) {

            for (int col = 0; col < board[r].length; col++) {
                board[r][col] = (int) (Math.random() * 10);
            }
        }
        return board;
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Print random matrix:" + "\n");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }

    private static int[] duplicateValuesArray(int[][] array, int r, int c) {
        int[] copyArray = new int[r * c];
        int indexCount = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                copyArray[indexCount] = array[row][col];
                indexCount++;
            }
        }
        Arrays.sort(copyArray);
        int[] duplicateValues = new int[r * c];
        indexCount = 0;
        for (int row = 0; row < copyArray.length - 1; row++) {
            if (copyArray[row] == copyArray[row + 1] && row == 0) {
                duplicateValues[indexCount] = copyArray[row];
                indexCount++;
            } else if (copyArray[row] == copyArray[row + 1] && copyArray[row - 1] == copyArray[row + 1]) {
                continue;
            } else if (copyArray[row] == copyArray[row + 1]) {
                duplicateValues[indexCount] = copyArray[row];
                indexCount++;
            }
        }
        int lastIndex = 0;
        for (int row = 0; row < duplicateValues.length - 1; row++) {
            if (duplicateValues[row] == duplicateValues[row + 1]) {
                lastIndex = row;
                break;
            }
        }
        duplicateValues = Arrays.copyOf(duplicateValues, lastIndex);
        return duplicateValues;
    }
}