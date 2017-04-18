package alexandermelnychuk.homework1;

//Task: Write a console program that prints result of each of arithmetic logical (AND, OR, NOT, XOR) for two variables of boolean data type.

public class LabWork143 {
    public static void main(String[] args) {

        boolean first = false;
        boolean second = true;

        System.out.println(
                "Logical AND - " + (first && second) + "\n" +
                "Logical OR - " + (first || second) + "\n" +
                "Logical NOT - " + (!(first && second)) + "\n" +
                "Logical XOR - " + (first ^ second));
    }
}
