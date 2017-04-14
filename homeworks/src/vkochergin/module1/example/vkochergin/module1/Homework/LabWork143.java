package vkochergin.module1.example.vkochergin.module1.Homework;

/**
 * Created by Volodymyr Kochergin on 07.04.2017.
 */
public class LabWork143 {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;

        if (firstValue && secondValue) {
            System.out.println(firstValue);
        } else System.out.println(secondValue);

        if (firstValue || secondValue) {
            System.out.println(firstValue);
        } else System.out.println(secondValue);

        if (firstValue != secondValue) {
            System.out.println(firstValue);
        } else System.out.println(secondValue);

        if (firstValue ^ secondValue) {
            System.out.println(firstValue);
        } else System.out.println(secondValue);

    }
}
