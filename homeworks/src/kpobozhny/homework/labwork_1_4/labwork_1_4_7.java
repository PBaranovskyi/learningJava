package kpobozhny.homework.labwork_1_4;

/**
 * Created by kostya on 4/9/17.
 */

/*Task:
    Write a console program that prints result of Ternary operator
    for integer variable initialization.*/

public class labwork_1_4_7 {

    static int bit;
    static boolean b=true;
    public static void main(String[] args) {
        bit=b?1:0;
        System.out.println("For " +b+": bit=" + bit);
        b=!b;
        bit=b?1:0;
        System.out.println("For " +b+": bit=" + bit);

    }
}
