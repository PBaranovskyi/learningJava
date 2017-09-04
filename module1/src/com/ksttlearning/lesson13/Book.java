package com.ksttlearning.lesson13;

/**
 * Created by citsym on 19.06.17.
 */
public class Book implements Comparable<Book>{

    private int pageCount;
    private String name;
    private int year;
    private String author;


    public Book(int pageCount, String name, int year, String author) {
        this.pageCount = pageCount;
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public int compareTo(Book o) {
        if (author.equals(o.getAuthor())){
            return name.compareTo(o.getName());
        }

        return this.author.compareTo(o.getAuthor());
    }

    @Override
    public String toString() {
        return "Book{" +
                "pageCount=" + pageCount +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                '}';
    }
}
