package kpobozhny.homework.labwork_1_6;

import java.util.Scanner;

/**
 * Created by kostya on 4/30/17.
 */
/*
Task:
        Write a program, which finds in a given matrix the area of equal numbers.*/

public class labwork_1_6_7 {

    static void checkNumber(int n, int[][] array) {

        StringBuilder sb = new StringBuilder("");
        int start = -1, end = -1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == n) {
                    if (start < 0) {
                        start = j;
                    }
                    end = j;

                    if (j == array[i].length - 1) {
                        if (end == start) {
                            sb.append(end + ",");
                        } else {
                            sb.append(start + "-" + end + ",");
                        }

                    }


                } else {
                    if (end > -1) {
                        if (end == start) {
                            sb.append(end + ",");
                        } else {
                            sb.append(start + "-" + end + ",");
                        }

                    }
                    start = -1;
                    end = -1;
                }
            }
            start = -1;
            end = -1;
            //System.out.println();

            if (sb.length() != 0) {
                sb.delete(sb.length() - 1, sb.length());
                System.out.println("Line " + i + ": [" + sb + "]");
                sb.delete(0, sb.length());


            }

        }
    }

    public static void main(String[] args) {
        int[][] array = new int[4][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (10 * Math.random() % 4);
            }
        }


        System.out.println("Array:");
        System.out.println("---------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
            //System.out.println("---------------");
        }
        System.out.println();

        //////////
        int n;
        String inputString;
        boolean enteredCorrectValue = false;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter number n: ");
            inputString = scan.nextLine();

            try {
                n = Integer.parseInt(inputString);


                // set exit condition
                enteredCorrectValue = true;

                checkNumber(n, array);

            } catch (NumberFormatException e) {
                System.out.println("Invalid value. Try again.");
            }

        } while (!enteredCorrectValue);

        scan.close();
        ///////
    }
}
