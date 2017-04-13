package alexandermelnychuk.homework1;

//Task: Write a console program that prints result of Ternary operator for integer variable initialization.

public class LabWork147 {
    public static void main(String[] args) {

        int result = 10 % 4 != 2 ? 2 : 25;

        System.out.println("if-then-else statement in one line result = " + result);
    }
}
