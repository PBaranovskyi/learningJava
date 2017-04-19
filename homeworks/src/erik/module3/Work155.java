package erik.module3;

import java.util.Scanner;

/**
 * Created by Erik Pavliuk on 14/04/2017.
 */
public class Work155 {

    public static void main(String[] args) {
        System.out.println("Please enter the number :");
        Scanner s = new Scanner(System.in);
        int str = s.nextInt();
        int a=0;
        for (double i=1; i<=str; i++){
            a+=i;
            System.out.println("The sum is: " + a);
            System.out.println("The avg is: " + a/i);
        }
    }
    }
