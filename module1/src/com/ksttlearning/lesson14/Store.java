package com.ksttlearning.lesson14;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by citsym on 03.07.17.
 */
public class Store<T extends Item> {

    Queue<T> queue = new LinkedList<>();

    public T buy(CreditCard creditCard) {

        T item = queue.poll();

        creditCard.withdraw(item.getPrice());
        return item;
    }

}
