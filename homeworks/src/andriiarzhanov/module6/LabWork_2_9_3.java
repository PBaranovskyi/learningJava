package andriiarzhanov.module6;

import java.util.ArrayList;

/**
 * Created by arzhanov on 14.05.17.
 */
public class LabWork_2_9_3 {
    public static void main(String[] args) {
        System.out.println(uniqueChars("Using methods of class String"));
    }

    public static char[] uniqueChars(String str) {
        ArrayList<Character> uniqueChars = new ArrayList<>();

        for (char c : str.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            }
        }
        return uniqueChars.toString().toCharArray();
    }
}
