package com.ksttlearning.lesson14;

/**
 * Created by citsym on 03.07.17.
 */
public class Visa<B extends Bank & Comparable<B>> extends CreditCard<B> {

    public Visa(B bank) {
        setBank(bank);
    }
}
