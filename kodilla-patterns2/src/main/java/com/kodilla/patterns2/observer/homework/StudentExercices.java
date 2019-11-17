package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentExercices implements ObservableWork{
    private final String name;
    private final List<String> exercises;
    private final List<Mentor> mentors;

    public StudentExercices(String name) {
        this.name = name;
        exercises = new ArrayList<>();
        mentors = new ArrayList<>();
    }

    public void addExercise(String exercise) {
        exercises.add(exercise);
        notifyMentor();
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void removeMentor(Mentor mentor) {
        mentors.remove(mentor);
    }

    public void notifyMentor(){
        for (Mentor mentor : mentors) {
            mentor.check(this);
        }
    }

    public List<String> getExercises() {
        return exercises;
    }
}
