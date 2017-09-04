package ua.kstt.justymenko.practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Ustymenko on 09/04/17.
 */
public class Main {
    public static void main(String[] args) {
        List<String> tagsProgram = new ArrayList<>();
        tagsProgram.add(null);
        tagsProgram.add("self - learning");
        Article javaHorsman = new Article("Java for dummies", "Horsman", tagsProgram);

        Article javaShild = new Article("Java for dummies", "Shild", tagsProgram);

        List<String> tagsSport = new ArrayList<>();
        tagsSport.add("sport");
        tagsSport.add("competitions");
        Article sport = new Article("Sport for every1", "John Dow", tagsSport);

        List<String> tagsProgramJS = new ArrayList<>();
        tagsProgramJS.add("book");
        tagsProgramJS.add("JS self - learning");
        Article javaScript = new Article("JS for dummies", "John Dow", tagsProgram);

        List<String> tagsPolitical = new ArrayList<>();
        tagsPolitical.add("Tramp");
        tagsPolitical.add("Putin");
        tagsPolitical.add("Poroh");
        Article political = new Article("BBC", "Reporter", tagsPolitical);


        List<Article> articleList = new ArrayList<>();
        articleList.add(javaHorsman);
        articleList.add(javaShild);
        articleList.add(javaScript);
        articleList.add(sport);
        articleList.add(political);

        Article searchItem = getArticle(articleList, "java");
        if (searchItem != null) {
            System.out.println(searchItem.getAuthor());
        } else {
//            System.out.println("Article wasn't found");
            System.out.println(articleList.get(articleList.size() - 1).getAuthor());
        }


        //////////////////////////////

        Optional<Article> optionalSearchItem = getArticleJ8(articleList, "java");
        Optional<String> tag = optionalSearchItem
                .map(Article::getTags)
                .map(tags -> tags.get(1));
        tag.ifPresent(System.out::println);

        searchItem = optionalSearchItem.orElse(articleList.get(articleList.size() - 1));

        System.out.println(searchItem.getAuthor());

    }

    private static Article getArticle(List<Article> articleList, String titleValue) {
        for (Article article : articleList) {
            if (isContainsTitle(titleValue, article)) {
                return article;
            }
        }
        return null;
    }


    private static Optional<Article> getArticleJ8(List<Article> articleList, String titleValue) {
        Optional<Article> first = articleList.stream().filter(article -> isContainsTitle(titleValue, article)).findFirst();

        return first;

    }

    private static boolean isContainsTitle(String titleValue, Article article) {
        return article.getTitle().toLowerCase().contains(titleValue.toLowerCase());
    }
}
