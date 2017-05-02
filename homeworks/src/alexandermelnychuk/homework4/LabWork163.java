package alexandermelnychuk.homework4;

/*Task
        Write a program, which creates square matrix like those in the figure
        below and prints them formatted to the console. The size of the
        matrix is 4 x 4:
        1 5 9 13
        2 6 10 14
        3 7 11 15
        4 8 12 16 */

public class LabWork163 {
    public static void main(String[] args) {

        int[][] board = new int[4][4];

        for (int row = 0; row < board.length; row++) {
            int cellValue = row + 1;

            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = cellValue;
                System.out.print(board[row][col] + "\t");
                cellValue += board.length;
            }

            System.out.println();
        }
    }
}