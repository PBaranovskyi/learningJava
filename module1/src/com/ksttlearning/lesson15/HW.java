package com.ksttlearning.lesson15;

import com.ksttlearning.lesson13.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by citsym on 05.07.17.
 */
public class HW {


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


        int num = calcNum(books.toArray(new Book[0]), third);

        System.out.println(num);



        calcNumBook(books, third);

    }


    public static <T extends Comparable<T>> int calcNum(T[] array, T maxValue){

        int count = 0;
        for (T item : array) {
            if (item.compareTo(maxValue) > 0){
                count++;
            }
        }
        return count;
    }


    public static <T extends Book> int calcNumBook(List<T> array, T maxValue){

        int count = 0;
        for (T item : array) {
            if (item.compareTo(maxValue) > 0){
                count++;
            }
        }
        return count;
    }

}
