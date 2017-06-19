package ua.kstt.justymenko.module11.testCollection1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by n1kropol on 6/18/17.
 */
public class Main1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("number_" + i);
            System.out.println(list.get(i));
        }
        
    }
}
