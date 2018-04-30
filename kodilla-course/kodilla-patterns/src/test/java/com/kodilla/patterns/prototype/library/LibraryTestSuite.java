package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        library.getBooks().add(new Book("Title 1","Author 1", LocalDate.of(2000, 10, 01)));
        library.getBooks().add(new Book("Title 2","Author 2", LocalDate.of(1999, 01, 20)));
        library.getBooks().add(new Book("Title 3","Author 3", LocalDate.of(1945, 12, 24)));

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(library);
        System.out.println(deepClonedLibrary);

        //When
        deepClonedLibrary.getBooks().add(new Book("Title 4","Author 4", LocalDate.of(1991, 01, 01)));

        //Then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());

        System.out.println(library);
        System.out.println(deepClonedLibrary);

    }

}
