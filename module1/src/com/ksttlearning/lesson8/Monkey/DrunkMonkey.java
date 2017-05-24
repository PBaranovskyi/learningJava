package com.ksttlearning.lesson8.Monkey;

/**
 * Created by citsym on 17.05.17.
 */
public class DrunkMonkey extends Monkey {

    public DrunkMonkey(int banaCount, String name) {
        super(banaCount, name);
    }


    @Override
    public void drinkMilk() {
        System.out.println("Drink Whiskey");
        super.drinkMilk();
    }

}
