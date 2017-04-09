package andriiarzhanov.module2;

/**
 * Created by arzhanov on 09.04.17.
 */
public class LabWork_1_4_3 {

    public static void main(String[] args) {
        boolean a = true, b = false;

        boolean isAND = a && b;
        boolean isOR = a || b;
        boolean isNOT = !a;
        boolean isXOR = a ^ !b;

        System.out.println("AND: "+ isAND);
        System.out.println("OR: "+ isOR);
        System.out.println("NOT: "+ isNOT);
        System.out.println("XOR: "+ isXOR);
    }
}
