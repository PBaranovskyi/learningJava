package oleksanderkrasilnikov.homework5;

public class LabWork162 {
    public static void main(String[] args) {
        int[] array = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};

        int max = array[0];
        int min = array[0];
        double avarage = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            avarage += array[i];
        }
        avarage = avarage / (array.length + 1);

        System.out.println("max value = " + max);
        System.out.println("min value = " + min);
        System.out.println("avarage value = " + avarage);
    }
}
