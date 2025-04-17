package com.xworks.Object.internal;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;
    private String genre;

    public Book(String title, String author, int price, String genre) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', price=" + price + ", genre='" + genre + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Book) {
            Book book = (Book) obj;
            if (Objects.equals(this.price, book.price)) {
                System.out.println("book is matching..");
                return true;
            }
        }
        return false;
    }
}