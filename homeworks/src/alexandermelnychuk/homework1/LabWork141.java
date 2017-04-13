package alexandermelnychuk.homework1;

//Task: Write a console program prints on console each of the primitive data types (byte, short, int, long, float, double, char, boolean).

public class LabWork141 {
    public static void main(String[] args) {

        byte byteValue = 126;

        short shortValue = 20423;

        int intValue = 502342314;

        long longValue = 5080053452345654645L;

        float floatValue = 1.6666666f;

        double doubleValue = 1.6666666666666667d;

        char charValue = '\u00A9';

        boolean booleanValue = false;

        System.out.println("My byte value is - " + byteValue);
        System.out.println("My short value is - " + shortValue);
        System.out.println("My int value is - " + intValue);
        System.out.println("My long value is - " + longValue);
        System.out.println("My float value is - " + floatValue);
        System.out.println("My double value is - " + doubleValue);
        System.out.println("My char(Unicode) value is - " + charValue);
        System.out.println("My boolean value is - " + booleanValue);
    }
}
