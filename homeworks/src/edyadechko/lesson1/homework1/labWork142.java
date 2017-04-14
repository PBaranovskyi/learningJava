package edyadechko.lesson1.homework1;

/**
 * Created by Evgeny on 12.04.2017.
 */
public class labWork142 {
    public static void main(String[] args) {

        int var1 = 57;
        int var2 = 89;
        double div = (double) var1/(double) var2;
        double percentVar2OfVar1 = ((double) var2*100)/(double) var1;

        System.out.println("Plus operation:" + (var1 + var2));
        System.out.println("Minus operation:" + (var1 - var2));
        System.out.println("Div operation:" + div);
        System.out.println("Multy operation:" + (var1*var2));
        System.out.println("Var2 is " + percentVar2OfVar1 + "% of Var1");
    }
}
