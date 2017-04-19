package kpobozhny.homework.labwork_1_4;

/**
 * Created by kostya on 4/9/17.
 */

/*Task:
        Write a console program that prints result of each of arithmetic logical (AND, OR, NOT, XOR)
        for two variables of boolean data type.*/

public class labwork_1_4_3 {

    static boolean x=true;
    static boolean y=false;

    public static void main(String[] args) {

        System.out.println("--------AND------");
        System.out.println("("+x+" AND "+x+") = " + (x&&x));
        System.out.println("("+x+" AND "+y+") = " + (x&&y));
        System.out.println("("+y+" AND "+x+") = " + (y&&x));
        System.out.println("("+y+" AND "+y+") = " + (y&&y));
        System.out.println();
        System.out.println("--------OR------");
        System.out.println("("+x+" OR "+x+") = " + (x||x));
        System.out.println("("+x+" OR "+y+") = " + (x||y));
        System.out.println("("+y+" OR "+x+") = " + (y||x));
        System.out.println("("+y+" OR "+y+") = " + (y||y));
        System.out.println();
        System.out.println("--------XOR------");
        System.out.println("("+x+" XOR "+x+") = " + (x^x));
        System.out.println("("+x+" XOR "+y+") = " + (x^y));
        System.out.println("("+y+" XOR "+x+") = " + (y^x));
        System.out.println("("+y+" XOR "+y+") = " + (y^y));
        System.out.println();
        System.out.println("--------NOT------");
        System.out.println("NOT("+x+") = " + !x);
        System.out.println("NOT("+y+") = " + !y);

    }
}
