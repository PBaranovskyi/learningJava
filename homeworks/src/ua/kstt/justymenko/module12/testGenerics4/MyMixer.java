package ua.kstt.justymenko.module12.testGenerics4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by n1kropol on 7/9/17.
 */
public class MyMixer<T> {
    T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public void shuffle(T[] arr){
//        T[] newArray = new Array[arr.length];
        Object[] objects;
        Random random = new Random();

        LinkedList list = new LinkedList(Arrays.asList(arr));
        while (!list.isEmpty()) {
            int num = random.nextInt(list.size());
            System.out.println(list.get(num));
            list.remove(num);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        String[] arr2 = {"a", "b", "c", "d", "e", "f"};
        MyMixer mixer = new MyMixer(arr);
        mixer.shuffle(arr);
        mixer.shuffle(arr2);
    }
}
