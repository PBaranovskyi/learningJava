package vkochergin.module1.example.homework7.hackerrankday13;

/**
 * Created by Volodymyr Kochergin on 28.04.2017.
 */
public class MyBook extends Book {

    int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
