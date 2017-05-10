package kpobozhny.homework.labwork_1_6;

/**
 * Created by kostya on 4/29/17.
 */


/*Task:
        Write a program, which creates square matrix like those in the figure below 
        and prints them formatted to the console.
        The size of the matrix is 4 x 4:*/

public class labwork_1_6_3 {

    public static void main(String[] args) {
        int[][] array=new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j]=(int)(100*Math.random()-50);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j]+" | ");
            }
            System.out.println();
        }
    }

}
