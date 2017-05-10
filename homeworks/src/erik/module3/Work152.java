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

        String number = "Bad Number";
        if(x==1)
            number = "One";
        else if(x==2)
            number = "Two";
        else if(x==3)
            number = "Three";
        else if(x==4)
            number = "Four";
        else if(x==5)
            number = "Five";
        System.out.println(number);
        System.out.println("\nEnter z<5: ");
        int z = input.nextInt();
        switch (z) {
            case 1:  number = "One";
                break;
            case 2:  number = "Two";
                break;
            case 3:  number = "Three";
                break;
            case 4:  number = "Four";
                break;
            case 5:  number = "Five";
                break;
        }
        System.out.println(number);
    }
}