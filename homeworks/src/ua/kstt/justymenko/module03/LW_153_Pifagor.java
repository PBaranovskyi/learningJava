package ua.kstt.justymenko.module03;

/**
 * Created by n1kropol on 4/11/17.
 */

/** TODO
 * do we need horizontal - vertical  headers?
 * if yes, it's another story points)
 */

public class LW_153_Pifagor {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(j * i + "\t");
            }
            System.out.println();
        }
    }
}
