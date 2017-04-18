package erik.module3;

import java.util.Scanner;

/**
 * Created by Erik Pavliuk on 14/04/2017.
 */
public class Work152 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter x<5: ");
        int x = input.nextInt();
        int z = input.nextInt();
        String other = "Bad Number";
        String number;
        if(x==1)
            System.out.println("One");
        else if(x==2)
            System.out.println("Two");
        else if(x==3)
            System.out.println("Three");
        else if(x==4)
            System.out.println("Four");
        else if(x==5)
            System.out.println("Five");
        else
            System.out.println(other);

        switch (z) {
            case 1:  number = "One";
                System.out.println(number);
                break;
            case 2:  number = "Two";
                System.out.println(number);
                break;
            case 3:  number = "Three";
                System.out.println(number);
                break;
            case 4:  number = "Four";
                System.out.println(number);
                break;
            case 5:  number = "Five";
                System.out.println(number);
                break;
            default: number = other;
                System.out.println(number);
                break;
        }
    }
}