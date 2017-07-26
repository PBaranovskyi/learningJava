package ua.kstt.justymenko.labdas;

import java.util.*;

/**
 * Created by n1kropol on 7/25/17.
 */
public class Main {

    private static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 5) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }


    public static void main(String[] args) {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, (o1, o2) ->  o2 - o1 );
        System.out.println(Arrays.toString(arr));

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(getSaltString());
        }
        System.out.println(Arrays.toString(list.toArray()));
        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
        System.out.println(Arrays.toString(list.toArray()));
    }
}
