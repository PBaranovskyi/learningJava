package andriiarzhanov.module3;

/**
 * Created by arzhanov on 11.04.17.
 */
public class LabWork_1_5_6 {

    public static void main(String[] args) {
        int number = Integer.MAX_VALUE, digit = 0, sum = 0;

        System.out.println("Number: "+number);
        while (number > 0) {
            digit = (int)Math.pow(number % 10, 2);
            System.out.print(digit);

            sum = sum + digit;
                    number = number / 10;
            if(number == 0) {
                System.out.print("=");
            } else {
                System.out.print("+");
            }
        }
        System.out.println(sum);
        System.out.println("Sum of squares of digits of number: "+sum);
    }
}
