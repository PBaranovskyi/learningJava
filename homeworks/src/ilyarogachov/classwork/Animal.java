package ilyarogachov.classwork;

/**
 * Created by rogachev on 24.05.17.
 */
public class Animal {
    private static int num;

    public Animal() {
        num++;
    }

    public static int countofanimals() {
        return num;
    }

    public void eat(){

        System.out.println("I'm eating other animals");
    }
}
