package kpobozhny.homework.labwork_1_5;

import java.util.Scanner;

/**
 * Created by kostya on 4/12/17.
 */

/*Task:
        Write a program that find and displays all perfect numbers from 1 to n
        (perfect number is a positive integer that is equal to the sum
        of its proper positive divisors, excluding the number itself).*/

public class labwork_1_5_7 {

    public static void main(String[] args) {
        int n, sum=0;
        String inputString;
        boolean enteredCorrectValue=false;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Enter number n: ");
            inputString = scan.nextLine();

            try {
                n = Integer.parseInt(inputString);

                if(n>1) {

                    for (int i = 1; i <= n; i++) {

                        for (int j = 1; j < i; j++) {

                            if(i%j==0){
                                sum+=j;
                            }

                        }

                        if(i==sum){
                            System.out.println(i);
                        }
                        sum=0;
                    }

                }

                // set exit condition
                enteredCorrectValue=true;

            } catch (NumberFormatException e) {
                System.out.println("Invalid value. Try again.");
            }

        }while(!enteredCorrectValue);

        scan.close();
    }

}
