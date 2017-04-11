package vkochergin.module1.example.Homework2;

import java.util.Scanner;

/**
 * Created by Volodymyr Kochergin on 11.04.2017.
 */
public class LabWork152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number, please:");

        //realisation with if statement:
        if (scanner.hasNext("1")){
            System.out.println("One");
        }
        else if (scanner.hasNext("2")){
            System.out.println("Two");
        }
        else if (scanner.hasNext("3")){
            System.out.println("Three");
        }
        else if (scanner.hasNext("4")){
            System.out.println("Four");
        }
        else if (scanner.hasNext("5")){
            System.out.println("Five");
        }
        else if (scanner.hasNext("6")){
            System.out.println("Six");
        }
        else if (scanner.hasNext("7")){
            System.out.println("Seven");
        }
        else if (scanner.hasNext("8")){
            System.out.println("Eigth");
        }
        else if (scanner.hasNext("9")){
            System.out.println("Nine");
        }
        else{
            System.out.println("Other");
        }


        //realisation with switch-case statement:
        String x = scanner.nextLine();
        switch (x){
            case "1":
                System.out.println("One");
                break;
            case "2":
                System.out.println("Two");
                break;
            case "3":
                System.out.println("Three");
                break;
            case "4":
                System.out.println("Four");
                break;
            case "5":
                System.out.println("Five");
                break;
            case "6":
                System.out.println("Six");
                break;
            case "7":
                System.out.println("Seven");
                break;
            case "8":
                System.out.println("Eigth");
                break;
            case "9":
                System.out.println("Nine");
                break;
            default:
                System.out.println("Other");
                break;

        }
    }
}
