package com.ksttlearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 * Created by citsym on 26.06.17.
 */
public class UseString {


    public static void main(String[] args) {
        
        String text  = "Планеты солнечной системы делятся на два вида: внутренние (Меркурий и Венера), наблюдаемые только на сравнительно небольших угловых расстояниях от Солнца, и внешние (все остальные), которые могут наблюдаться на любых расстояниях. В гелиоцентрической системе это различие связано с тем, что орбиты Меркурия и Венеры всегда находятся внутри орбиты Земли (третьей от Солнца планеты), в то время как орбиты остальных планет находятся вне орбиты Земли.";

//        text = text.replaceAll("[-()+.^:,]", "");

//        String[] split = text.split("[-()+.^:, ]");

//        System.out.println(Arrays.toString(split));

        StringTokenizer st = new StringTokenizer(text.toLowerCase(), ":,.()- ");

        Set<String> uniqueStrings = new TreeSet<>();

        while (st.hasMoreElements()){
            uniqueStrings.add((String) st.nextElement());
        }

        List<String> list = new ArrayList<>(uniqueStrings);

        Collections.sort(list, Comparator.comparingInt(String::length).reversed().thenComparing(String::compareTo));
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() == o2.length()){
//                    return o1.compareTo(o2);
//                }
//
//                return o2.length() - o1.length();
//            }
//        });



        list.forEach(System.out::println);
    }
}
