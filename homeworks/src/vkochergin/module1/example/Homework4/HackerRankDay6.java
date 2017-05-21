package vkochergin.module1.example.Homework4;

import java.util.Scanner;

/**
 * Created by Volodymyr Kochergin on 19.04.2017.
 */
public class HackerRankDay6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < t; i++) {
            String string = scanner.nextLine();
            String first = "";
            String second = "";
            for (int j = 0; j < string.length(); j++) {
                if (j % 2 == 0){
                    first = first + string.charAt(j);
                }
                else {
                    second = second + string.charAt(j);
                }
            }
            System.out.println(first + " " + second);
        }


    }
}
