package kpobozhny.homework.labwork_2_15.testmygen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kostya on 6/18/17.
 */
public class MyNumGenerator {

    int numOfElm, maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List<Integer> generate(){

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numOfElm ; i++) {
            list.add((int)(Math.random()*maxNumb));
        }
        return list;
    }
}
