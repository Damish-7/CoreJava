package com.xworkz.overrided.internal;

public class Book {
    private String name;
    private int book_id;

    public Book(String name,int book_id) {
        System.out.println("A new book is added to the collection");
    }

    public void read() {
        System.out.println("Reading a book");
    }
    @Override
    public String toString(){
        return "Book name"+name+"Book_id"+book_id;
    }
}
