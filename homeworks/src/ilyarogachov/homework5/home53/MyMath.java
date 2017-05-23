package ilyarogachov.homework5.home53;
import java.util.*;

/**
 * Created by rogachev on 22.05.17.
 */
public class MyMath {
    public static final double PI = 3.141592653589793;
    public static int findMax(int [] arg){
        int max = Arrays.stream(arg).max().getAsInt();
        return max;

    }
    public static int findMin(int [] arg){
        int min = Arrays.stream(arg).min().getAsInt();
        return min;

    }

    public static double area(int radius) {

        double ar = PI * Math.pow(radius, 2);
        return ar;
    }

}