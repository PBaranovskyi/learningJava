package ltretykhlib.module1.example;

/**
 * Created by Tretykhlib on 12.04.2017.
 */
public class Division {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 300; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println(i);
                counter++;
                if (counter % 10 == 0) {
                    break;
                }
            }
        }
    }
}
