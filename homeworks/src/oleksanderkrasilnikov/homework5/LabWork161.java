package oleksanderkrasilnikov.homework5;

public class LabWork161 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int count = 0;
        for (int i = 2; i <= 31; i++) {
            if (i % 2 == 0) {
                array[count] = i;
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " of arrany = " + array[i]);
        }
    }
}
