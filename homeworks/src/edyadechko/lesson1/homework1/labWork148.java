package edyadechko.lesson1.homework1;

/**
 * Created by Evgeny on 16.04.2017.
 */
public class labWork148 {

    public static void main(String[] args) {

        byte byte1 = 70;
        short short1 = 200;
        char ch1 = 'z';
        int int1 = 100;
        float float1 = 33.333F;
        double double1 = 57.33;
        double resultDouble = (double) byte1 + (double) short1 + (double) ch1 + (double) int1 + double1;
        char resultChar = (char) (float1 + (float) int1 + (float) byte1);

        System.out.println(resultDouble);
        System.out.println("" + resultChar);
    }
}