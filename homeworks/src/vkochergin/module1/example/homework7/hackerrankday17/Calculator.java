package vkochergin.module1.example.homework7.hackerrankday17;

/**
 * Created by Volodymyr Kochergin on 04.05.2017.
 */
public class Calculator {

    int power(int n, int p) throws Exception {

        if (n >= 0 && p >= 0) {
            return (int) Math.pow(n, p);
        } else {
            throw new Exception("n and p should be non-negative");
        }

    }
}
