package ua.kstt.justymenko.module06;

/**
 * Created by n1kropol on 5/13/17.
 */
public class LW_292_MatchStrings {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        StringBuilder builder = new StringBuilder();
/*        for (int i = 0; i < myStr1.length(); i++) {
            char finder = myStr1.charAt(i);
            char match;
            boolean isFinderPresent = false;
            for (int j = 0; j < myStr2.length(); j++) {
                match = myStr2.charAt(j);
                if (finder == match) {
                    isFinderPresent = true;
                    break;
                }
            }

            if (!isFinderPresent)
                builder.append(finder);
        }*/

        for (Character c : myStr1.toCharArray()) {
            if (myStr2.indexOf(c) == -1){
                builder.append(c);
            }
        }
        System.out.println(builder.toString());
//        Crn
    }
}
