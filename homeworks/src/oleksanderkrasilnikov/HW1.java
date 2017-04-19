package oleksanderkrasilnikov;


public class HW1 {
    public static void main(String[] args) {

        //   Write a console program prints on console each of the primitive data types (byte, short, int, long, float, double, char, boolean).
        labWork141();


        //  Write a console program that prints result of each of arithmetic operations (+, -, /, *, %) for two variables of primitive data types.
        labWork142();


        //  Write a console program that prints result of each of arithmetic logical (AND, OR, NOT, XOR) for two variables of boolean data type.
        labWork143();


        //   Write a console program that prints result of increment and decrement in prefix and postfix mode for integer variable.
        labWork144();


        //  Write a console program that prints result of Ternary operator for integer variable initialization.
        LabWork147();


        //   Write a console program that prints result type casting for different primitive types.
        labWork148();
    }

    public static void labWork141() {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float e = 5F;
        double h = 6;
        char q = 'c';
        boolean s = true;

        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + h);
        System.out.println("char: " + q);
        System.out.println("boolean: " + s);
    }

    public static void labWork142() {
        int a = 2;
        int b = 5;
        System.out.println();
        System.out.println("+: " + (a + b));
        System.out.println("-: " + (a - b));
        System.out.println("/: " + (double) a / b);
        System.out.println("*: " + a * b);
        System.out.println("%: " + a % b);
    }

    public static void labWork143() {
        boolean a = true;
        boolean b = false;

        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("NOT of AND: " + !(a & b));
        System.out.println("XOR: " + (a ^ b));
    }

    public static void labWork144() {
        int a = 0;
        a++;
        System.out.println("prefix ++: " + a);
        ++a;
        System.out.println("postfix ++: " + a);
        a--;
        System.out.println("prefix --: " + a);
        --a;
        System.out.println("postfix --: " + a);
    }

    public static void LabWork147() {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        System.out.println(a > b ? "a>b" + " a=" + a + " b=" + b : "a<b" + " a=" + a + " b=" + b);
    }

    public static void labWork148() {
        double b = 101;
        int a = (int) b;
        char c = (char) a;
        byte d = (byte) c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}
