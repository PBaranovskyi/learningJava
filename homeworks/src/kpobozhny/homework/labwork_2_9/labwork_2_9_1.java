package kpobozhny.homework.labwork_2_9;

/**
 * Created by kostya on 5/13/17.
 */

/*Task:
        Create new project called TestStrings1. Add package “com.brainacad.oop.teststring1”.
        Create a class Main with a main() method.
        In method main() declare local variable myStr of String type and assign a value: “abracadabra”.

        Using the methods of the class String, do next steps:
        1) Find the index of first “ra” substring  of myStr value and print result to console.
        2) Find the index of last “ra” substring of myStr value and print result to console.
        3) Get substring of myStr from 3 to 7 char index and print result to console.
        4) Create static method reverseString(String) which return String value as result with changed order of letters
        (reverse it, for example “abcd” ->”dcba”).
        5) Invoke reverseString() method with myStr argument and print result to console.

        Execute the program.*/

public class labwork_2_9_1 {

    public static void main(String[] args) {
        String myStr = "abracadabra";
        System.out.println(myStr);
        System.out.println("-----------------------");
        // 1
        System.out.println(myStr.indexOf("ra"));
        // 2
        System.out.println(myStr.lastIndexOf("ra"));
        // 3
        System.out.println(myStr.substring(2, 7));

        // 5
        System.out.println(reverseString(myStr));

    }

    // 4
    public static String reverseString(String str) {
        char[] arr = str.toCharArray();
        char temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        return String.valueOf(arr);
    }
}
