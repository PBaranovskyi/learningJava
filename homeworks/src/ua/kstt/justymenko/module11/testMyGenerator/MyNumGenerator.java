package ua.kstt.justymenko.module11.testMyGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by n1kropol on 6/18/17.
 */
public class MyNumGenerator {
    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List generate(){
        Random random = new Random();
        List<Integer> list = new ArrayList();
        for (int i = 0; i < numOfElm; i++) {
            list.add(random.nextInt(maxNumb));
        }
        return list;
    }

    public String myToString(List list) {
        List<Integer> list1 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            list1.add((Integer) list.get(i));
        }
        return list1.toString();
    }

    public static void main(String[] args) {
        MyNumGenerator myNumGenerator = new MyNumGenerator(5, 64);
        List myList = myNumGenerator.generate();
        System.out.println(myNumGenerator.myToString(myList));
    }
}
