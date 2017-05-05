package kpobozhny.homework.hw_04.currencyconverter;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by kostya on 4/22/17.
 */

/*Конвертація валюти.
        Створити клас з методом convert(),
        в якого буде в конструтор прийматися на вхід курсвалюти і метод,
        який братиме на вхід сумугривень, і повертатиме суму доларів,
        яку можнаотримати по даному курсу.*/

public class CurrencyConverter {

    private double rate;

    public CurrencyConverter(double rate) {
        this.rate = rate;
    }


    public double convert(double amount) {
        double converted = new BigDecimal(amount * rate).setScale(2, RoundingMode.UP).doubleValue();
        return converted;
        //return Math.round(amount*rate * Math.pow(10, 2)) / Math.pow(10, 2);

    }

    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter(0.037);
        double amountOfGryvna = 2560.75;
        System.out.println("For the " + amountOfGryvna + " UAH you can get " + currencyConverter.convert(amountOfGryvna) + " USD");
    }
}
