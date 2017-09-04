package com.ksttlearning;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by citsym on 17.07.17.
 */
public class Lesson18 {


    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        Book vedmak = new Book("   Vedmak        ", "Anjey Sapkovskey", 500);
        books.add(vedmak);
        books.add(new Book("1985", "Oruel", 200));
        books.add(new Book("1985", "Oruel", 200));
        books.add(new Book("Harry Patter ", "Joana Rolling", 1000));
        books.add(new Book("Scotnyu dvor        ", "Oruel", 100));


//        List<Book> bookList = filter(books, (book) -> book.getPageCount() > 200);

//        System.out.println(bookList);


//        List<Book> bookSingleAutorWord = filter(books, (book) -> book.getAuthorName().equals("Oruel"));

//        System.out.println(bookSingleAutorWord);


//        saveObj(books, (book) -> {
//            try {
//                FileOutputStream out = new FileOutputStream("test.txt");
//                ObjectOutputStream oout = new ObjectOutputStream(out);
//                oout.writeObject(book);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });
//
//
//        saveObj(books, (book) -> {
//           System.out.println(book);
//        });


        saveObjToFile(() -> books.get(3));

        System.out.println("=============");

        books.stream()
                .filter((item) -> item.getPageCount() > 200)
                .forEach(System.out::println);

//        books.stream().peek( (book) -> {
//            try {
//                FileOutputStream out = new FileOutputStream("test.txt");
//                ObjectOutputStream oout = new ObjectOutputStream(out);
//                oout.writeObject(book);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });
//

//        books.stream()
//                .map((item) -> item.getName())
//                .forEach(System.out::println);

    }


//    public static List<Book> filter(List<Book> books, Predicate<Book> transformName) {
//        List<Book> filteredBooks = new ArrayList<>();
//
//        for (Book book : books) {
//            if (transformName.test(book)) {
//                filteredBooks.add(book);
//            }
//        }
//
//        return filteredBooks;
//
//    }


//    public static List<Book> saveObj(List<Book> books, Consumer<Book> action) {
//        List<Book> filteredBooks = new ArrayList<>();
//
//        for (Book book : books) {
//            action.accept(book);
//        }
//
//        return filteredBooks;
//
//    }


    public static void saveObjToFile(Supplier supplier){
        try {
            FileOutputStream out = new FileOutputStream("test.txt");
            ObjectOutputStream oout = new ObjectOutputStream(out);
            oout.writeObject(supplier.get());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
