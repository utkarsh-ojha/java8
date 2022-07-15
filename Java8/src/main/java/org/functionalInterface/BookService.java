package org.functionalInterface;

import java.util.Collections;
import java.util.List;

public class BookService {

    public List<Book> getSortedBooks() {
        List<Book> sortedBooks = new BookDAO().getBooks();

        Collections.sort(sortedBooks, (o1, o2) ->
                o1.getBookName().compareTo(o2.getBookName()));
        return sortedBooks;

    }

    public static void main(String[] args) {
        BookService obj = new BookService();
        System.out.println(obj.getSortedBooks());
    }
}
