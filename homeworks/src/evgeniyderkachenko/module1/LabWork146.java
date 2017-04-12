package evgeniyderkachenko.module1;

/**
 * Created by Derkachenko on 09.04.2017.
 */
public class LabWork146 {
    public static void main(String[] args) {
        int a = 20;
        int b = 12;
        int c = a & b;
        int d = a | b;
        int e = a ^ b;
        int f = ~b;

        System.out.println("a&b= " + c);
        System.out.println("a|b= " + d);
        System.out.println("a^b = " + e);
        System.out.println("~b = " + f);
    }
}