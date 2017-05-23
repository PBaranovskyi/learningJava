package ilyarogachov.homework5.home52;
import java.util.*;

/**
 * Created by rogachev on 22.05.17.
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