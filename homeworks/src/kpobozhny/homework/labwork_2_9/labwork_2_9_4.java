package kpobozhny.homework.labwork_2_9;

import java.util.StringTokenizer;

/**
 * Created by kostya on 5/13/17.
 */

/*Task:
        Create new project called TestTokennizer.
        Add package “com.brainacad.oop.teststokennizer”.
        Create a class Main with a main() method.
        In method main() declare local variables myStr add code which split a string by “space” “comma” and “.dot”
        delimiter using StringTokennizer  class, and iterate the StringTokenizer elements and print it out one by one to console.
        String myStr = “This is String, split by StringTokenizer. Created by Student:Name of Student”.
        Execute the program.*/

public class labwork_2_9_4 {

    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student: Pobozhny";
        System.out.println(myStr);

        //split string by space
        System.out.println();
        System.out.println("--- split string by space");
        StringTokenizer sTok01=new StringTokenizer(myStr);
        while (sTok01.hasMoreElements()){
            System.out.println(sTok01.nextElement());
        }

        //split string by comma
        System.out.println();
        System.out.println("--- split string by comma");
        StringTokenizer sTok02=new StringTokenizer(myStr, ",");
        while (sTok02.hasMoreElements()){
            System.out.println(sTok02.nextElement());
        }

        //split string by dot
        System.out.println();
        System.out.println("--- split string by dot");
        StringTokenizer sTok03=new StringTokenizer(myStr, ".");
        while (sTok03.hasMoreElements()){
            System.out.println(sTok03.nextElement());
        }

    }
}
