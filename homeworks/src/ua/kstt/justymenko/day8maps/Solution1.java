package ua.kstt.justymenko.day8maps;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by n1kropol on 4/23/17.
 */
public class Solution1 {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("First");
        list.add("Second");
//        list.add(10); // runtime error
        List<String> list2 = list;
        for(Iterator<String> itemItr = list2.iterator(); itemItr.hasNext();)
            System.out.println(itemItr.next());
    }
}
