package com.bookstore.books.model;

public class Book {
    private static int nextId = 0;

    private int id;
    private String author;
    private String title;
    private Integer releaseYear;

    public Book(String author, String title, Integer releaseYear) {
        this.id = nextId++;
        this.author = author;
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }
}
