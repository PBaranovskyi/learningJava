package kpobozhny.homework.labwork_1_4;

/**
 * Created by kostya on 4/9/17.
 */

/*Task:
        Write a console program that prints result of increment and decrement
        in prefix and postfix mode for integer variable.*/

public class labwork_1_4_4 {

    static int i = 10;

    public static void main(String[] args) {
        System.out.println("i = " + i);
        System.out.println();
        System.out.println("----POSTFIX----");
        System.out.print("i = " + i +"; ");
        System.out.println("print(i++) = " + i++);
        System.out.print("i = " + i +"; ");
        System.out.println("print(i--) = " + i--);

        System.out.println();
        System.out.println("----PREFIX----");
        System.out.print("i = " + i +"; ");
        System.out.println("print(++i) = " + ++i);
        System.out.print("i = " + i +"; ");
        System.out.println("print(--i) = " + --i);


    }
}
