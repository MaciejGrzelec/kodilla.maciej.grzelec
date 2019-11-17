package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class StudentHomeworkTestSuite {
    @Test
    public void testStudentHomeworkTestSuite() {
        //Given
        StudentExercices student1 = new Student1();
        StudentExercices student2 = new Student2();
        MentorFactory mentor1 = new MentorFactory("Mentor1");
        MentorFactory mentor2 = new MentorFactory("Mentor2");
        student1.addMentor(mentor1);
        student1.addMentor(mentor2);
        student2.addMentor(mentor2);
        //When
        student1.addExercise("Ex11");
        student1.addExercise("Ex12");
        student1.addExercise("Ex13");
        student2.addExercise("Ex21");
        student2.addExercise("Ex22");
        //Then
        Assert.assertEquals(3, mentor1.getUpdateCount());
        Assert.assertEquals(5, mentor2.getUpdateCount());
    }
}
