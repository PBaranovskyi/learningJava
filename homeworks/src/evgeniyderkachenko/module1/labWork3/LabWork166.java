package evgeniyderkachenko.module1.labWork3;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Derkachenko on 02.05.2017.
 */
public class LabWork166 {

    static double[] m = {-3.5, -3, 1.8, 9.3, 15.5, 18.5, 20.5, 19.7, 14.2, 8.4, 1.9, -2.3};

    public static void main(String[] args) {

        Arrays.sort(m);
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
    }
}