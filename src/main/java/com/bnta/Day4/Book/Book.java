package com.bnta.Day4.Book;

import java.util.Objects;

public class Book {
    private String title;
    private String Author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        Author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(Author, book.Author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, Author, year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", Author='" + Author + '\'' +
                ", year=" + year +
                '}';
    }
}
