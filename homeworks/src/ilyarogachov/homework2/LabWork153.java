package ilyarogachov.homework2;

/**
 * Created by rogachev on 12.04.17.
 */
public class LabWork153 {
    public static void main(String[] args) {
        int f;
        System.out.println("*|123456789");
        System.out.println("------------");
        for (int i = 1; i <= 10; i++) {
            int a = 0;
            f = i;
            System.out.print(i + "|");
            while (a <= 8) {
                a++;
                System.out.print(f);
                f = f + i;
            }
            System.out.println("");
        }
    }
}