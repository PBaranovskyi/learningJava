package com.ksttlearning.lesson8.Monkey;

import static com.ksttlearning.lesson8.Monkey.Monkey.*;

/**
 * Created by citsym on 17.05.17.
 */
public class Lion {


    public void eat(){
        System.out.println("Eats bananas :" + getTotalBanans());

        clearTotalBanansCount();

        System.out.println(totalBanans);

        System.out.println("bananas left:" + getTotalBanans());
    }
}
