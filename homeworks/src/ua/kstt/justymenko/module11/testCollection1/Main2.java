package ua.kstt.justymenko.module11.testCollection1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by n1kropol on 6/18/17.
 */
public class Main2 {
    public static void main(String[] args) {
        List<String> list = new LinkedList();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add("number_" + random.nextInt(10));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
