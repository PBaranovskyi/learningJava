package ltretykhlib.module1.example;

/**
 * Created by Tretykhlib on 12.04.2017.
 */
public class Square {
    public static void main(String[] args) {

        for (int i = 0; i <= 9; i++)
            if (i == 0) {
                System.out.format("   * ", "|");
                System.out.format("|");

            } else {
                System.out.format("%4d", i);

            }

        System.out.println();

        System.out.println(" -------------------------------------------");


        for (int i = 1; i <= 9; i++) {

            System.out.format("%4d |", i);

            for (int j = 1; j <= 9; j++) {

                System.out.format("%4d", i * j);

            }

            System.out.println();

        }
    }
}

