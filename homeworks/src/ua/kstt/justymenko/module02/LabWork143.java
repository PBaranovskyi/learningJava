package ua.kstt.justymenko.module02;

/**
 * Created by n1kropol on 4/8/17.
 */
public class LabWork143 {
    public static void main(String[] args) {
        boolean i = true;
        boolean j = false;

        boolean aAnd    = i && j;
        boolean aOr     = i || j;
        boolean aNotI   = !i;
        boolean aNotJ   = !i;
        boolean aXor    = i ^ j;

        System.out.println("i AND j = " +   aAnd);
        System.out.println("i OR j = " +    aOr);
        System.out.println("NOT i = " +     aNotI);
        System.out.println("NOT j = " +     aNotJ);
        System.out.println("i XOR j = " +   aXor);
    }
}
