package ua.kstt.justymenko.module06;

import java.util.HashSet;

/**
 * Created by n1kropol on 5/14/17.
 */
public class LW_293_UniqueChars {
    public static void main(String[] args) {
        String basicStr = "Using methods of class String";
        System.out.println(uniqueChars(basicStr));
//      [U, s, i, n, g,  , m, e, t, h, o, d, f, c, l, a, S, r]
    }

    private static char[] uniqueChars(String s){
//        ArrayList<Character> container = new ArrayList<>();
//        for (char i : s.toCharArray()) {
//            if (!container.contains(i)){
//                container.add(i);
//            }
//        }

        HashSet<Character> characters = new HashSet<>();
        for (char i : s.toCharArray()) {
            characters.add(i);
        }
        return characters.toString().toCharArray();
    }
}
