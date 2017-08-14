package ua.kstt.justymenko.labdas;

import java.util.stream.IntStream;

/**
 * Created by n1kropol on 8/14/17.
 *
 */
public class MyStream {
    public static void main(String[] args) {
        IntStream.iterate(10, i -> i + 10)
        .limit(10)
        .map(n -> n  / 2)
        .filter(n -> n > 25)
        .sorted()  // how to sort desc?
        .forEach(System.out::println);
    }
}
