package ltretykhlib.module1.example;

/**
 * Created by Tretykhlib on 09.04.2017.
 */
public class IncDecr {
    public static void main(String[] args) {

        int a = 3;
        int c = ++a;
        int m = c + 2;
        System.out.println(m);

        a = 3;
        c = a++;
        m = c + 2;
        System.out.println(m);


        a = 3;
        c = --a;
        m = c + 2;
        System.out.println(m);

        a = 3;
        c = a--;
        m = c + 2;
        System.out.println(m);

    }
}


