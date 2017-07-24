package oleksanderkrasilnikov.lesson7;

import java.util.*;

/**
 * Created by Krasilnikov on 26.06.2017.
 */
public class Main {

    public static void main(String[] args) {
        String artikle = "The Sun is a G-type main-sequence star (G2V) based on its spectral class. As such, it is informally referred to as a yellow dwarf. It formed approximately 4.6 billion[a][9][18] years ago from the gravitational collapse of matter within a region of a large molecular cloud. Most of this matter gathered in the center, whereas the rest flattened into an orbiting disk that became the Solar System. The central mass became so hot and dense that it eventually initiated nuclear fusion in its core. It is thought that almost all stars form by this process.";
        artikle = artikle.replaceAll("[^a-zA-Z0-9 -]", "");
        List<String> notUniceWords = new ArrayList<>(Arrays.asList(artikle.split(" ")));
        Set<String> uniceWords = new TreeSet<>(notUniceWords);
        List<String> uuniceWordsList = new ArrayList<>(uniceWords);
        //Collections.sort(uuniceWordsList, (o1, o2) -> o2.length() - o1.length());
        uuniceWordsList.sort(Comparator.comparing(String::length).reversed().thenComparing(String::compareTo));
        uuniceWordsList.forEach(System.out::println);
    }
}
