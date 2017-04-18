package irynagrabovska.LabWork2;

import java.util.Scanner;

/**
 * Created bb whisper on 14-Apr-17.
 */
public class LabWork152 {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = inputStream.nextInt();
        int b = inputStream.nextInt();

        if (a == 1)
            System.out.println("One");
        else if (a == 2)
            System.out.println("Two");
        else if (a == 3)
            System.out.println("Three");
        else if (a == 4)
            System.out.println("Four");
        else if (a == 5)
            System.out.println("Five");
        else if (a == 6)
            System.out.println("Six");
        else if (a == 7)
            System.out.println("Seven");
        else if (a == 8)
            System.out.println("Eight");
        else if (a == 9)
            System.out.println("Nine");
        else
            System.out.println("Other");
        switch (b) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Other");
        }
    }
}