package ltretykhlib.module1.example;

/**
 * Created by Tretykhlib on 07.04.2017.
 */
public class LogicalOperators {
    public static void main(String[] args) {
        boolean one = true;
        boolean two = true;

        if (one && two) {
            System.out.println("Both conditions are true.");
        } else {
            System.out.println("At least one is false.");

        }


        if (one || two) {
            System.out.println("One of conditions is true, so result true");
        } else {
            System.out.println("At least one is false, so result false");

        }


        if (one != two) {
            System.out.println("Different values ");
        } else {
            System.out.println("Same values");

        }

        boolean c = one ^ two;
        System.out.println("True if variable differs " + c);

    }


}
