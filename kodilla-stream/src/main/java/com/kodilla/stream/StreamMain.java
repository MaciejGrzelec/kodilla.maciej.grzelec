package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.book.BookDirectory;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate todaySubstractTwentyYears = today.minusYears(20);
        Forum forum = new Forum();
        Map<Integer, ForumUser> usersMap = forum.getUserList().stream()
                .filter(s->s.getSex()=='M')
                .filter(s->s.getDateOfBirth().isBefore(todaySubstractTwentyYears))
                .filter(s->s.getPostsQuantity()>=1)
                .collect(Collectors.toMap(ForumUser::getUserId,s->s));

        System.out.println("elements:" + usersMap.size());
        usersMap.entrySet().stream()
                .map(entry->entry.getKey() + entry.getValue().toString())
                .forEach(System.out::println);


        /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

            expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
            expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
            expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
            expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("text", text -> text.toUpperCase());

        System.out.println(text);
        poemBeautifier.beautify("text", text -> "ABC" + text);
        poemBeautifier.beautify("text", text -> text + "ABC");
        poemBeautifier.beautify("text", text -> text.replace("t", "EE"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

       BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/

    }
}

