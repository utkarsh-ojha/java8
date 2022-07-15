package org.functionalInterface;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(451, "BJava", 401));
        books.add(new Book(2456, "DJava", 402));
        books.add(new Book(43, "JJava", 403));
        books.add(new Book(455, "CJava", 404));
        books.add(new Book(54, "AJava", 405));
        return books;
    }
}
