package andriiarzhanov.module6;

/**
 * Created by arzhanov on 14.05.17.
 */
public class LabWork_2_9_2 {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        String resultStr = "";
        char findChar;

        for (int i = 0; i < myStr1.length(); i++) {
            findChar = myStr1.charAt(i);
            boolean findFlag = false;
            for (int i1 = 0; i1 < myStr2.length(); i1++) {
                if (myStr2.charAt(i1) == findChar) {
                    findFlag = true;
                    break;
                }
            }
            if (!findFlag)
                resultStr = resultStr + findChar;
        }
        System.out.println(resultStr);
    }
}
