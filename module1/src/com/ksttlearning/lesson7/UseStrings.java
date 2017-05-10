package com.ksttlearning.lesson7;

/**
 * Created by citsym on 10.05.17.
 */
public class UseStrings {

    public static void main(String[] args) {

//        String first = "First";
//        String last = "First";
//
//
//        if (first == "First") {
//            System.out.println(true);
//        }
//
//        test();
//
//
        String str = "Its methods do not 34 distinguish 2 among 345 identifiers, numbers, and quoted strings";
//
//
//        StringTokenizer s1 = new StringTokenizer(str);
//
//        int count = 0;
//
//        while (s1.hasMoreTokens()) {
//            count++;
//            if (count % 2 == 0) {
//                System.out.println(s1.nextToken(" "));
//            } else {
//                System.out.println(s1.nextToken(","));
//            }
//        }


        String[] split = str.split(".d+");

        for (String s : split) {
            System.out.println(s);
        }

    }

    public static void test() {
        String var = "SomeS";
        int index = var.indexOf('S');

        String substring = var.substring(1, 3);
        System.out.println(index);

    }
}
