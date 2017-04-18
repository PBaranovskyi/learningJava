package ltretykhlib.module1.example;

import java.util.Scanner;

/**
 * Created by Tretykhlib on 11.04.2017.
 */
public class Sum {

    public static void main(String[] args) {
        int sum = 0;
        double avg = 0;
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            counter++;
            avg = (double) sum / counter;
        }
        System.out.println(sum);
        System.out.println(avg);
    }

}
