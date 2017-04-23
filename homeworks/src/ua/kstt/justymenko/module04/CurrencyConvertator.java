package ua.kstt.justymenko.module04;

/**
 * Created by n1kropol on 4/22/17.
 * Конвертація валюти.Створити клас з методом convert(),
 * в якого буде в конструтор прийматися на вхід курс валюти і метод,
 * який братиме на вхід суму гривень, і повертатиме суму доларів,
 * яку можна отримати по даному курсу.
 */
public class CurrencyConvertator {
    private double currencyRate;

    public CurrencyConvertator(double currencyRate) {
        this.currencyRate = currencyRate;
    }

    public double convert(double amountUAH){
        return amountUAH / currencyRate;
    }

    public static void main(String[] args) {
        CurrencyConvertator convertor = new CurrencyConvertator(26.65);
        double result = convertor.convert(20000.00);
        System.out.println(String.format("%.2f", result));
    }
}
