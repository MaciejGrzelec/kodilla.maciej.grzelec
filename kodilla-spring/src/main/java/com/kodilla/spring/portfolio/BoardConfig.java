package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    /*@Autowired
    @Qualifier("toDoList")
    TaskList taskList;
*/
    /*@Bean
    public Board getBoard(){
        return new Board();
    }*/

    @Bean(name = "toDoList")
    //@Scope("prototype")
    public TaskList addTaskToToDoList(Board board){
        TaskList toDoList = new TaskList();
        toDoList.getTasks().add("To Do List task");
        // board.setToDoList(toDoList);
        return toDoList;
    }

    @Bean(name = "doneList")
    //@Scope("prototype")
    //@Conditional(AlwaysTrueCondition.class)
    public TaskList addTaskToDoneList(Board board){
        TaskList doneList = new TaskList();
        doneList.getTasks().add("Done List task");
        //board.setDoneList(doneList);
        return doneList;
    }

    @Bean(name = "inProgressList")
    //@Scope("prototype")
    //@Conditional(AlwaysTrueCondition.class)
    public TaskList addTaskToInProgressList(Board board){
        TaskList inProgressList = new TaskList();
        inProgressList.getTasks().add("In Progress task");
        //board.setInProgressList(inProgressList);
        return inProgressList;
    }


}
