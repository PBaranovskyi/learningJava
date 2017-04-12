package kpobozhny.homework.labwork_1_4;

/**
 * Created by kostya on 4/9/17.
 */

/*Task:
        Write a console program prints on console each of the primitive data types
        (byte, short, int, long, float, double, char, boolean).*/

public class labwork_1_4_1 {

    static byte by=-127;
    static short sh=32767;
    static int in=2147483647;
    static long lo=(long)in*sh*by;

    static float fl=1.001f;
    static double dou=1.001*fl*fl*fl;

    static char ch01='X';
    static char ch02=88;

    static boolean bo=true;


    public static void main(String[] args) {
        System.out.println("byte: " + by);
        System.out.println("short: " + sh);
        System.out.println("int: " + in);
        System.out.println("long: " + lo);
        System.out.println();
        System.out.println("float: " + fl);
        System.out.println("double: " + dou);
        System.out.println();
        System.out.println("char: " + ch01);
        System.out.println("the same char: " + ch02);
        System.out.println();
        System.out.println("boolean: " + bo);


    }
}
