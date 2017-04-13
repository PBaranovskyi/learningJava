package alexandermelnychuk.homework1;

//Task: Write a console program that prints result of each of arithmetic operations (+, -, /, *, %) for two variables of primitive data types.

public class LabWork142 {
    public static void main(String[] args) {

        int firstIntValue = 1986;
        int secondIntValue = 5;

        System.out.println("firstIntValue + secondIntValue = " + (firstIntValue + secondIntValue));
        System.out.println("firstIntValue - secondIntValue = " + (firstIntValue - secondIntValue));
        System.out.println("firstIntValue / secondIntValue = " + ((float) firstIntValue / (float) secondIntValue));
        System.out.println("firstIntValue * secondIntValue = " + (firstIntValue * secondIntValue));
        System.out.println("firstIntValue % secondIntValue = " + (firstIntValue % secondIntValue));
    }
}
