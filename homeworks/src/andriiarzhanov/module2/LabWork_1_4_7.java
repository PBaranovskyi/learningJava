package andriiarzhanov.module2;

/**
 * Created by arzhanov on 09.04.17.
 */
public class LabWork_1_4_7 {
    public static void main(String[] args) {
        int a = 10, b = 5;

        a = b > a ? ++a : --a;
        System.out.println("a="+a);
    }
}