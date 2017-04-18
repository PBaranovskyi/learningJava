package ltretykhlib.module1.example;

import java.util.Scanner;

/**
 * Created by Tretykhlib on 11.04.2017.
 */
public class SumOfSquare {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
       while (sc.hasNextInt()) {
           int i = sc.nextInt();
            String str= Integer.toString(i);
         for(int l=0; l<str.length(); l++){
           String ch= String.valueOf(str.charAt(l));
             int each=Integer.parseInt(ch);
             System.out.println(each);
             sum+=each*each;
         }
        System.out.println(sum);
        }
    }
}

