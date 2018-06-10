package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        BookA bookA1 = new BookA("author1", "title1", 2000, "signature1");
        BookA bookA2 = new BookA("author2", "title2", 2010, "signature2");
        BookA bookA3 = new BookA("author3", "title3", 1987, "signature3");
        BookA bookA4 = new BookA("author4", "title4", 1996, "signature4");
        Set<BookA> bookASet = new HashSet<>();
        bookASet.add(bookA1);
        bookASet.add(bookA2);
        bookASet.add(bookA3);
        bookASet.add(bookA4);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int result = medianAdapter.publicationYearMedian(bookASet);
        System.out.println(result);
        //Then
        assertEquals(2000, result);
    }
}
