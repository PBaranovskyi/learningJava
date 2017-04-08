package bogdanh.com.kstt.week1.hw1;


//Write a console program prints on console each of the primitive data types (byte, short, int, long, float, double, char, boolean).

public class LabWork141 {

    public static void main(String[] args) {

        byte byteVar = -127;
        short shortVal = 10000;
        int intVal = 300453;
        long longVal = 1234_5678_9012_3456L;
        float floatVal = 3.14_15F;
        boolean boolVal = true;
        double doubleVal = 123.4;
        char charVal = 'C';

        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVal);
        System.out.println("int: " + intVal);
        System.out.println("long: " + longVal);
        System.out.println("float: " + floatVal);
        System.out.println("double: " + doubleVal);
        System.out.println("char: " + charVal);
        System.out.println("boolean: " + boolVal);
    }
}

