package com.ksttlearning.lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by citsym on 19.06.17.
 */
public class UseSort {

    public static void main(String[] args) {


        Book first = new Book(30, "bukvar", 1987, "Koeljo");
        Book second = new Book(300, "Vedmak", 2000, "Polanik");
        Book third = new Book(220, "alhimik", 2001, "Koeljo");
        Book forth = new Book(600, "Potter", 1999, "Tetka");


        List<Book> books = new ArrayList<>();

        books.add(first);
        books.add(second);
        books.add(third);
        books.add(forth);

//        String[] strings = {"Pasha" , "nastya", "Anya", "Kolya"};
//
//        Arrays.sort(strings);
//
//        System.out.println(Arrays.toString(strings));
//
//        Object[] booksArray = books.toArray();
//        Book[] booksArr = books.toArray(new Book[0]);
//        Arrays.sort(booksArray);
//
//        System.out.println(Arrays.toString(booksArray));
//
//
//
//        List<String> listStrings = Arrays.asList(strings);
//
//        Collections.sort(listStrings);
//
//        System.out.println(listStrings);

//        Collections.sort(books);
//
//
//        System.out.println(books);
//
//
//        Collections.sort(books, (o1, o2) -> o2.getPageCount() - o1.getPageCount());
//
//
//        System.out.println(books);


        Map<String, Book> library = new TreeMap<String, Book>();

        library.put(first.getName() + " " + first.getAuthor(), first);
        library.put(second.getName() + " " + second.getAuthor(), second);
        library.put(third.getName() + " " + third.getAuthor(), third);
        library.put(forth.getName() + " " + forth.getAuthor(), forth);


        System.out.println(library);


//        Map<String, Book> library = new LinkedHashMap<>();
//
//        library.put(first.getName() + " " + first.getAuthor(), first);
//        library.put(second.getName() + " " + second.getAuthor(), second);
//        library.put(third.getName() + " " + third.getAuthor(), third);
//        library.put(forth.getName() + " " + forth.getAuthor(), forth);
//
//
//        System.out.println(library);



    }
}
