package andriiarzhanov.module2;

/**
 * Created by arzhanov on 09.04.17.
 */
public class LabWork_1_4_4 {

    public static void main(String[] args) {
        int a = 3, b = 0;

        b = ++a;
        System.out.println("++a: " + b);
        b = a++;
        System.out.println("a++: " + b);

        b = --a;
        System.out.println("--a: " + b);
        b = a--;
        System.out.println("a--: " + b);
    }
}
