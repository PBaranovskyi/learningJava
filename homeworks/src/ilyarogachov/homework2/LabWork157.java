package ilyarogachov.homework2;

import java.util.Scanner;

/**
 * Created by rogachev on 14.04.17.
 */
public class LabWork157 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter sone number: ");
        double a = scan.nextInt();
        int k=0;
        for(int i = 1; i<a; i++){
            double f = a%i;
            if (f==0){
                 k=k+i;
                System.out.println(k);
            }
          }
    }
}
