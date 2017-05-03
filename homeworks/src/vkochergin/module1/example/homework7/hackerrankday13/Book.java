package vkochergin.module1.example.homework7.hackerrankday13;

/**
 * Created by Volodymyr Kochergin on 28.04.2017.
 */
abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
