package ua.kstt.justymenko.module11.testCollection1;

import java.util.*;

/**
 * Created by n1kropol on 6/18/17.
 */
public class Main3 {
    public static void printElements(Collection collection){
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        List<String> arrList = new ArrayList();
        List<String> linkList = new LinkedList();

        for (int i = 0; i < 10; i++) {
            arrList.add("num_" + i);
            linkList.add("num_" + i);
        }

        System.out.println("ArrayList iterate via \"iterator loop\"");
        Iterator<String> arrListIterator = arrList.iterator();
        while (arrListIterator.hasNext()){
            System.out.println(arrListIterator.next());
        }

        System.out.println("LinkedList iterate via \"iterator loop\"");
        Iterator<String> linkedListIterator = linkList.iterator();
        while (linkedListIterator.hasNext()){
            System.out.println(linkedListIterator.next());
        }

        ListIterator<String> listIterator = arrList.listIterator();
        while (listIterator.hasNext()){
            linkList.add(listIterator.next());
        }

        while (listIterator.hasPrevious()){
            linkList.add(listIterator.previous());
        }

        System.out.println("arrList via printElements");
        printElements(arrList);
        System.out.println("linkList via printElements");
        printElements(linkList);
    }
}
