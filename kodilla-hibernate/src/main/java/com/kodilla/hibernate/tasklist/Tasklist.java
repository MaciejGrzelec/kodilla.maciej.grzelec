package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name="TASKLISTS")
@Entity
public class TaskList {
    int id;
    String listName;
    String description;
    List<Task> tasks = new ArrayList<>();

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    public TaskList() {
    }

    @Id
    @GeneratedValue
    @Column(name="ID")
    public int getId() {
        return id;
    }

    @Column(name="LISTNAME")
    public String getListName() {
        return listName;
    }

    @Column(name="DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @OneToMany(targetEntity = Task.class, mappedBy = "taskList", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Task> getTasks() {
        return tasks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
