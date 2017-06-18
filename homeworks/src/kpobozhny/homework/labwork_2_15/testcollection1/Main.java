package kpobozhny.homework.labwork_2_15.testcollection1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kostya on 6/18/17.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add("number_"+i);

        }

        for (String s : list) {
            System.out.println(s);
        }
    }


}
