package ua.kstt.justymenko.module06;

import java.util.StringTokenizer;

/**
 * Created by n1kropol on 5/14/17.
 */
public class LW_294_Tokenizer {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student:Name of Student";
        StringTokenizer tokenizerSpace = new StringTokenizer(myStr);
        StringTokenizer tokenizerComma = new StringTokenizer(myStr, ",");
        StringTokenizer tokenizerDot = new StringTokenizer(myStr, ".");

        System.out.println("=======Space=========");
        while (tokenizerSpace.hasMoreTokens())
            System.out.println(tokenizerSpace.nextToken());

        System.out.println("=======Comma=========");
        while (tokenizerComma.hasMoreTokens())
            System.out.println(tokenizerComma.nextToken());

        System.out.println("=======Dot=========");
        while (tokenizerDot.hasMoreTokens())
            System.out.println(tokenizerDot.nextToken());


    }
}
