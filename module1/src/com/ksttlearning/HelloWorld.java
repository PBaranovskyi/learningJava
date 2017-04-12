package com.ksttlearning;

/**
 * Created by Pavlo Baranovskyi on 4/4/2017.
 */
public class HelloWorld {

    static int some;
    static boolean bool;
    String word;

    public static void main(String[] args) {
        String word ;
        int otherValue ;

//        System.out.println(word);

        System.out.println("Hello world");

        boolean ifIamStillYoung = true;
        String condition = "I`m young";

        doIHaveAPArty(ifIamStillYoung);
        doIHaveAPArty(condition);



        System.out.println(some);

    }

    private static void doIHaveAPArty(boolean ifIamStillYoung) {

        boolean notSick = true;
        boolean inGoodMood = true;


        if (ifIamStillYoung) {
            int some = 0;
            System.out.println("Have a party");
        } else if (notSick) {
            System.out.println("Have a party too");
        } else if (inGoodMood) {
            System.out.println("Definitely a party too");
        } else
            System.out.println("stay at home");
    }


    private static void doIHaveAPArty(String condition) {
        switch (condition){
            case "I`m not sick":
                System.out.println("Have a party too");
            case "I`m young":
                System.out.println("Have a party");
            case "In good mood":
                System.out.println("Definitely a party too");
            default:
                System.out.println("stay at home");

        }

    }

}

