package ua.kstt.justymenko.module02;

/**
 * Created by n1kropol on 4/8/17.
 */
public class LabWork148 {
    public static void main(String[] args) {
        byte    aByte   = 127;
        short   aShort  = 32767;
        int     anInt   = 2147483647;
        long    aLong   = 9223372036854775807L;
        float   aFloat  = 234.5f;
        double  aDouble = 123.4;
        char    aChar   = 'A';
        boolean aBoolean= true;

        System.out.println("byte in short " +    (short) aByte);
        System.out.println("short in int "+      (int) aShort);
        System.out.println("int in long "+       (long) anInt);
        System.out.println("long in float "+   (float) aLong);
        System.out.println("float in double "+   (double) aFloat);
        System.out.println("char in double "+   (double) aChar);
        System.out.println("double in char "+   (char) aDouble);

        System.out.println();
        System.out.println("double in float " + (float) aDouble);
        System.out.println("float in long " + (long) aFloat);
        System.out.println("long in int " + (int)aLong); // -1, lets discuss why
        System.out.println("int in short " + (short) anInt);
        System.out.println("short in byte " + (byte) aShort);
    }
}
