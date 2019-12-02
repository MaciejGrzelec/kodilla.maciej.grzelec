package com.kodilla.testing.library;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);
        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);
        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        // Then
        assertEquals(0, theListOfBooks10.size());
    }

    @Test
    public void testListBooksInHandsOfNoBorrows() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser userNoBooks = new LibraryUser("FirstName1", "LastName1", "111");
        LibraryUser userOneBook = new LibraryUser("FirstName2", "LastName2", "222");
        LibraryUser userFiveBooks = new LibraryUser("FirstName3", "LastName3", "333");
        List<Book> listNoBooks = generateListOfNBooks(0);
        List<Book> listOneBook = generateListOfNBooks(1);
        List<Book> listFiveBooks = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(userNoBooks)).thenReturn(listNoBooks);
        when(libraryDatabaseMock.listBooksInHandsOf(userOneBook)).thenReturn(listOneBook);
        when(libraryDatabaseMock.listBooksInHandsOf(userFiveBooks)).thenReturn(listFiveBooks);
        // When
        List<Book> listOf0RentedBooks = bookLibrary.listBooksInHandsOf(userNoBooks);
        List<Book> listOf1RentedBooks = bookLibrary.listBooksInHandsOf(userOneBook);
        List<Book> listOf5RentedBooks = bookLibrary.listBooksInHandsOf(userFiveBooks);
        // Then
        assertEquals(0, listOf0RentedBooks.size());
        assertEquals(1, listOf1RentedBooks.size());
        assertEquals(5, listOf5RentedBooks.size());
    }

    @Test
    public void testListBooksInHandsOf0Rented() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user0 = new LibraryUser("user", "zero", "0000");
        LibraryUser user1 = new LibraryUser("user", "one", "0001");
        LibraryUser user5 = new LibraryUser("user", "five", "0005");
        List<Book> returnListOf0RentedBooks = generateListOfNBooks(0);
        List<Book> returnListOf1RentedBooks = generateListOfNBooks(1);
        List<Book> returnListOf5RentedBooks = generateListOfNBooks(5);
        System.out.println(returnListOf0RentedBooks.size());
        System.out.println(returnListOf1RentedBooks.size());
        System.out.println(returnListOf5RentedBooks.size());
        when(libraryDatabaseMock.listBooksInHandsOf(user0)).thenReturn(returnListOf0RentedBooks);
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(returnListOf1RentedBooks);
        when(libraryDatabaseMock.listBooksInHandsOf(user5)).thenReturn(returnListOf5RentedBooks);

        //When
        List<Book> listOf0RentedBooks = bookLibrary.listBooksInHandsOf(user0);
        List<Book> listOf1RentedBooks = bookLibrary.listBooksInHandsOf(user1);
        List<Book> listOf5RentedBooks = bookLibrary.listBooksInHandsOf(user5);

        //Then
        assertEquals(0, listOf0RentedBooks.size());
        //assertEquals(1,listOf1RentedBooks.size());
        //assertEquals(5,listOf5RentedBooks.size());
    }

    @Test
    public void testListBooksInHandsOf1Rented() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user0 = new LibraryUser("user", "zero", "0000");
        LibraryUser user1 = new LibraryUser("user", "one", "0001");
        LibraryUser user5 = new LibraryUser("user", "five", "0005");
        List<Book> returnListOf0RentedBooks = generateListOfNBooks(0);
        List<Book> returnListOf1RentedBooks = generateListOfNBooks(1);
        List<Book> returnListOf5RentedBooks = generateListOfNBooks(5);
        System.out.println(returnListOf0RentedBooks.size());
        System.out.println(returnListOf1RentedBooks.size());
        System.out.println(returnListOf5RentedBooks.size());
        when(libraryDatabaseMock.listBooksInHandsOf(user0)).thenReturn(returnListOf0RentedBooks);
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(returnListOf1RentedBooks);
        when(libraryDatabaseMock.listBooksInHandsOf(user5)).thenReturn(returnListOf5RentedBooks);

        //When
        List<Book> listOf0RentedBooks = bookLibrary.listBooksInHandsOf(user0);
        List<Book> listOf1RentedBooks = bookLibrary.listBooksInHandsOf(user1);
        List<Book> listOf5RentedBooks = bookLibrary.listBooksInHandsOf(user5);

        //Then
        assertEquals(0, listOf0RentedBooks.size());
        assertEquals(1, listOf1RentedBooks.size());
        assertEquals(5, listOf5RentedBooks.size());
    }
}


