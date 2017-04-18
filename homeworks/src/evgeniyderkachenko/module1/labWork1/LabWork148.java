package evgeniyderkachenko.module1.labWork1;

/**
 * Created by Derkachenko on 09.04.2017.
 */
public class LabWork148 {
    public static void main(String[] args) {


        byte b = 2;
        short s = 24;
        int a = 1123;
        long l = 32;
        float f = 42;
        double d = 233.53;
        char c = 5;

        System.out.println("b=" + ((short) b));
        System.out.println("s=" + ((long) s));
        System.out.println("a=" + ((long) a));
        System.out.println("l=" + ((int) s)); //тут можно потерять данные
        System.out.println("f=" + ((double) f));
        System.out.println("d=" + ((long) d));
        System.out.println("c=" + ((byte) c));

    }
}