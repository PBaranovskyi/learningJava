package vkochergin.module1.example.homework7.hackerrankday13;

import java.util.Scanner;

/**
 * Created by Volodymyr Kochergin on 28.04.2017.
 */
public class BookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();


    }
}
