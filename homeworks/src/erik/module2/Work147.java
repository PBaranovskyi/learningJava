package erik.module2;

/**
 * Created by Erik Pavliuk on 07/04/2017.
 */
public class Work147 {
    public static void main(String[] args) {
        int number1 = 100; //1000000024
        int number2 = 111;
        System.out.println(number2 > 1000 ? "maybe yes" : "maybe no");
        System.out.println((number1 * number2) >= 100 ? String.format("winner is : %d", number1) : number2);

    }
}
