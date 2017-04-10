package com.ksttlearning;

import java.math.BigInteger;

/**
 * Created by Pavlo Baranovskyi on 4/4/2017.
 */
public class HelloWorld {

    public static void main(String[] args) {

        BigInteger bigInteger = new BigInteger("5345289347089");
        BigInteger bigInteger2 = new BigInteger("34534");

        System.out.println("BigInteger " +bigInteger.add(bigInteger2).multiply(bigInteger));


        short shortType = 100;
        byte byteType1 = 10;
        byte byteType2 = 5;

        shortType+=6000;
        byteType1 = (byte) shortType;


        double result = (double) 60 / 7 * 4 / 21;

        System.out.println("Ariphmetics " + result);

        System.out.println(byteType1);

        System.out.println("Hello world");
    }
}
