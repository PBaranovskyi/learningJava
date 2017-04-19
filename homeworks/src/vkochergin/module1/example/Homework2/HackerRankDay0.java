package vkochergin.module1.example.Homework2;

import java.util.Scanner;

/**
 * Created by Volodymyr Kochergin on 11.04.2017.
 */
public class HackerRankDay0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, inputString.
        String inputString = scan.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");

        // TODO: Write a line of code here that prints the contents of inputString to stdout.
        System.out.println(inputString);
    }
}
