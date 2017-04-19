package ua.kstt.justymenko.module03;

/**
 * Created by n1kropol on 4/11/17.
 */
public class LW_154_Division {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 301; i++) {
            if (i % 3 == 0 || i % 4 == 0){
                counter++;
                if (counter > 10)
                    break;
                else
                    System.out.println(i);
            }
        }
    }
}
