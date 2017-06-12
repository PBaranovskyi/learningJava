package com.ksttlearning.lesson11;

/**
 * Created by citsym on 31.05.17.
 */
public class Square extends Rectangle {

    public Square(int a) {
        super(a, a);
    }


    @Override
    public String toString() {
        return "Square{ a =" + a +  "}";
    }
}
