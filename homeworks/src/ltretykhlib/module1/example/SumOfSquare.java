package ltretykhlib.module1.example;

import java.util.Scanner;

/**
 * Created by Tretykhlib on 11.04.2017.
 */
public class SumOfSquare {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            i = sc.nextInt();
            sum += i * i;
            System.out.println(sum);
        }
    }


}

