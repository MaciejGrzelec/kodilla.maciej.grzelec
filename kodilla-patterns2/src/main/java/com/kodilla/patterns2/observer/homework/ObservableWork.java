package com.kodilla.patterns2.observer.homework;

public interface ObservableWork {
    void addMentor(Mentor mentor);
    void removeMentor(Mentor mentor);
    void notifyMentor();
}
