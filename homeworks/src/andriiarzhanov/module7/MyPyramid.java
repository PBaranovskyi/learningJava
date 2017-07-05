package andriiarzhanov.module7;

import java.util.Scanner;

/**
 * Created by arzhanov on 23.05.17.
 */
public class MyPyramid {
    public static void printPyramid(int h) {
        for (int i = 1; i <= h; i++) {

            for (int i1 = i; i1 <= h; i1++) {
                System.out.print(" ");
            }
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i1);
            }
            for (int i1 = i - 1; i1 > 0; i1--) {
                System.out.print(i1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = 1;


        System.out.println("Please enter number from 1 to 9");
        height = scan.nextInt();
        height = height < 9 ? height : 9;

        if (height != 0)
            MyPyramid.printPyramid(height);
    }
}
