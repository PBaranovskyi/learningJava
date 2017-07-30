package ua.kstt.justymenko.labdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by n1kropol on 7/30/17.
 */
public class Predicats {

    public static Integer sumEven(Integer[] intArr, Predicate<Integer> integerPredicate){
        int sum = 0;
        for (Integer integer : intArr) {
            if (integerPredicate.test(integer)){
                sum += integer;
            }
        }
        return sum;
    }

    public static void printJStr(List<String> list, Predicate<String> condition){
        for(String name: list) {
            if(condition.test(name)) {
                System.out.println(name);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 4, 2, 3, 8, 10};
        Integer result = sumEven(arr,(arr2) -> arr2 % 2 == 0);
        System.out.println(result);

        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp", "JavaScript");
        printJStr(languages, (str) -> str.startsWith("J"));

//        http://javarevisited.blogspot.com/2014/02/10-example-of-lambda-expressions-in-java8.html
    }
}
