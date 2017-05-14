package andriiarzhanov.module6;

/**
 * Created by arzhanov on 14.05.17.
 */
public class LabWork_2_9_1 {
    public static void main(String[] args) {
        String myStr = "abracadabra";

        System.out.println(myStr.indexOf("ra"));
        System.out.println(myStr.lastIndexOf("ra"));
        System.out.println(myStr.substring(3, 7));
        System.out.println(reverseString(myStr));
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
