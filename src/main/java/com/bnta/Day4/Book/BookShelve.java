package com.bnta.Day4.Book;

import java.util.List;
import java.util.Objects;

public class BookShelve {
    private int maxNumberOfBooks;
    private List availableBooks;

    public BookShelve(int maxNumberOfBooks, List availableBooks) {
        this.maxNumberOfBooks = maxNumberOfBooks;
        this.availableBooks = availableBooks;
    }

    public int getMaxNumberOfBooks() {
        return maxNumberOfBooks;
    }

    public void setMaxNumberOfBooks(int maxNumberOfBooks) {
        this.maxNumberOfBooks = maxNumberOfBooks;
    }

    public List getAvailableBooks() {
        return availableBooks;
    }

    public void setAvailableBooks(List availableBooks) {
        this.availableBooks = availableBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookShelve that = (BookShelve) o;
        return maxNumberOfBooks == that.maxNumberOfBooks && Objects.equals(availableBooks, that.availableBooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxNumberOfBooks, availableBooks);
    }

    @Override
    public String toString() {
        return "BookShelve{" +
                "maxNumberOfBooks=" + maxNumberOfBooks +
                ", availableBooks=" + availableBooks +
                '}';
    }
}