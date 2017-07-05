package kpobozhny.homework.labwork_2_9;

/**
 * Created by kostya on 5/13/17.
 */

/*Task:
        Create new project called TestStrings2. Add package “com.brainacad.oop.teststring2”.
        Create a class Main with a main() method.
        In method main() declare two local variables myStr1 and myStr2 of String type
        and assign a value “Cartoon” for first string and ”Tomcat” for second.
        Write code to display all of the letters, which are present in the first word, but absent in the second.*/

public class labwork_2_9_2 {

    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        checkLetters(myStr1, myStr2);

    }

    public static void checkLetters(String str1, String str2) {


        for (int i = 0; i < str1.length(); i++) {

            // preventing printing the same letter more then once
            if (str1.substring(i + 1).indexOf(str1.charAt(i)) == -1) {
                // checking whether letter is presented in the second string
                if (str2.indexOf(str1.charAt(i)) == -1) {
                    System.out.println(str1.charAt(i));
                }
            }


        }
    }
}
