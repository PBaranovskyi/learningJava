package com.ksttlearning.lesson8;

/**
 * Created by citsym on 12.06.17.
 */
public class CalculateHolidays {


    public static void main(String[] args) {


//        int holidaysCount =  calculateHolidays(MonthNames.January);

        for (MonthNames monthNames : MonthNames.values()) {
            System.out.println(monthNames.name() + " " + monthNames.getHolidaCount());
        }

//        System.out.println(MonthNames.January.getHolidaCount());
    }

//    private static int calculateHolidays(MonthNames month) {
//
//        switch (month){
//            case January: return 4;
//            case February: return 2;
//            case March: return 1;
//            default: return 0;
//
//        }
//
//    }
}
