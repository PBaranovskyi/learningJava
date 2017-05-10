package oleksanderkrasilnikov.homework5;

import java.util.Random;

public class LabWork167 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[2][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(2);
            }
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print("Line " + i + ":");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int count = 0;
        int countSame = 0;
        int searchedValue = 1;
        String list = "";


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == searchedValue && count == 0) {
                    list = list + j;
                    count++;
                } else if (array[i][j] == searchedValue && array[i][j - 1] == searchedValue && countSame == 0) {
                    countSame++;
                } else if (array[i][j] != searchedValue && countSame != 0 && array[i][j - 1] == searchedValue) {
                    list = list + "-" + (j - 1);
                    countSame = 0;
                } else if (array[i][j] == searchedValue && count != 0 && countSame == 0) {
                    list = list + "," + j;
                } else if (array[i][j] == searchedValue && j == (array[i].length - 1) && array[i][j - 1] == searchedValue) {
                    list = list + "-" + j;
                }
            }
            if (count == 0) {
                System.out.println("Line " + i + ": does not contain searched value: " + searchedValue);
            } else {
                System.out.println("Line " + i + ": [" + list + "]");
            }
            count = 0;
            countSame = 0;
            list = "";
        }
    }

}
