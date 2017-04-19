package erik.module3;

import java.util.Scanner;

/**
 * Created by Erik Pavliuk on 14/04/2017.
 */
public class Work157 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = s.nextInt();
        for (int i = 2; i < number; i++) {
            int result = 0;
            for (int k = 1; k < i; k++)
                if (i % k == 0)
                    result += k;
            if (result == i)
                System.out.println("number " + i + "  Result is : " + result + " IT IS PERFECT NUMBER");
        }
    }
}
