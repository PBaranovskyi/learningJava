package edyadechko.lesson1.homework2;

/**
 * Created by Evgeny on 17.04.2017.
 */
public class labWork_1_5_3 {
    public static void main(String[] args) {
        System.out.print("* |");
        for (int k = 1; k <= 9; k++) {
            System.out.format("%4d", k);
        }
        System.out.println("\r");
        for (int l = 1; l <= 10; l++) {
            System.out.print("----");
        }
        System.out.println("\r");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " |");
            for (int j = 1; j <= 9; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println("\r");
        }
    }
}
