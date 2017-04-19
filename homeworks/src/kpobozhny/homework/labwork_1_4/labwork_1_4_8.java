package kpobozhny.homework.labwork_1_4;

/**
 * Created by kostya on 4/9/17.
 */

/*Task
        Write a console program that prints result type casting
        for different primitive types.*/

public class labwork_1_4_8 {

    static int a=50000;

    static float b=456.001f;

    public static void main(String[] args) {

        System.out.println("int a= " + a);
        System.out.println("(byte)a = " + (byte)a);
        System.out.println("(short)a = " + (byte)a);
        System.out.println("(double)a = " + (double)a);
        System.out.println("(char)a = " + (char)a);
        System.out.println();
        System.out.println("float b=" + b);
        System.out.println("(int)b = " + (int)b);
        System.out.println("(char)b = " + (char)b);
    }
}
