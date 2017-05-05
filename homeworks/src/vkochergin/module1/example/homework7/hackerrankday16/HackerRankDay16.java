package vkochergin.module1.example.homework7.hackerrankday16;

import java.util.Scanner;

/**
 * Created by Volodymyr Kochergin on 03.05.2017.
 */
public class HackerRankDay16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            int a = Integer.parseInt(S);
            System.out.println(a);
        } catch (Exception ex) {
            System.out.println("Bad String");
        }
    }
}
