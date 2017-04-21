package bogdanh.com.kstt.week2;

import java.util.Scanner;

public class Lab156 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Lab152.readANumber(sc);

        // the solution won't work for negative numbers
        System.out.println(sumSquareDigitsRec(number));
        System.out.println(sumSquareDigitsIter(number));
    }

    private static int sumSquareDigitsRec(int n) {
        if (n < 10) return n * n;
        return ((n % 10) * (n % 10)) + sumSquareDigitsRec(n / 10);
    }


    private static int sumSquareDigitsIter(int n) {

        int sum = 0;

        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }
}
