package alexandermelnychuk.homework1;

//Task: Write a console program that prints result of increment and decrement in prefix and postfix mode for integer variable.

public class LabWork144 {
    public static void main(String[] args) {

        int someIntValue = 1;
        int someIntValue1 = 1;
        int someIntValue2 = 1;
        int someIntValue3 = 1;

        System.out.println(
                "Prefix increment  - " + ++someIntValue + "\n" +
                "Postfix increment - " + someIntValue1++ + "\n" +
                "Prefix decrement - " + --someIntValue2 + "\n" +
                "Postfix decrement - " + someIntValue3--);
    }
}
