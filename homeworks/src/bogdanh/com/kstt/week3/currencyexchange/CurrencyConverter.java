package bogdanh.com.kstt.week3.currencyexchange;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConverter {

    private static final int SCALE = 2;
    private final BigDecimal exchangeRate;
    private static final RoundingMode DEFAULT_ROUNDING = RoundingMode.HALF_EVEN;

    public CurrencyConverter(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public BigDecimal convert(BigDecimal amount) {
        return amount.divide(exchangeRate, SCALE, DEFAULT_ROUNDING);
    }
}
