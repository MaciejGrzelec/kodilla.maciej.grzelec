package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        String doneListTask = "Done task";
        String toDoListTask = "To do Task";
        String inProgressTask = "In progress Task";
        //When
        board.getToDoList().getTasks().add(toDoListTask);
        board.getInProgressList().getTasks().add(inProgressTask);
        board.getDoneList().getTasks().add(doneListTask);
        System.out.println(board.getToDoList().getTasks().get(1));
        System.out.println(board.getInProgressList().getTasks().get(1));
        System.out.println(board.getDoneList().getTasks().get(1));
        //Then
        Assert.assertTrue(board.getToDoList().getTasks().contains("To do Task"));
        Assert.assertEquals("To do Task", board.getToDoList().getTasks().get(1));
        Assert.assertTrue(board.getInProgressList().getTasks().contains("In progress Task"));
        Assert.assertEquals("In progress Task", board.getInProgressList().getTasks().get(1));
        Assert.assertTrue(board.getDoneList().getTasks().contains("Done task"));
        Assert.assertEquals("Done task", board.getDoneList().getTasks().get(1));
    }
}
