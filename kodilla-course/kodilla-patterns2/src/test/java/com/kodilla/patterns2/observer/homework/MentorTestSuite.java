package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TaskQueue user1Tasks = new User1TaskQueue();
        TaskQueue user2Tasks = new User2TaskQueue();
        TaskQueue user3Tasks = new User3TaskQueue();
        Mentor mentor1 = new Mentor1();
        Mentor mentor2 = new Mentor2();
        user1Tasks.registerObserver(mentor1);
        user2Tasks.registerObserver(mentor1);
        user3Tasks.registerObserver(mentor2);
        //When
        user1Tasks.addNewTask("REST API task");
        user1Tasks.addNewTask("Hibernate task");
        user1Tasks.addNewTask("Lambda expressions task");
        user2Tasks.addNewTask("Stream task");
        user2Tasks.addNewTask("Spring5 task");
        user3Tasks.addNewTask("MySQL db task");
        user3Tasks.addNewTask("Design patterns");
        //Then
        assertEquals(5, mentor1.getCounter());
        assertEquals(2, mentor2.getCounter());
    }
}
