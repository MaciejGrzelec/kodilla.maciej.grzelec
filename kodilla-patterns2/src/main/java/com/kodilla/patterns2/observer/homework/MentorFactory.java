package com.kodilla.patterns2.observer.homework;

public class MentorFactory implements Mentor{
    private final String name;
    private int updateCount;

    public MentorFactory(String name) {
        this.name = name;
    }

    @Override
    public void check(StudentExercices studentExercices) {
        System.out.println("Exercises left: " + studentExercices.getExercises().size());
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
