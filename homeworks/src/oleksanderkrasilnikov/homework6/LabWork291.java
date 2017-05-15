package oleksanderkrasilnikov.homework6;


public class LabWork291 {

    public static void main(String[] args) {
        String myStr = "abracadabra";
        int indexOfRa = myStr.indexOf("ra");
        int lastIndexOfRa = myStr.lastIndexOf("ra");
        String subStringOfMyStr = myStr.substring(3, 7);

        System.out.println(indexOfRa);
        System.out.println(lastIndexOfRa);
        System.out.println(subStringOfMyStr);
        System.out.println(reverseString(myStr));

    }

    public static String reverseString(String stringToReverse) {
        StringBuilder reversedString = new StringBuilder(stringToReverse);
        return reversedString.reverse().toString();
    }
}
