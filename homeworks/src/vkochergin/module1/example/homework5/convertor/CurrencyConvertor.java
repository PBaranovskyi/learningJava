package vkochergin.module1.example.homework5.convertor;

/**
 * Created by Volodymyr Kochergin on 21.04.2017.
 */
public class CurrencyConvertor {
    private double incomeAmount;
    private double outcomeAmount;
    private double conversionRate;

    public CurrencyConvertor(double incomeCurrency, double conversionRate) {
        this.incomeAmount = incomeCurrency;
        this.conversionRate = conversionRate;
    }


    public void convert() {
        outcomeAmount = incomeAmount * conversionRate;
        System.out.println(outcomeAmount);
    }

}
