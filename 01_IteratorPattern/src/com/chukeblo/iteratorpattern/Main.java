package com.chukeblo.iteratorpattern;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	    BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("1984"));
        bookShelf.appendBook(new Book("King Lear"));
        bookShelf.appendBook(new Book("Frankenstein"));
        bookShelf.appendBook(new Book("Wuthering Heights"));

        // use Iterator explicitly
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // use extended for loop
        for (Book book: bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();
    }
}
