package alexandermelnychuk.homework1;

//Task: Write a console program that prints result type casting for different primitive types.

public class LabWork148 {
    public static void main(String[] args) {

        double doubleValue = 1689.9;
        char charValue = (char) doubleValue;

        float floatValue = 100.001f;
        int intValue = (int) floatValue;

        short shortValue = 129;
        byte byteVale = (byte) shortValue;

        boolean booleanValue = true;
        int intVal = booleanValue ? 1 : 0;

        long longValue = 9223372036854775807L;
        double doubleVal = (double) longValue;

        System.out.println("From double to char: " + charValue);
        System.out.println("From float to int: " + intValue);
        System.out.println("From short to byte: " + byteVale);
        System.out.println("From boolean to int: " + intVal);
        System.out.println("From long to double: " + doubleVal);
    }
}
