package ua.kstt.justymenko.day8maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by n1kropol on 4/21/17.
 */
public class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map dicMap = new HashMap<String, Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            dicMap.put(name, phone);
        }

        while(in.hasNext()){
            String s = in.next();
            if (dicMap.get(s) != null){
                System.out.println(s + "=" + dicMap.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
