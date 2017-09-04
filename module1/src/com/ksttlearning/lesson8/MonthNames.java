package com.ksttlearning.lesson8;

/**
 * Created by citsym on 12.06.17.
 */
public enum MonthNames {
    January(4), February(2), March(1), April, October, August,;


    private int holidaCount;

    MonthNames(int holidaCount) {

        this.holidaCount = holidaCount;
    }

    MonthNames() {
        this.holidaCount = 0;
    }

    public int getHolidaCount() {
        return holidaCount;
    }
}
