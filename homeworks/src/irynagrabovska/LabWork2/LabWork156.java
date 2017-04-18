package irynagrabovska.LabWork2;

import java.util.Scanner;

/**
 * Created by whisper on 14-Apr-17.
 */
public class LabWork156 {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to analyze below: ");
        Scanner scan = new Scanner(System.in);
        int userNumber = scan.nextInt();
        int sum = 0;
        while (userNumber > 0) {
            sum += Math.pow(userNumber % 10, 2);
            userNumber /= 10;
        }
        System.out.println("Sum of squares of digits of your number is " + sum);
    }
}
