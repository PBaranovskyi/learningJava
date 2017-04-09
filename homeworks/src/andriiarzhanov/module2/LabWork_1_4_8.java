package andriiarzhanov.module2;

/**
 * Created by arzhanov on 09.04.17.
 */
public class LabWork_1_4_8 {
    public static void main(String[] args) {
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = (int) (Math.pow(2, 31)-1);
        long longVar = (long) (Math.pow(2, 63)-1);
        float floatVar = Float.MAX_VALUE;
        double doubleVar = Double.MAX_VALUE;
        char charVar = 'A';

        System.out.println("Byte in long: "+ (long)byteVar);
        System.out.println("Short in character: "+ (char)shortVar);
        System.out.println("Integer in float: "+ (float)intVar);
        System.out.println("Long in short: "+ (short)longVar);
        System.out.println("Float in int: "+ (int)floatVar);
        System.out.println("Double in byte: "+ (byte)doubleVar);
        System.out.println("Character in double: "+ (double)charVar);
    }
}
