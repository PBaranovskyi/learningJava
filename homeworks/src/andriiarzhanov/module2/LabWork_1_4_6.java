package andriiarzhanov.module2;

/**
 * Created by arzhanov on 09.04.17.
 */
public class LabWork_1_4_6 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 0;

        c = a & b;
        System.out.println("AND: "+Integer.toBinaryString(a)+"&"+Integer.toBinaryString(b)+"="+c);

        c = a | b;
        System.out.println("OR: "+Integer.toBinaryString(a)+"|"+Integer.toBinaryString(b)+"="+c);

        c = a ^ b;
        System.out.println("XOR: "+Integer.toBinaryString(a)+"^"+Integer.toBinaryString(b)+"="+c);

        c = ~a;
        System.out.println("NOT: ~"+Integer.toBinaryString(a)+"="+c);

    }
}
