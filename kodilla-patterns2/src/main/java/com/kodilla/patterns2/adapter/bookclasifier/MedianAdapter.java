package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        for (com.kodilla.patterns2.adapter.bookclasifier.librarya.Book book : bookSet) {
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book temporaryBook = new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear());
            BookSignature temporarySignature = new BookSignature(book.getSignature());
            books.put(temporarySignature, temporaryBook);
        }
        return averagePublicationYear(books);
    }
}
