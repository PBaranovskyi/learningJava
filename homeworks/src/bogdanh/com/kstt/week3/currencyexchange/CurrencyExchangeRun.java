package bogdanh.com.kstt.week3.currencyexchange;

import java.math.BigDecimal;

public class CurrencyExchangeRun {

    public static void main(String[] args) {
        BigDecimal amount = new BigDecimal("100000");
        BigDecimal exchangeRate = new BigDecimal("26.68");

        BigDecimal exchanged = new CurrencyConverter(exchangeRate).convert(amount);
        System.out.println(exchanged);
    }
}
