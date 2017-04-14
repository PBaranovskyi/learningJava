package ilyarogachov.homework2;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

/**
 * Created by rogachev on 13.04.17.
 */
public class LabWork156 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter sone int: ");
        int a = scan.nextInt();
        String n ;
        int len=2;
        while(len>=1){
            int f=a%10;
            System.out.println(Math.pow(f,2));
            if (len==1) {break;}
            a=a/10;
            n= Integer.toString(a);
            len=n.length();
        }

    }
}