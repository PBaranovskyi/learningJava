package ilyarogachov.homework2;
import java.io.*;
import java.util.Scanner;

/**
 * Created by rogachev on 12.04.17.
 */
public class LabWork152 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a variable from 1 to 3: ");
        int num1 = scan.nextInt();
        String monthString;
        switch (num1) {
            case 1:  monthString = "Январь";
                System.out.println(monthString);
                break;
            case 2:  monthString = "Февраль";
                System.out.println(monthString);
                break;
            case 3:  monthString = "Март";
                System.out.println(monthString);
                break;
        }

    }
}
