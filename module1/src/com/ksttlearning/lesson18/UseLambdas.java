package com.ksttlearning.lesson18;

/**
 * Created by citsym on 31.07.17.
 */
public class UseLambdas {

    static double basePrice = 99;
    static double accountPrice = 101;

    public static void main(String[] args) {


//        calculatePrice(basePrice, accountPrice, (basePrice1, accountPrice1) -> getMid(basePrice1, accountPrice1));
        calculatePrice(UseLambdas::getMid);
        calculatePrice((b, a) -> a / b);


        calculatePrice(new MidRateSupplier() {
            @Override
            public double getMidRate(double basePrice, double accountPrice) {
                return basePrice / accountPrice;
            }
        });


    }

    private static double getMid(double b, double a) {

        System.out.println("MidRate calculated");

        return a / b;
    }

    private static void calculatePrice(MidRateSupplier supplier) {


        System.out.println("Prepare some data logic performed");

        // some other logic
        // for example prepare other data
        System.out.println("Price Calculation started");

        double result = basePrice * supplier.getMidRate(basePrice, accountPrice) / 2;

        System.out.println("Price calculated");


    }


    @FunctionalInterface
    interface MidRateSupplier {

        double getMidRate(double basePrice, double accountPrice);

    }
}
