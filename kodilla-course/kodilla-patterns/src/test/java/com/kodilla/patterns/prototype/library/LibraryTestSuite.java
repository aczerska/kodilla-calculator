package com.kodilla.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        Book book1 = new Book("Title 1","Author 1", LocalDate.of(2000, 10, 01));
        Book book2 = new Book("Title 2","Author 2", LocalDate.of(1999, 01, 20));
        Book book3 = new Book("Title 3","Author 3", LocalDate.of(1945, 12, 24));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        //Then
        System.out.println(library);
        //When

    }

}
