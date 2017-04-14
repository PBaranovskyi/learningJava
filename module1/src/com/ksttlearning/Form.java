package com.ksttlearning;

import java.util.Random;

/**
 * Created by citsym on 10.04.17.
 */
public class Form {

    public static void main(String[] args) {
        boolean isValidForm = false;

//        do {
//            System.out.println("Please fill the form correctly");
//            isValidForm = userFillTheForm();
//        } while (!isValidForm);

        while (!isValidForm) {
            System.out.println("Please fill the form correctly");
            isValidForm = userFillTheForm();
        };

        int some;
        some = 5;


    }

    private static boolean userFillTheForm() {
        return new Random().nextBoolean();
    }
}
