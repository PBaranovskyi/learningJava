package oleksanderkrasilnikov.homework6;


public class LabWork295 {


    public static void main(String[] args) {
        String[] arr = {"VOVA", "Ivan", "R2d2", "ZX", "Ann", "12345", "ToAd", "TomCat", " "};

        for (int i = 0; i < arr.length; i++) {
            if (checkPersonWithRegExp(arr[i])) {
                System.out.println("Verification Passed");
            } else {
                System.out.println("Verification Failed");
            }
        }
    }

    public static boolean checkPersonWithRegExp(String userNameString) {
        boolean result = false;
        if (Character.isUpperCase(userNameString.charAt(0))) {
            for (int i = 1; i < userNameString.length(); i++) {
                if (Character.isLetter(userNameString.charAt(i)) && Character.isLowerCase(userNameString.charAt(i))) {
                    result = true;
                } else {
                    return false;
                }
            }
        }
        return result;
    }
}

