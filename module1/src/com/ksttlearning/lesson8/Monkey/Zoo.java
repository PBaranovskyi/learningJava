package com.ksttlearning.lesson8.Monkey;

/**
 * Created by citsym on 17.05.17.
 */
public class Zoo {

    public static void main(String[] args) {

        Monkey nency = new Monkey(5, "Nency");
        Monkey lucy = new Monkey(1, "Lucy");
        Monkey marina = new Monkey(7, "Marina");


        System.out.println(Monkey.getTotalBanans());


        Lion petya = new Lion();
        petya.eat();

        System.out.println(marina.getThisBananaCount());

        Zoo zoo = new Zoo();
        zoo.getRandomNumber();

        marina.drinkMilk();
        DrunkMonkey zhora = new DrunkMonkey(6, "Zhora");
        zhora.drinkMilk();
        System.out.println(DrunkMonkey.getTotalBanans());

    }

    public int getRandomNumber() {
        return 0;
    }
}
