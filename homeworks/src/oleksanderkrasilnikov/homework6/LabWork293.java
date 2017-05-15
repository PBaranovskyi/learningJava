package oleksanderkrasilnikov.homework6;


public class LabWork293 {


    public static void main(String[] args) {
        String example = "Using methods of class String";
        char[] output = uniqueChars(example);

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }


    public static char[] uniqueChars(String inputValue) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputValue.length(); i++) {
            if (result.toString().indexOf(inputValue.charAt(i)) == -1) {
                result.append(inputValue.charAt(i));
            }
        }
        return result.toString().toCharArray();
    }


}
