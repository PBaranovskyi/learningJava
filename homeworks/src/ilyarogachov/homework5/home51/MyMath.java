package ilyarogachov.homework5.home51;

import java.util.Arrays;

/**
 * Created by rogachev on 23.05.17.
 */
public class MyMath {

    public static int findMax(int [] arg){
        int max = Arrays.stream(arg).max().getAsInt();
        return max;

    }
    public static int findMin(int [] arg){
        int min = Arrays.stream(arg).min().getAsInt();
        return min;

    }
}