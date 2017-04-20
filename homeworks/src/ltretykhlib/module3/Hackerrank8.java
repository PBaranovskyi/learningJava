package ltretykhlib.module3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Tretykhlib on 20.04.2017.
 */
public class Hackerrank8 {
    public static void main(String[] argh) {
        Map<String, String> map = new HashMap<String, String>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, Integer.toString(phone));

        }
        while (in.hasNext()) {
            String s = in.next();
            if (map.get(s) != null) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
