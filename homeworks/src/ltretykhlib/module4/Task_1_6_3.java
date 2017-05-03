package ltretykhlib.module4;

import java.util.Arrays;

/**
 * Created by Tretykhlib on 02.05.2017.
 */
public class Task_1_6_3 {
    public static void main(String[] args) {
        int k = 1;
        int[][] a  = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = k;
                k++;
            }
        }

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i][j]);
            }
            System.out.println(" ");
        }
        
    }
}



