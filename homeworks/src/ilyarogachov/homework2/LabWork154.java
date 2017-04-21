package ilyarogachov.homework2;

/**
 * Created by rogachev on 13.04.17.
 */
public class LabWork154 {
    public static void main(String[] args) {
        int k;
        int num = 0;
        for (int i = 1; i <= 300; i++) {
            k = i;
            int a = i % 3;
            int b = k % 4;
            if (a == 0 && num < 10) {
                System.out.println(i);
                num++;
            } else if (b == 0 && num < 10) {
                System.out.println(i);
                num++;
            }
        }
    }
}
