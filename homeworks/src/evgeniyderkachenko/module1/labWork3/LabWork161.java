package evgeniyderkachenko.module1.labWork3;

/**
 * Created by Derkachenko on 02.05.2017.
 */
public class LabWork161 {
    int i = 0;

    public static void main(String[] args) {
        int[] intArray = new int[15];
        for (int i = 2; i <= 30; i = i + 2) {
            intArray[i / 2 - 1] = i;
            System.out.println(intArray[i / 2 - 1]);
        }

    }
}
