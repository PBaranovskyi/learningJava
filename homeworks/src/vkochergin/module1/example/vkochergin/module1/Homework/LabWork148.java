package vkochergin.module1.example.vkochergin.module1.Homework;

/**
 * Created by Volodymyr Kochergin on 07.04.2017.
 */
public class LabWork148 {
    public static void main(String[] args) {
        //implicit casting:
        int a = 100;
        long b = a;
        double c = b;
        System.out.println("Implicit casting: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();

        //explicit casting:
        double d = 25555555.55;
        long l = (long) d;
        int g = (int) l;
        short t = (short) g;
        System.out.println("Explicit casting: ");
        System.out.println(d);
        System.out.println(l);
        System.out.println(g);
        System.out.println(t);
    }
}
