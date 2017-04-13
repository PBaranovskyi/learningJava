package ilyarogachov;

import jdk.nashorn.internal.ir.WhileNode;

/**
 * Created by rogachev on 13.04.17.
 */
public class LabWork156 {
    public static void main(String[] args) {
        int a=53;

        int k=a/10;
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