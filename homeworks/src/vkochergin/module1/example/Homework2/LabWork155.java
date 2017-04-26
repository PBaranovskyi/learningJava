package vkochergin.module1.example.Homework2;

/**
 * Created by Volodymyr Kochergin on 11.04.2017.
 */
public class LabWork155 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 100;

        for (int i = 0; i <= n; i++){
            sum += i;
        }

        int avg = sum / n;

        System.out.println("The Sum is: " + sum);
        System.out.println("The Avg is " + avg);
    }
}
