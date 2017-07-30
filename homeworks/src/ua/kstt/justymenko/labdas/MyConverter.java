package ua.kstt.justymenko.labdas;

/**
 * Created by n1kropol on 7/30/17.
 */

@FunctionalInterface
public interface MyConverter {

    /**
     * Convert a string to UpperCase.
     * @param str
     * @return
     */
    String convertStr(String str);


    default boolean isNull(String str) {
        return str.isEmpty();
    }
}
