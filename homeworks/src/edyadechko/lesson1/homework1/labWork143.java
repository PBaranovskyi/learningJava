package edyadechko.lesson1.homework1;

/**
 * Created by Evgeny on 12.04.2017.
 */
public class labWork143 {
    public static void main(String[] args) {

        boolean troo = true;
        boolean fols = false;
        boolean result;

//AND operation
        if (troo && fols) {
            result = troo && fols;
            System.out.println("Result of operation: " + troo + " AND " + fols + " = " + result);
        } else {
            result = troo && fols;
            System.out.println("Result of operation: " + troo + " AND " + fols + " = " + result);
        }

//OR operation
        if (troo || fols) {
            result = troo || fols;
            System.out.println("Result of operation: " + troo + " OR " + fols + " = " + result);
        } else {
            result = troo || fols;
            System.out.println("Result of operation: " + troo + " OR " + fols + " = " + result);
        }

//NOT operation
        if (troo != fols) {
            result = troo != fols;
            System.out.println("Statement: " + troo + " NOT equal " + fols + " = " + result);
        } else {
            result = troo != fols;
            System.out.println("Statement: " + troo + " NOT equal " + fols + " = " + result);
        }

//XOR operation
        if (troo ^ fols) {
            result = troo ^ fols;
            System.out.println("Statement: " + troo + " XOR " + fols + " = " + result);
        } else {
            result = troo ^ fols;
            System.out.println("Statement: " + troo + " XOR " + fols + " = " + result);
        }

    }
}
