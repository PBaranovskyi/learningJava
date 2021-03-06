package bogdanh.com.kstt.week2;

public class Lab153 {

    public static void main(String[] args) {

        int tableSize = 9;

        printMultiplicationTable(tableSize);
    }

    private static void printMultiplicationTable(int tableSize) {

        System.out.format("******");

        for (int i = 1; i <= tableSize; i++) {
            System.out.format("%4d", i);
        }

        System.out.println();

        System.out.println("------------------------------------------");

        for (int i = 1; i <= tableSize; i++) {

            System.out.format("%4d |", i);

            for (int j = 1; j <= tableSize; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }
}
