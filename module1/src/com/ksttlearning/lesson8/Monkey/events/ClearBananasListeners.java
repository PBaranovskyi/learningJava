package com.ksttlearning.lesson8.Monkey.events;

import com.ksttlearning.lesson8.Monkey.Monkey;

import java.util.Arrays;

/**
 * Created by citsym on 17.05.17.
 */
public class ClearBananasListeners {
    Monkey[] monkeys = new Monkey[0];

    public void addListener(Monkey monkey) {

        Monkey[] newMonkeys = Arrays.copyOf(monkeys, monkeys.length + 1);
        newMonkeys[newMonkeys.length - 1] = monkey;
        monkeys = newMonkeys;
    }

    public void fireClearBananasEvent() {
        for (Monkey monkey : monkeys) {
            monkey.clearBananas();
        }
    }
}
