package vkochergin.module1.example.homework6;

/**
 * Created by Volodymyr Kochergin on 25.04.2017.
 * Create an array of all the even numbers from 2 to 30 (2,4,6...30) and display elements of the array to the screen.
 */
public class LabWork161 {
    public static void main(String[] args) {

        int[] myArray = new int[15];

        int count = 1;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = count * 2;
            count++;
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
