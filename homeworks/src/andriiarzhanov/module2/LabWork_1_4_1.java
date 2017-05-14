package andriiarzhanov.module2;

/**
 * Created by arzhanov on 09.04.17.
 */
public class LabWork_1_4_1 {
    public static void main(String[] args) {
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = (int) (Math.pow(2, 31) - 1);
        long longVar = (long) (Math.pow(2, 63) - 1);
        float floatVar = Float.MAX_VALUE;
        double doubleVar = Double.MAX_VALUE;
        boolean booleanVar = true;
        char charVar = 'A';

        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Integer: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Boolean: " + booleanVar);
        System.out.println("Character: " + charVar);
    }
}
