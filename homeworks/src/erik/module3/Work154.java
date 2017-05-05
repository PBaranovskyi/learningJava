package erik.module3;

/**
 * Created by Erik Pavliuk on 14/04/2017.
 */
public class Work154 {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 3; i < 300; i++) {
            int three = i % 3;
            int four = i % 4;
            if (three == 0 || four == 0) {
                System.out.println(x + " : " + i);
                x += 1;
                if (x > 10)
                    break;
            }
        }
    }
}