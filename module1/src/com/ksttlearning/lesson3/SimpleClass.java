package com.ksttlearning.lesson3;

/**
 * Created by citsym on 12.04.17.
 */
public class SimpleClass {

    static String someValue = "TeSt";

    boolean bool;

    int i;

    public static void main(String[] args) {
        String someInnerValue = null;

        System.out.println(someInnerValue);


        System.out.println(someValue);
        method();
    }



    public static void method(){
        method2();
    }



    public static void method2(){

        method();
    }


}
