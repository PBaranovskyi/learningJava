package ua.kstt.justymenko.module09;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by n1kropol on 5/27/17.
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
        if (text == null || text.length() == 0)
            return new String[0];
        return text.split("; ");
    }


    /**
     * @param words array with words
     * @return array with unique words
     */
    public static String[] getUniqueWords(String[] words) {
        ArrayList<String> uniqueContainer = new ArrayList<>();
        for (String word : words) {
            if (!uniqueContainer.contains(word))
                uniqueContainer.add(word);
        }
        return uniqueContainer.toArray(new String[0]);
    }

    /**
     * @param uniqueWords array with unique words
     * @return sorted by natural order array of unique words
     */
    public static String[] sortWords(String[] uniqueWords) {
        Set<String> stringHashSet = new TreeSet<>();
        for (String uniqueWord : uniqueWords) {
            stringHashSet.add(uniqueWord);
        }
        return stringHashSet.toArray(new String[0]);
    }
}
