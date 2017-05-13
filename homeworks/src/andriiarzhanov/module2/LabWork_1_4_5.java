package andriiarzhanov.module2;

/**
 * Created by arzhanov on 09.04.17.
 */
public class LabWork_1_4_5 {
    public static void main(String[] args) {
        int a = 10, b = 0;

        b = a << 1;
        System.out.println(Integer.toBinaryString(a)+"("+a+")<<1 = "+Integer.toBinaryString(b)+"("+b+")");

        b = a >> 1;
        System.out.println(Integer.toBinaryString(a)+"("+a+")>>1: "+Integer.toBinaryString(b)+"("+b+")");

        b = a >>> 1;
        System.out.println(Integer.toBinaryString(a)+"("+a+")>>>1: "+Integer.toBinaryString(b)+"("+b+")");
    }
}
