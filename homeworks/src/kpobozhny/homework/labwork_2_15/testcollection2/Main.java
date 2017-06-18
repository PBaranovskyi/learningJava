package kpobozhny.homework.labwork_2_15.testcollection2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by kostya on 6/18/17.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(randomInt(0, i + 1), "num_" + i);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }

    private static int randomInt(int minBound, int maxBound) {
        int random = minBound + (int) (Math.random() * (maxBound - minBound));
        return random;
    }
}
