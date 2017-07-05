package ua.kstt.justymenko.module11.testMyGenerator;

import java.util.*;

/**
 * Created by n1kropol on 6/19/17.
 */
public class MyNumGeneratorSet {
    private int numOfElm;
    private int maxNumb;

    public MyNumGeneratorSet(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public Set generateDistinct(){
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numOfElm; i++) {
            set.add(random.nextInt(maxNumb));
        }
        return set;
    }

    public String myToString(Set list) {
        HashSet<Integer> hashSet = new HashSet<>();
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()){
            hashSet.add(integerIterator.next());
        }
        return hashSet.toString();
    }

    public static void main(String[] args) {
        MyNumGeneratorSet myNumGeneratorSet = new MyNumGeneratorSet(5, 64);
        Set myList = myNumGeneratorSet.generateDistinct();
        System.out.println(myNumGeneratorSet.myToString(myList));
    }

}
