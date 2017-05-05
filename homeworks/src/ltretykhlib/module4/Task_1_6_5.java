package ltretykhlib.module4;

/**
 * Created by Tretykhlib on 04.05.2017.
 */
public class Task_1_6_5 {
    public static void main(String[] args) {
        int k = 1;
        int[][] a = new int[4][4];
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < 4; i++) {
                a[i][j] = k;
                k++;
                System.out.printf(" %4d ", a[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("Transposed matrix:");

        int[][] trasposedMatrix = new int[4][4];

        for (int i = 0; i < a.length; i++) {
            for (int y = 0; y < a.length; y++) {
                trasposedMatrix[y][i] = a[i][y];
                System.out.printf(" %4d ", trasposedMatrix[y][i]);
            }

            System.out.println(" ");
        }


    }
}
