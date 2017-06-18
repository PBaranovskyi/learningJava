package kpobozhny.homework.labwork_2_15.testmygen;

import java.util.List;

/**
 * Created by kostya on 6/18/17.
 */
public class Main {
    public static void main(String[] args) {
        MyNumGenerator myNumGen = new MyNumGenerator(5, 64);
        List<Integer> list = myNumGen.generate();
        int size = list.size();

        System.out.print("[");
        for (int i = 0; i < size; i++) {

            System.out.print(list.get(i));
            if(i!=size-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
