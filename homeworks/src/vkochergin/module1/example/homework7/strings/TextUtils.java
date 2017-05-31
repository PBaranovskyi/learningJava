package vkochergin.module1.example.homework7.strings;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by Volodymyr Kochergin on 31.05.2017.
 */
public class TextUtils {
    /**
     * Method contains inside of its body three another methods.
     * Each of this method defined below.
     *
     * @param text
     * @return sorted by natural order array of unique words
     */
    public static String[] getUniqueSortedWords(String text) {
//        TODO find mistake and correct it, so the method works correctly
        String[] words = getWords(text);
        String[] uniqueWords = getUniqueWords(words);
        return sortWords(words);
    }

    /**
     * @param text
     * @return array with words, get from receive text
     * if received argument is null
     * or text length is zero
     */
    public static String[] getWords(String text) {
        if (text == null || text.length() == 0) {
            return new String[0];
        }
        return text.split("; ");
    }


    /**
     * @param words array with words
     * @return array with unique words
     */
    public static String[] getUniqueWords(String[] words) {
        ArrayList<String> unique = new ArrayList<>();
        for (String word : words) {
            if (!unique.contains(word)) {
                unique.add(word);
            }
        }
        return unique.toArray(new String[0]);
    }

    /**
     * @param uniqueWords array with unique words
     * @return sorted by natural order array of unique words
     */
    public static String[] sortWords(String[] uniqueWords) {
        TreeSet<String> set = new TreeSet<>();
        for (String s: uniqueWords) {
            set.add(s);
        }
        return set.toArray(new String[0]);
    }
}
