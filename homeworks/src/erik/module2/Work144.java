package erik.module2;

/**
 * Created by Erik Pavliuk on 07/04/2017.
 */
public class Work144 {
    public static void main(String[] args) {
        int number1 = 12;
        long number2 = 0;
        System.out.println(number1++);
        System.out.println(number2--);
        System.out.println(--number2); // странное поведение с long
        System.out.println(++number1);
    }
}
