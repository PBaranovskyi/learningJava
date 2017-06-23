package ua.kstt.justymenko.module11.abstractHackerRank;

import java.util.Scanner;

/**
 * Created by n1kropol on 6/23/17.
 */
public class Solution {

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