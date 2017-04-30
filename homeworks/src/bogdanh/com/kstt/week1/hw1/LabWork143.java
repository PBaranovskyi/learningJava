package bogdanh.com.kstt.week1.hw1;


//Write a console program that prints result of each of arithmetic logical (AND, OR, NOT, XOR) for two variables of boolean data type.

public class LabWork143 {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        System.out.println("AND: " + (a && b));
        System.out.println("OR: " + (a || b));
        System.out.println("NOT: " + !(a && b));
        System.out.println("XOR: " + (a ^ b));
    }
}

