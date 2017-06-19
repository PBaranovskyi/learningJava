package ua.kstt.justymenko.module11.testMap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by n1kropol on 6/18/17.
 */
public class MyTranslator {
    private HashMap<String, String> dictionary = new HashMap<>();

    public void addNewWord(String en, String ru){
        if (!en.isEmpty() || !ru.isEmpty()){
            dictionary.put(en, ru);
        }
    }

    public String translate(String en){
        if (en.isEmpty() || "".equals(en)){
            return "";
        }

        if (!dictionary.containsKey(en))
            return "";

        return dictionary.get(en);
    }

    public static void main(String[] args) throws IOException {
        MyTranslator myTranslator = new MyTranslator();
        myTranslator.addNewWord("cat", "кот");
        myTranslator.addNewWord("mouse", "мышь");
        myTranslator.addNewWord("caught", "поймал");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String engString = reader.readLine();
        reader.close();
        String[] arr = engString.split(" ");
        for (String s : arr) {
            String ruString = myTranslator.translate(s);
            if (!"".equals(ruString)){
                System.out.print(ruString + " ");
            }
        }
    }
}
