package ltretykhlib.module1.example;

/**
 * Created by Tretykhlib on 09.04.2017.
 */
public class Ternary {
    public static void main(String[] args) {
        int goodMarkForHometask = 12;
        int badMarkForHometask2 = 6;
        boolean wellDone = true;

        int mark = wellDone ? goodMarkForHometask : badMarkForHometask2;
        System.out.println(mark);
        wellDone = false;
        int mark2 = wellDone ? goodMarkForHometask : badMarkForHometask2;
        System.out.println(mark2);

    }
}
