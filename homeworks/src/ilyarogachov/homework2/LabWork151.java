package ilyarogachov.homework2;

/**
 * Created by rogachev on 12.04.17.
 */
public class LabWork151 {
    public static void main(String[] args) {
        String S = "";
        int a = 0;
        while (a <= 8) {
            a++;
            for (int y = a; y >= 0; y--) {
                if (y != 0)
                    S = S + y + " ";

            }
            System.out.println(S);
            S = "";
        }
    }
}