package edyadechko.lesson1.homework2;

/**
 * Created by Evgeny on 17.04.2017.
 */
public class labWork_1_5_4 {
    public static void main(String[] args) {
        int j = 1;
        for (int i = 1; i <= 300; i++) {
            if ((i % 3 == 0 || i % 4 == 0) && j <= 10) {
                System.out.println(i);
                j++;
            }
        }
    }
}
