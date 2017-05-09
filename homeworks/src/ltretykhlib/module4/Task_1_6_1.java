package ltretykhlib.module4;

/**
 * Created by Tretykhlib on 02.05.2017.
 */
public class Task_1_6_1 {
    public static void main(String[] args) {
        int[] array = new int[30];
        for (int i = 1; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = i;
                System.out.println(array[i]);
            }
        }
    }
}
