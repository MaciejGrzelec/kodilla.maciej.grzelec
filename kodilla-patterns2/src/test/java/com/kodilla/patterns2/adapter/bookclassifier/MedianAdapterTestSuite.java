package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdaptee;
import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("author1", "title1", 3, "signature1");
        Book book2 = new Book("author2", "title2", 3, "signature2");
        Book book3 = new Book("author3", "title3", 5, "signature3");
        Book book4 = new Book("author4", "title4", 5, "signature4");
        Book book5 = new Book("author5", "title5", 5, "signature5");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int medianResult = medianAdapter.publicationYearMedian(bookSet);
        //Then
        Assert.assertEquals(4, medianResult);
        System.out.println(medianResult);
    }
}
