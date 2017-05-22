package ilyarogachov.homework3;

/**
 * Created by rogachev on 16.05.17.
 */
public class LabWork165 {

    public static void main(String[] args) {
        int [][] mymatrix= createMatrix(5,3);
        for(int i=0; i<mymatrix[i].length;i++){
            System.out.println(mymatrix[1][i]);
        }
        printMatrix(mymatrix);
        System.out.println(" "+ mymatrix.length);
        System.out.println(" "+ mymatrix[4].length);

        transposeMatrix(mymatrix);
        printMatrix(transposeMatrix(mymatrix));

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
    private static int[][] transposeMatrix(int[][] m) {
        int[][] newBoard = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                newBoard[j][i] = m[i][j];
        return newBoard;
    }

}
