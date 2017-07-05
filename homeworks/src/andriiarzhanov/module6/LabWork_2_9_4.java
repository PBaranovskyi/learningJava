package andriiarzhanov.module6;

import java.util.StringTokenizer;

/**
 * Created by arzhanov on 14.05.17.
 */
public class LabWork_2_9_4 {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student: Arzhanov";
        StringTokenizer myStrTokenizer1 = new StringTokenizer(myStr);
        StringTokenizer myStrTokenizer2 = new StringTokenizer(myStr, ",");
        StringTokenizer myStrTokenizer3 = new StringTokenizer(myStr, ".");

        System.out.println("--------");
        while (myStrTokenizer1.hasMoreTokens())
            System.out.println(myStrTokenizer1.nextToken());

        System.out.println("--------");
        while (myStrTokenizer2.hasMoreTokens())
            System.out.println(myStrTokenizer2.nextToken());

        System.out.println("--------");
        while (myStrTokenizer3.hasMoreTokens())
            System.out.println(myStrTokenizer3.nextToken());
    }
}
