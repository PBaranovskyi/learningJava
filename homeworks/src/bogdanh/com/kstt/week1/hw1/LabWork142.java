package bogdanh.com.kstt.week1.hw1;


//Write a console program that prints result of each of arithmetic operations (+, -, /, *, %) for two variables of primitive data types.

public class LabWork142 {

    public static void main(String[] args) {

        int num1 = 33;
        int num2 = 7;

        int addition = num1 + num2;
        int substraction = num1 - num2;
        double division = (double) num1 / num2;
        int multiplication = num1 * num2 * 100_000;
        int remainder = num1 % num2;

        System.out.println("+: " + addition);
        System.out.println("-: " + substraction);
        System.out.println("/: " + division);
        System.out.println("*: " + multiplication);
        System.out.println("%: " + remainder);
    }
}

