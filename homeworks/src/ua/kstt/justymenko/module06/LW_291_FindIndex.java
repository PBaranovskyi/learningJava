package ua.kstt.justymenko.module06;

/**
 * Created by n1kropol on 5/13/17.
 */
public class LW_291_FindIndex {
    public static void main(String[] args) {
        String myStr = "abracadabra";
        System.out.println(myStr.indexOf("ra"));
//        2
        System.out.println(myStr.lastIndexOf("ra"));
//        9
        System.out.println(myStr.substring(3,7));
//        acad
        System.out.println(reverseString(myStr));
//        arbadacarba
    }

    private static String reverseString(String str){
        StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString();
    }
}
