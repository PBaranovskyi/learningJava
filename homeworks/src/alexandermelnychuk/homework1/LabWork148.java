package alexandermelnychuk.homework1;

//Task: Write a console program that prints result type casting for different primitive types.

public class LabWork148 {
    public static void main(String[] args) {

        double doubleValue = 1689.9;
        char charValue = (char) doubleValue;

        float floatValue = 100.001f;
        int intValue = (int)floatValue;

        short shortValue = 129;
        byte byteVale = (byte) shortValue;

        boolean booleanValue = true;
        int intVal = booleanValue ? 1 : 0;

        long longValue = 9223372036854775807L;
        double doubleVal = (double)longValue;

        System.out.println(
                "From double to char: " + charValue + "\n" +
                "From float to int: " + intValue + "\n" +
                "From short to byte: " + byteVale + "\n" +
                "From boolean to int: " + intVal + "\n" +
                "From long to float: " + doubleVal
        );
    }
}
