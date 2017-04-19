package vkochergin.module1.example.Homework4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Volodymyr Kochergin on 19.04.2017.
 */
public class HackerRankDay8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++) {

            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);

        }
        while (in.hasNext()) {

            String s = in.next();

            if (phoneBook.containsKey(s)) {

                System.out.println(s + "=" + phoneBook.get(s));

            } else {

                System.out.println("Not found");

            }
        }

        in.close();
    }
}
