package andriiarzhanov.module7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by arzhanov on 23.05.17.
 */
public class Calculation {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(intArray));
        System.out.println(MyMath.findMin(intArray));
        System.out.println(MyMath.findMax(intArray));


        System.out.println();

        Scanner scan = new Scanner(System.in);
        double radius = 0;


        System.out.println("Please enter number from 1 to 100(it can be double)");
        radius = scan.nextDouble();

        System.out.println("Calculating area for circle with radius "+ radius +": "+ MyMath.areaOfCircle(radius));
    }
}
