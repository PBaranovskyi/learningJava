package alexandermelnychuk.homework4;

/*Task
        Write a program, which transpose matrix (2d arrays, size 4x4) and outputs it to the
        console*/

import java.util.Scanner;

public class LabWork165 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input number of rows and columns for new matrix!");
        System.out.print("Rows: ");
        int row = scan.nextInt();
        System.out.print("Columns: ");
        int col = scan.nextInt();
        scan.close();

        int[][] originalBoard = createMatrix(row, col);
        System.out.println("Print original matrix: ");
        printMatrix(originalBoard);
        int[][] transposeBoard = transposeMatrix(originalBoard);
        System.out.println("Print transpose matrix: ");
        printMatrix(transposeBoard);
    }

    private static int[][] transposeMatrix(int[][] m) {
        int[][] newBoard = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                newBoard[j][i] = m[i][j];
        return newBoard;
    }

    private static int[][] createMatrix(int row, int column) {
        int[][] board = new int[row][column];

        for (int r = 0; r < board.length; r++) {
            int cellValue = r + 1;

            for (int col = 0; col < board[r].length; col++) {
                board[r][col] = cellValue;
                cellValue += board.length;
            }
        }
        return board;
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
