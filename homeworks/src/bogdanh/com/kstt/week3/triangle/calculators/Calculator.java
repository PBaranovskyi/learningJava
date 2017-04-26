package bogdanh.com.kstt.week3.triangle.calculators;

import java.util.function.Function;

public final class Calculator {

    private Calculator() {
    }

    public static <T, R> R calculate(T shape, Function<T, R> formula) {
        return formula.apply(shape);
    }

}
