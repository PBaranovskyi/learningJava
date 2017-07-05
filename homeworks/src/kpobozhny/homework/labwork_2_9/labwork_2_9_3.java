package kpobozhny.homework.labwork_2_9;

/**
 * Created by kostya on 5/13/17.
 */

/*Task:
        Create new project called TestStrings3. Add package “com.brainacad.oop.teststring3”.
        Create a class Main with a main() method.
        1) Create static method: uniqueChars(String s), which must  take a String as argument
        and return an array of distinct (unique) chars (char[]) of the given string.
        2) In method main() add code to invoke uniqueChars() method and pass string:
        “Using methods of class String” as argument.
        3) Print result to console.
        Execute the program.*/

public class labwork_2_9_3 {

    public static void main(String[] args) {
        System.out.println(String.valueOf(uniqueChars("Using methods of class String")));
    }


    // we assume here that, for example, 's' and 'S' are considered as 2 different chars.
    public static char[] uniqueChars(String s) {
        StringBuilder sb = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {

            // preventing printing the same letter more then once
            if (s.substring(i + 1).indexOf(s.charAt(i)) == -1) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString().toCharArray();
    }
}
