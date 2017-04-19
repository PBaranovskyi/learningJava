package andriiarzhanov.com.hackerrank.Day8_Dictionaries_and_Maps;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by arzhanov on 19.04.17.
 */
public class Day8_Dictionaries_and_Maps {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            if (phoneBook.get(s) != null) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
