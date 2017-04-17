package edyadechko.lesson1.homework2;

/**
 * Created by Evgeny on 17.04.2017.
 */
public class labWork_1_5_1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 8) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("\r");
            i++;
        }
    }
}