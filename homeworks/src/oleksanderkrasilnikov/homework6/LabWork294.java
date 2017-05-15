package oleksanderkrasilnikov.homework6;

import java.util.StringTokenizer;

public class LabWork294 {

    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student:Name of Student";

        StringTokenizer split = new StringTokenizer(myStr, " ,.");
        while(split.hasMoreElements()){
            System.out.println(split.nextElement());
        }
    }


}
