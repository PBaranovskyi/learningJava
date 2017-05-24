package com.ksttlearning.lesson8.Monkey;

import com.ksttlearning.lesson8.Monkey.events.ClearBananasListeners;

/**
 * Created by citsym on 17.05.17.
 */
public class Monkey extends Mammal {

    private String name;
    static int totalBanans;
    private int thisBananaCount;
    static ClearBananasListeners register = new ClearBananasListeners();


    public Monkey(int banaCount, String name) {
        this.thisBananaCount = banaCount;
        this.totalBanans += banaCount;
        this.name = name;

        register.addListener(this);
    }

    public static int getTotalBanans() {
        return totalBanans;
    }

    public static void clearTotalBanansCount() {
        register.fireClearBananasEvent();
        Monkey.totalBanans = 0;
    }


    public void clearBananas() {
        thisBananaCount = 0;
    }


    public int getThisBananaCount() {
        return thisBananaCount;
    }
}
