package ua.kstt.justymenko.practice1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ustymenko on 09/04/17.
 */
public class Main {
    public static void main(String[] args) {
        List<String> tagsProgram = new ArrayList<>();
        tagsProgram.add("book");
        tagsProgram.add("self - learning");
        Article javaHorsman = new Article("Java for dummies", "Horsman", tagsProgram);

        Article javaShild = new Article("Java for dummies", "Shild", tagsProgram);

        List<String> tagsSport = new ArrayList<>();
        tagsSport.add("sport");
        tagsSport.add("competitions");
        Article sport = new Article("Sport for every1", "John Dow", tagsSport);

        List<String> tagsPolitical = new ArrayList<>();
        tagsPolitical.add("Tramp");
        tagsPolitical.add("Putin");
        tagsPolitical.add("Poroh");
        Article political = new Article("BBC", "Reporter", tagsPolitical);

        List<String> tagsProgramJS = new ArrayList<>();
        tagsProgram.add("book");
        tagsProgram.add("JS self - learning");
        Article javaScript = new Article("JS for dummies", "John Dow", tagsProgram);


        List<Article> articleList = new ArrayList<>();
        articleList.add(javaHorsman);
        articleList.add(javaShild);
        articleList.add(javaScript);
        articleList.add(sport);
        articleList.add(political);
        try{
            Article searchItem = getArticle(articleList, "BBC");
            System.out.println(searchItem.getAuthor());
        } catch (NullPointerException e){
            System.out.println("Article wasn't found");
        }
    }

    private static Article getArticle(List<Article> articleList, String titleValue) {
        for (Article article : articleList) {
            if(article.getTitle().contains(titleValue)){
                return article;
            }
        }
        return null;
    }
}
