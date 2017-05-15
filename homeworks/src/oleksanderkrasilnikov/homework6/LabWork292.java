package oleksanderkrasilnikov.homework6;

public class LabWork292 {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        System.out.println(compareTwoStrings(myStr1, myStr2));
    }

    public static String compareTwoStrings(String first, String second) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            if (second.indexOf(first.charAt(i)) == -1) {
                result.append(first.charAt(i));
            }
        }
        return result.toString();
    }
}
