package evgeniyderkachenko.module1.labWork3;

/**
 * Created by Derkachenko on 02.05.2017.
 */
public class LabWork165 {
    public static void main(String[] args) {
        int a = 1;
        int i;
        int[][] m = new int[4][4];
        for (int j = 0; j < m.length; j++) {
            for (i = 0; i < m.length; i++) {
                m[j][i] = a;
                a++;
            }
            ;
        }
        ;
        System.out.println("Old matrix");
        for (int j = 0; j < m.length; j++) {
            for (i = 0; i < m.length; i++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("New matrix");
        for (int j = 0; j < m.length; j++) {
            for (i = 0; i < m.length; i++) {
                System.out.print(m[j][i] + " ");
            }
            System.out.println();
        }
    }
}
