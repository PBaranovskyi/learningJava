package com.ksttlearning.lesson14;

/**
 * Created by citsym on 03.07.17.
 */
public abstract class CreditCard<B extends Bank> {

    B bank;

    public void withdraw(int money){
        bank.acceptRequest();
    }

    public void setBank(B bank){
        this.bank = bank;
    }

    public B getBank(){
        return bank;
    }
}
